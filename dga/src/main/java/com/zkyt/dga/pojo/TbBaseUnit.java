package com.zkyt.dga.pojo;

public class TbBaseUnit {
    private Integer id;

    private String unitname;

    private String unittelephone;

    private String unitadddress;

    private String businesslicenseno;

    private String legalname;

    private String legaltelephone;

    private String legalidcard;

    private String actualoperator;

    private String industrycategory;

    private String businessscope;

    private String startlicense;

    private String endlicense;

    private String taxno;
    private Integer unitno;//单元号
    private Integer floorno;//楼层号
    private double area;
    private Integer buildid;
    
    

    public Integer getBuildid() {
		return buildid;
	}

	public void setBuildid(Integer buildid) {
		this.buildid = buildid;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Integer getUnitno() {
		return unitno;
	}

	public void setUnitno(Integer unitno) {
		this.unitno = unitno;
	}

	public Integer getFloorno() {
		return floorno;
	}

	public void setFloorno(Integer floorno) {
		this.floorno = floorno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getUnittelephone() {
        return unittelephone;
    }

    public void setUnittelephone(String unittelephone) {
        this.unittelephone = unittelephone == null ? null : unittelephone.trim();
    }

    public String getUnitadddress() {
        return unitadddress;
    }

    public void setUnitadddress(String unitadddress) {
        this.unitadddress = unitadddress == null ? null : unitadddress.trim();
    }

    public String getBusinesslicenseno() {
        return businesslicenseno;
    }

    public void setBusinesslicenseno(String businesslicenseno) {
        this.businesslicenseno = businesslicenseno == null ? null : businesslicenseno.trim();
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname == null ? null : legalname.trim();
    }

    public String getLegaltelephone() {
        return legaltelephone;
    }

    public void setLegaltelephone(String legaltelephone) {
        this.legaltelephone = legaltelephone == null ? null : legaltelephone.trim();
    }

    public String getLegalidcard() {
        return legalidcard;
    }

    public void setLegalidcard(String legalidcard) {
        this.legalidcard = legalidcard == null ? null : legalidcard.trim();
    }

    public String getActualoperator() {
        return actualoperator;
    }

    public void setActualoperator(String actualoperator) {
        this.actualoperator = actualoperator == null ? null : actualoperator.trim();
    }

    public String getIndustrycategory() {
        return industrycategory;
    }

    public void setIndustrycategory(String industrycategory) {
        this.industrycategory = industrycategory == null ? null : industrycategory.trim();
    }

    public String getBusinessscope() {
        return businessscope;
    }

    public void setBusinessscope(String businessscope) {
        this.businessscope = businessscope == null ? null : businessscope.trim();
    }

    public String getStartlicense() {
        return startlicense;
    }

    public void setStartlicense(String startlicense) {
        this.startlicense = startlicense == null ? null : startlicense.trim();
    }

    public String getEndlicense() {
        return endlicense;
    }

    public void setEndlicense(String endlicense) {
        this.endlicense = endlicense == null ? null : endlicense.trim();
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno == null ? null : taxno.trim();
    }
}