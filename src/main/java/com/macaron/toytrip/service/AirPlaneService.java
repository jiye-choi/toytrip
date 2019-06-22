package com.macaron.toytrip.service;

import com.macaron.toytrip.domain.dto.AirPlaneInfo;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.List;

@Service
public class AirPlaneService {
    public List<AirPlaneInfo> res() {
        // 진에어
        // 2019-08-21 (수) 08:20 ~ 11:00
        // 2019-08-26 (월) 12:30 ~ 15:35
        // 174,900원
        AirPlaneInfo apinfo = new AirPlaneInfo();
        apinfo.setId(1);

        apinfo.setDepAirline("진에어");
        apinfo.setDepTime1(OffsetDateTime.of(2019, 8, 21, 8, 20, 0, 0, ZoneOffset.of("+09:00")));
        apinfo.setDepTime2(OffsetDateTime.of(2019, 8, 21, 11, 0, 0, 0, ZoneOffset.of("+09:00")));

        apinfo.setArrAirline("진에어");
        apinfo.setArrTime1(OffsetDateTime.of(2019, 8, 26, 12, 30, 0, 0, ZoneOffset.of("+09:00")));
        apinfo.setArrTime2(OffsetDateTime.of(2019, 8, 26, 15, 35, 0, 0, ZoneOffset.of("+09:00")));

        apinfo.setPrice(174900);

        return Arrays.asList(apinfo);
    }


}
