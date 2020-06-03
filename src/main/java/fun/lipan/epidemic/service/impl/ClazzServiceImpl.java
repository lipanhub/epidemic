package fun.lipan.epidemic.service.impl;

import fun.lipan.epidemic.dao.ClazzDao;
import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 13:40
 */
@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzDao clazzDao;
    @Override
    public List<Clazz> findAll(){
        return clazzDao.findAll();
    }
}
