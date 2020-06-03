package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user where username = #{username}")
    User findByAccount(String username);

    @Insert("insert into user(username,password,name,home,phone,clazz_id,role_id) " +
            "values(#{username},#{password},#{name},#{home},#{phone},#{clazzId},#{roleId})" )
    void addOne(User user);

    @Select("select * from user where id = #{id}")
    User findById(Long id);

    @Select("select * from user where clazz_id = #{clazzId}")

    List<User> findByClazzId(Long clazzId);
    @Select("select * from user where clazz_id = #{clazzId} and role_id=1")
    List<User> findStudentByClazzId(Long clazzId);
}
