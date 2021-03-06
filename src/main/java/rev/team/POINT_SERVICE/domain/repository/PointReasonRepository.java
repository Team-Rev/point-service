package rev.team.POINT_SERVICE.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rev.team.POINT_SERVICE.domain.entity.PointReason;

@Repository
public interface PointReasonRepository extends JpaRepository<PointReason, Long> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE point_reason SET reason = :reason, point = :point WHERE (point_reason_id = :id);", nativeQuery = true)
    void updateById(Long id, String reason, int point);

    PointReason findByPointReasonId(long pointReasonId);

}