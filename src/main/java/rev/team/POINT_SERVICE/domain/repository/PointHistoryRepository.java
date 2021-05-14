package rev.team.POINT_SERVICE.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import rev.team.POINT_SERVICE.domain.entity.PointHistory;

@Repository
public interface PointHistoryRepository extends JpaRepository<PointHistory, Long> {

    @Modifying
    @Query(value = "UPDATE 'rev_problem','point_history' SET 'point_reason' = :reason, 'point' = :point" +
            "WHERE ('point_reason_id' = :id);", nativeQuery = true)
    void updateById(Long id, String reason, int point);
}