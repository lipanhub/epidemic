package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from user where id = #{id}")
    User findById(String id);
}
