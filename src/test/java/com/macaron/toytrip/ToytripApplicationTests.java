package com.macaron.toytrip;

import com.macaron.toytrip.dto.AirPlaneInfo;
import com.macaron.toytrip.service.AirPlaneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ToytripApplication.class)
public class ToytripApplicationTests {


    @Autowired
    private AirPlaneService airPlaneService;


    @Test
    public void contextLoads() {

        final List<AirPlaneInfo> res = airPlaneService.res();

        for (AirPlaneInfo re : res) {
            System.out.println(re);
        }

    }

}
