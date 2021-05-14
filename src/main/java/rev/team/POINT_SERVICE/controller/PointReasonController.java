package rev.team.POINT_SERVICE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rev.team.POINT_SERVICE.domain.entity.PointDTO;
import rev.team.POINT_SERVICE.domain.entity.PointReason;
import rev.team.POINT_SERVICE.service.PointReasonService;

import java.util.List;

@RestController
public class PointReasonController {

    PointReasonService pointReasonService;

    @Autowired
    public PointReasonController(PointReasonService pointReasonService) {
        this.pointReasonService = pointReasonService;
    }

    @GetMapping("/reasonList")
    public List<PointReason> getPointReason() {
        return pointReasonService.getPointReason();
    }


    // TODO: 삽입
    // 새 내용만 전달 받음
    @PostMapping("/create")
    public String insertPointReason(@RequestBody PointDTO pointDTO) {
        return pointReasonService.insert(pointDTO);
    }

    // TODO: 삭제
    // 삭제 할 포인트 사유의 아이디를 전달 받음
    @DeleteMapping("/delete/{id}")
    public String deletePointReason(@PathVariable("id") Long id) {
        return pointReasonService.delete(id);
    }

    // TODO: 수정
    // 수정 할 포인트 사유의 아이디와 수정 내용을 전달 받음
    // 포인트 사유 아이디는 프론트 측에서 수정 못하게 해야되는데 음..
    @PatchMapping("/edit/{id}")
    public String updatePointReason(@PathVariable("id") Long id, @RequestBody PointDTO pointDTO) {
        return pointReasonService.update(id, pointDTO);
    }

}
