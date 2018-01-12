package com.zkyt.dga.pojo;

public class Function {
    private Integer id;

    private Integer pid;

    private String name;

    private String page;

    private Integer rid;
    private Integer pId;
    private Integer rId;
    

    public Integer getpId() {
    	pId = this.pid;
		return pId;
	}

	public void setpId(Integer pid) {
		this.pId = pid;
	}

	public Integer getrId() {
		rId = this.rid;
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rid;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }
}