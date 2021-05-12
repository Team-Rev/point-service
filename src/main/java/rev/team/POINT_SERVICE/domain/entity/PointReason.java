package rev.team.POINT_SERVICE.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PointReason {

    @Id
    private Long pointReasonId;

    @NonNull
    private String reason;

    @NonNull
    private int point;
}