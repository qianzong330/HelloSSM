package com.zkyt.dga.pojo;

public class TbBaseHouse {
    private Integer id;

    private String name;

    private String type;

    private String istowncountry;

    private String buildpropertie;

    private String unitno;

    private String maxfloor;

    private String unitcount;

    private String floorno;

    private String mallfloorno;

    private String shopperfloor;

    private String mallno;

    private String numofbasefloor;

    private String countofbasefloor;

    private String monitorcount;

    private String monitornature;

    private String isnet;

    private Integer buildId;
    private Integer houseno;
    private Integer peopleno;
    private double area;
    

    

    public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Integer getPeopleno() {
		return peopleno;
	}

	public void setPeopleno(Integer peopleno) {
		this.peopleno = peopleno;
	}

	public Integer getHouseno() {
		return houseno;
	}

	public void setHouseno(Integer houseno) {
		this.houseno = houseno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIstowncountry() {
        return istowncountry;
    }

    public void setIstowncountry(String istowncountry) {
        this.istowncountry = istowncountry == null ? null : istowncountry.trim();
    }

    public String getBuildpropertie() {
        return buildpropertie;
    }

    public void setBuildpropertie(String buildpropertie) {
        this.buildpropertie = buildpropertie == null ? null : buildpropertie.trim();
    }

    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno == null ? null : unitno.trim();
    }

    public String getMaxfloor() {
        return maxfloor;
    }

    public void setMaxfloor(String maxfloor) {
        this.maxfloor = maxfloor == null ? null : maxfloor.trim();
    }

    public String getUnitcount() {
        return unitcount;
    }

    public void setUnitcount(String unitcount) {
        this.unitcount = unitcount == null ? null : unitcount.trim();
    }

    public String getFloorno() {
        return floorno;
    }

    public void setFloorno(String floorno) {
        this.floorno = floorno == null ? null : floorno.trim();
    }

    public String getMallfloorno() {
        return mallfloorno;
    }

    public void setMallfloorno(String mallfloorno) {
        this.mallfloorno = mallfloorno == null ? null : mallfloorno.trim();
    }

    public String getShopperfloor() {
        return shopperfloor;
    }

    public void setShopperfloor(String shopperfloor) {
        this.shopperfloor = shopperfloor == null ? null : shopperfloor.trim();
    }

    public String getMallno() {
        return mallno;
    }

    public void setMallno(String mallno) {
        this.mallno = mallno == null ? null : mallno.trim();
    }

    public String getNumofbasefloor() {
        return numofbasefloor;
    }

    public void setNumofbasefloor(String numofbasefloor) {
        this.numofbasefloor = numofbasefloor == null ? null : numofbasefloor.trim();
    }

    public String getCountofbasefloor() {
        return countofbasefloor;
    }

    public void setCountofbasefloor(String countofbasefloor) {
        this.countofbasefloor = countofbasefloor == null ? null : countofbasefloor.trim();
    }

    public String getMonitorcount() {
        return monitorcount;
    }

    public void setMonitorcount(String monitorcount) {
        this.monitorcount = monitorcount == null ? null : monitorcount.trim();
    }

    public String getMonitornature() {
        return monitornature;
    }

    public void setMonitornature(String monitornature) {
        this.monitornature = monitornature == null ? null : monitornature.trim();
    }

    public String getIsnet() {
        return isnet;
    }

    public void setIsnet(String isnet) {
        this.isnet = isnet == null ? null : isnet.trim();
    }

	public Integer getBuildId() {
		return buildId;
	}

	public void setBuildId(Integer buildId) {
		this.buildId = buildId;
	}

    
}