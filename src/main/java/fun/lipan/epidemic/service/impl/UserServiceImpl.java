package fun.lipan.epidemic.service.impl;


import fun.lipan.epidemic.dao.RoleDao;
import fun.lipan.epidemic.dao.UserDao;
import fun.lipan.epidemic.entity.Role;
import fun.lipan.epidemic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.findByAccount(username);
        if(null == user){
            return null;
        }
        Role role = roleDao.findById(user.getRoleId());
        user.setRole(role.getRoleName());
        return user;
    }

    public void addOne(User user) {
        userDao.addOne(user);
    }
}
