package rev.team.POINT_SERVICE.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rev.team.POINT_SERVICE.domain.entity.PointReason;
import rev.team.POINT_SERVICE.service.PointReasonService;

import java.util.List;

@RestController
public class PointReasonController {

    PointReasonService pointReasonService;

    // TODO: 모두 추출
    @GetMapping("/point/list")
    public List<PointReason> getPointReason() {
        return pointReasonService.getPointReason();
    }

    // TODO: 삽입
    @GetMapping("/point/newReason")
    public String insertPointReason() {
        if (pointReasonService.insertPointReason()) {
            return "SUCCESS";
        } else {
            return "FAIL";
        }
    }


    // TODO: 삭제

    // TODO: 수정

}
