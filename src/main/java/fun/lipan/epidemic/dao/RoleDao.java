package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.Role;
import fun.lipan.epidemic.entity.User;
import org.apache.ibatis.annotations.Select;

public interface RoleDao {
    @Select("select * from role where id = #{id}")
    Role findById(Long id);
}
