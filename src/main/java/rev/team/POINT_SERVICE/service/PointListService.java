package rev.team.POINT_SERVICE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rev.team.POINT_SERVICE.domain.repository.PointListRepository;

@Service
public class PointListService {

    PointListRepository pointListRepository;

    @Autowired
    public PointListService(PointListRepository pointListRepository) {
        this.pointListRepository = pointListRepository;
    }


}
