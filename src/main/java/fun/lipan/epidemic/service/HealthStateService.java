package fun.lipan.epidemic.service;

import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.entity.HealthState;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 19:26
 */
public interface HealthStateService {
    List<HealthState> findAll();
}
