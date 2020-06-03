package fun.lipan.epidemic.service.impl;

import fun.lipan.epidemic.dao.HealthStateDao;
import fun.lipan.epidemic.entity.HealthState;
import fun.lipan.epidemic.service.HealthStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 19:26
 */
@Service
public class HealthStateServiceImpl implements HealthStateService {
    @Autowired
    private HealthStateDao healthStateDao;
    @Override
    public List<HealthState> findAll() {
        return healthStateDao.findAll();
    }
}
