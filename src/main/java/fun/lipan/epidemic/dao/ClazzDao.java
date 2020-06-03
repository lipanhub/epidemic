package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.Clazz;
import fun.lipan.epidemic.entity.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 13:38
 */
public interface ClazzDao {
    @Select("select * from clazz")
    List<Clazz> findAll();

    @Select("select * from clazz where id = #{id}")
    Clazz findById(Long id);
}
