package rev.team.POINT_SERVICE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rev.team.POINT_SERVICE.domain.entity.PointDTO;
import rev.team.POINT_SERVICE.domain.entity.PointReason;
import rev.team.POINT_SERVICE.domain.repository.PointHistoryRepository;
import rev.team.POINT_SERVICE.domain.repository.PointReasonRepository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class PointReasonService {

    PointReasonRepository pointReasonRepository;
    PointHistoryRepository pointHistoryRepository;

    @Autowired
    public PointReasonService(PointReasonRepository pointReasonRepository, PointHistoryRepository pointHistoryRepository) {
        this.pointReasonRepository = pointReasonRepository;
        this.pointHistoryRepository = pointHistoryRepository;
    }

    public List<PointReason> getPointReason() {
        List<PointReason> pointReasons = pointReasonRepository.findAll();
        List<PointReason> pointReasonList = new ArrayList<>();

        for (PointReason pointReason : pointReasons) {
            PointReason reason = PointReason.builder()
                    .pointReasonId(pointReason.getPointReasonId())
                    .point(pointReason.getPoint())
                    .pointReason(pointReason.getPointReason())
                    .build();
            pointReasonList.add(reason);
        }
        return pointReasonList;
    }

    public String insert(PointDTO pointDTO) {
        pointReasonRepository.save(PointReason.builder()
        .pointReason(pointDTO.getPointReason())
        .point(pointDTO.getPoint())
        .build());
        return "CREATE SUCCESS";
    }

    public String delete(Long id) {
        if (!pointHistoryRepository.findById(id).isEmpty()) {
            pointHistoryRepository.deleteById(id);
        }
        pointReasonRepository.deleteById(id);
        return "DELETE SUCCESS";
    }

    public String update(Long id, PointDTO pointDTO) {
        if (!pointHistoryRepository.findById(id).isEmpty()) {
            pointHistoryRepository.updateById(id, pointDTO.getPointReason(), pointDTO.getPoint());
        }
        pointReasonRepository.updateById(id, pointDTO.getPointReason(), pointDTO.getPoint());
        return "UPDATE SUCCESS";
    }

}