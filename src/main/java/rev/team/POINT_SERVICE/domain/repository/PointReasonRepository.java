package rev.team.POINT_SERVICE.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rev.team.POINT_SERVICE.domain.entity.PointDTO;
import rev.team.POINT_SERVICE.domain.entity.PointReason;

@Repository
public interface PointReasonRepository extends JpaRepository<PointReason, Long> {

    @Modifying
    @Query(value = "UPDATE 'rev_problem','point_reason' SET 'point_reason' = :reason, 'point' = :point" +
            "WHERE ('point_reason_id' = :id);", nativeQuery = true)
    void updateById(Long id, String reason, int point);

    @Modifying
    //@Query(value = "INSERT INTO ")
    void save(PointDTO pointDTO);
}