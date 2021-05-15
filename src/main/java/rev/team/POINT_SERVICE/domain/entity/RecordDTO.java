package rev.team.POINT_SERVICE.domain.entity;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecordDTO {

    private String userId;

    private PointReason pointReasonId;

}
