package com.macaron.toytrip.controller;

import com.macaron.toytrip.domain.dto.AirPlaneInfo;
import com.macaron.toytrip.domain.dto.ApiResult;
import com.macaron.toytrip.service.AirPlaneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.util.List;

@RestController
@RequestMapping("/air")
public class AirPlaneController {

    private AirPlaneService apService;

    public AirPlaneController(AirPlaneService apService) {
        this.apService = apService;
    }

    @GetMapping("/data")
    public ResponseEntity<ApiResult<List<AirPlaneInfo>>> res() {
        ApiResult apires = new ApiResult();
        apires.setCode(HttpStatus.OK.value());
        apires.setBody(apService.res());
        apires.setTime(OffsetDateTime.now());

        return ResponseEntity.ok(apires);

    }
}
