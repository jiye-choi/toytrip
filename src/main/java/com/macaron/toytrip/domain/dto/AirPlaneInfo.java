package com.macaron.toytrip.domain.dto;

import java.time.OffsetDateTime;

public class AirPlaneInfo {

    private int id;
    private String depAirline;
    private String arrAirline;
    private OffsetDateTime depTime1;
    private OffsetDateTime depTime2;
    private OffsetDateTime arrTime1;
    private OffsetDateTime arrTime2;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepAirline() {
        return depAirline;
    }

    public void setDepAirline(String depAirline) {
        this.depAirline = depAirline;
    }

    public String getArrAirline() {
        return arrAirline;
    }

    public void setArrAirline(String arrAirline) {
        this.arrAirline = arrAirline;
    }

    public OffsetDateTime getDepTime1() {
        return depTime1;
    }

    public void setDepTime1(OffsetDateTime depTime1) {
        this.depTime1 = depTime1;
    }

    public OffsetDateTime getDepTime2() {
        return depTime2;
    }

    public void setDepTime2(OffsetDateTime depTime2) {
        this.depTime2 = depTime2;
    }

    public OffsetDateTime getArrTime1() {
        return arrTime1;
    }

    public void setArrTime1(OffsetDateTime arrTime1) {
        this.arrTime1 = arrTime1;
    }

    public OffsetDateTime getArrTime2() {
        return arrTime2;
    }

    public void setArrTime2(OffsetDateTime arrTime2) {
        this.arrTime2 = arrTime2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
