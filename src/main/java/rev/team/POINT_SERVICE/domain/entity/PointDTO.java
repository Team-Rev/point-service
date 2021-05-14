package rev.team.POINT_SERVICE.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PointDTO {

    private int point;

    private String pointReason;
}
