package fun.lipan.epidemic.service;


import fun.lipan.epidemic.dao.UserDao;
import fun.lipan.epidemic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User findById(String id){
        return userDao.findById(id);
    }
}
