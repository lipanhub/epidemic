package fun.lipan.epidemic.entity;

import lombok.Data;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/2 19:24
 */
@Data
public class HealthState {
    private Long id;
    private String state;
    private String description;
}
