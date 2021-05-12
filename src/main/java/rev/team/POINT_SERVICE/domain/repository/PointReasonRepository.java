package rev.team.POINT_SERVICE.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rev.team.POINT_SERVICE.domain.entity.PointReason;

@Repository
public interface PointReasonRepository extends JpaRepository<PointReason, Long> {
}