package rev.team.POINT_SERVICE.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class PointHistory {

    @Id
    private Long pointListId;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // n:1 관계
    @JoinColumn(name = "pointReasonId") // 참조키
    private PointReason pointListReasonId;

    @NonNull
    private String userId;

    @NonNull
    private LocalDateTime pointDate;
}