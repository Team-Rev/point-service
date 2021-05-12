package rev.team.POINT_SERVICE.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rev.team.POINT_SERVICE.domain.entity.PointList;

@Repository
public interface PointListRepository extends JpaRepository<PointList, Integer> {
}
