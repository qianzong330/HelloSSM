package com.zkyt.dga.pojo;

public class TbBaseBuilding {
    private Integer id;

    private String buildname;

    private String address;

    private String lng;

    private String lat;

    private Integer units;//户数或房间

    private Integer iscomplete;
    private Integer unitcount;//单元数
    private Integer floors;//楼层数

    public Integer getUnitcount() {
		return unitcount;
	}

	public void setUnitcount(Integer unitcount) {
		this.unitcount = unitcount;
	}
	

	public Integer getFloors() {
		return floors;
	}

	public void setFloors(Integer floors) {
		this.floors = floors;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuildname() {
        return buildname;
    }

    public void setBuildname(String buildname) {
        this.buildname = buildname == null ? null : buildname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Integer getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(Integer iscomplete) {
        this.iscomplete = iscomplete;
    }
    

	@Override
	public String toString() {
		return "TbBaseBuilding [id=" + id + ", buildname=" + buildname
				+ ", address=" + address + ", lng=" + lng + ", lat=" + lat
				+ ", units=" + units + ", iscomplete=" + iscomplete
				+ ", unitcount=" + unitcount + "]";
	}
 
	
}