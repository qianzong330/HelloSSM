package com.zkyt.dga.pojo;

import java.util.Date;

public class TbBaseCase {
    private Long id;

    private Integer type;

    private String districtcode;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDistrictcode() {
        return districtcode;
    }

    public void setDistrictcode(String districtcode) {
        this.districtcode = districtcode == null ? null : districtcode.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}