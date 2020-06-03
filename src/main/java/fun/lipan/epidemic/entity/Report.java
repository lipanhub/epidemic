package fun.lipan.epidemic.entity;

import lombok.Data;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 20:13
 */
@Data
public class Report {
    private Long id;
    private Long studentId;
    private Long healthState;
    private String remark;
    private Long gmtCreate;
    private Long gmtModified;
}
