package fun.lipan.epidemic.dto;

import lombok.Data;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 20:13
 */
@Data
public class ReportDto {
    private Long id;
    private String account;
    private String clazzName;
    private String name;
    private String healthStateTitle;
    private Long healthState;
    private String phone;
    private String remark;
    private Long gmtModified;
    private Long gmtCreate;
}
