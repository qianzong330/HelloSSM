package com.zkyt.dga.pojo;

/**
 * 
 * Auth : hanzq
 * Desc : 系统权限实体
 * Time : 2018-1-12 上午8:44:56
 */
public class AuthFunction {
    private String id;

    private String name;

    private String code;

    private String description;

    private String page;

    private String generatemenu;

    private Integer zindex;

    private String pid;
    
    private String pId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getGeneratemenu() {
        return generatemenu;
    }

    public void setGeneratemenu(String generatemenu) {
        this.generatemenu = generatemenu;
    }

    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
    	this.pId=pid;
        this.pid = pid;
    }

	public String getpId() {
		return pId;
	}

	

	
    
}