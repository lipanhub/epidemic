package fun.lipan.epidemic.service;

import fun.lipan.epidemic.dto.ReportDto;
import fun.lipan.epidemic.entity.Report;
import fun.lipan.epidemic.entity.User;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 21:13
 */
public interface ReportService {
    void addOne(Report report);
    List<Report> findAll();
    List<ReportDto> findByStudentId(Long id);
    void delete(Long id);
    Report getById(Long id);
    void update(Report report);
    List<ReportDto> findByUserRole(User user);
}
