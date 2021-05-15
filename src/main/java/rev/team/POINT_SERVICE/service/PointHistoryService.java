package rev.team.POINT_SERVICE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rev.team.POINT_SERVICE.domain.repository.PointHistoryRepository;

@Service
public class PointHistoryService {

    PointHistoryRepository pointListRepository;

    @Autowired
    public PointHistoryService(PointHistoryRepository pointListRepository) {
        this.pointListRepository = pointListRepository;
    }


}
