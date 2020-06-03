package fun.lipan.epidemic.dao;

import fun.lipan.epidemic.entity.Report;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 21:16
 */
public interface ReportDao {

    @Insert("insert into report(health_state,remark,student_id,gmt_create,gmt_modified)" +
            "values(#{healthState},#{remark},#{studentId},#{gmtCreate},#{gmtModified})" )
    void addOne(Report report);

    @Select("select * from report")
    List<Report> findAll();

    @Select("select * from report where student_id = #{studentId}")
    List<Report> findByStudentId(Long studentId);

    @Delete("delete from report where id = #{id}")
    void delete(Long id);

    @Select("select * from report where id = #{id}")
    Report findById(Long id);

    @Update("update report set health_state = #{healthState},remark = #{remark},gmt_modified=#{gmtModified} " +
            "where id = #{id}")
    void update(Report report);
}
