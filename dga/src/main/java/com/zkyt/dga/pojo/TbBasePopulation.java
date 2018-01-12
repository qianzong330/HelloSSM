package com.zkyt.dga.pojo;

public class TbBasePopulation {
    private Integer id;

    private String name;

    private String sex;

    private String idcard;

    private String birthday;

    private String nation;

    private String detailaddress;

    private String maritastatus;

    private String type;

    private String professional;

    private String issettle;

    private String registdate;

    private String tempaddress;

    private String isoverseaperson;

    private String entrydate;

    private String entryport;

    private Integer houseid;
    private Integer unitid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getMaritastatus() {
        return maritastatus;
    }

    public void setMaritastatus(String maritastatus) {
        this.maritastatus = maritastatus == null ? null : maritastatus.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getIssettle() {
        return issettle;
    }

    public void setIssettle(String issettle) {
        this.issettle = issettle == null ? null : issettle.trim();
    }

    public String getRegistdate() {
        return registdate;
    }

    public void setRegistdate(String registdate) {
        this.registdate = registdate == null ? null : registdate.trim();
    }

    public String getTempaddress() {
        return tempaddress;
    }

    public void setTempaddress(String tempaddress) {
        this.tempaddress = tempaddress == null ? null : tempaddress.trim();
    }

    public String getIsoverseaperson() {
        return isoverseaperson;
    }

    public void setIsoverseaperson(String isoverseaperson) {
        this.isoverseaperson = isoverseaperson == null ? null : isoverseaperson.trim();
    }

    public String getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(String entrydate) {
        this.entrydate = entrydate == null ? null : entrydate.trim();
    }

    public String getEntryport() {
        return entryport;
    }

    public void setEntryport(String entryport) {
        this.entryport = entryport == null ? null : entryport.trim();
    }

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Integer getUnitid() {
		return unitid;
	}

	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}
	

    
}