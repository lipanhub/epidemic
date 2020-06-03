package fun.lipan.epidemic.service;

import fun.lipan.epidemic.dao.ClazzDao;
import fun.lipan.epidemic.entity.Clazz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 13:40
 */
@Service
public interface ClazzService {
    List<Clazz> findAll();
}
