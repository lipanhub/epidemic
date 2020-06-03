package fun.lipan.epidemic.service.impl;

import fun.lipan.epidemic.dao.ClazzDao;
import fun.lipan.epidemic.dao.HealthStateDao;
import fun.lipan.epidemic.dao.ReportDao;
import fun.lipan.epidemic.dao.UserDao;
import fun.lipan.epidemic.dto.ReportDto;
import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.entity.HealthState;
import fun.lipan.epidemic.entity.Report;
import fun.lipan.epidemic.entity.User;
import fun.lipan.epidemic.service.ReportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 21:14
 */
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportDao reportDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private ClazzDao clazzDao;
    @Autowired
    private HealthStateDao healthStateDao;

    @Override
    public void addOne(Report report) {
        reportDao.addOne(report);
    }

    @Override
    public List<Report> findAll() {
        return reportDao.findAll();
    }

    @Override
    public List<ReportDto> findByStudentId(Long id) {
        List<Report> reports = reportDao.findByStudentId(id);
        return toDto(reports);
    }

    private List<ReportDto> toDto(List<Report> reports) {
        List<ReportDto> reportDtoList = new ArrayList<>();
        for (Report report : reports) {
            ReportDto reportDto = new ReportDto();
            BeanUtils.copyProperties(report, reportDto);
            User student = userDao.findById(report.getStudentId());
            reportDto.setAccount(student.getUsername());
            reportDto.setName(student.getName());
            reportDto.setPhone(student.getPhone());
            Clazz clazz = clazzDao.findById(student.getClazzId());
            reportDto.setClazzName(clazz.getClazzName());
            HealthState healthState = healthStateDao.findById(report.getHealthState());
            reportDto.setHealthStateTitle(healthState.getState());
            reportDtoList.add(reportDto);
        }
        return reportDtoList;
    }

    @Override
    public void delete(Long id) {
        reportDao.delete(id);
    }

    @Override
    public Report getById(Long id) {
        return reportDao.findById(id);
    }

    @Override
    public void update(Report report) {
        report.setGmtModified(System.currentTimeMillis());
        reportDao.update(report);
    }

    @Override
    public List<ReportDto> findByUserRole(User user) {
        List<ReportDto> reportList = new ArrayList<>();
        String curRole = user.getRole();
        if ("ROLE_STUDENT".equals(curRole)) {
            reportList = findByStudentId(user.getId());
        } else if ("ROLE_TEACHER".equals(curRole)) {
            List<User> studentList = userDao.findStudentByClazzId(user.getClazzId());
            for (User student : studentList) {
                reportList.addAll(findByStudentId(student.getId()));
            }
        } else {
            reportList = toDto(reportDao.findAll());
        }
        return reportList;
    }
}
