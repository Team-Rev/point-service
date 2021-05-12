package rev.team.POINT_SERVICE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rev.team.POINT_SERVICE.domain.entity.PointReason;
import rev.team.POINT_SERVICE.domain.repository.PointReasonRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class PointReasonService {

    PointReasonRepository pointReasonRepository;

    @Autowired
    public PointReasonService(PointReasonRepository pointReasonRepository) {
        this.pointReasonRepository = pointReasonRepository;
    }

    public List<PointReason> getPointReason() {
        List<PointReason> pointReasons = pointReasonRepository.findAll();
        List<PointReason> pointReasonList = new ArrayList<>();

        for (PointReason pointReason : pointReasons) {
            PointReason reason = PointReason.builder()
                    .pointReasonId(pointReason.getPointReasonId())
                    .point(pointReason.getPoint())
                    .reason(pointReason.getReason())
                    .build();

            pointReasonList.add(reason);
        }
        return pointReasonList;
    }
}