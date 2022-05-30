package persistence.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString

public class GroupScheduleDTO {
    private static final long serialVersionUID = 1L;
    private int groupScheduleIndex;
    private int groupIndex;
    private String scheduleName;
    private Date startDay;
    private Date endDay;
}

