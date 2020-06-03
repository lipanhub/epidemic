package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.HealthState;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HealthStateDao {
    @Select("select * from health_state")
    List<HealthState> findAll();

    @Select("select * from health_state where id = #{id}")
    HealthState findById(Long id);
}
