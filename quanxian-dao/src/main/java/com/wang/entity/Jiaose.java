package com.wang.entity;

/**
 * 
 * @author wangguangjun
 */
public class Jiaose {
	/**
	 *  角色ID
	 */
	private Integer jsid;
	/**
	 *  角色名称
	 */
	private String jsname;
	/**
	 * 角色ID
	 * @param jsid
	 */
	public void setJsid(Integer jsid){
		this.jsid = jsid;
	}
	
    /**
     * 角色ID
     * @return
     */	
    public Integer getJsid(){
    	return jsid;
    }
	/**
	 * 角色名称
	 * @param jsname
	 */
	public void setJsname(String jsname){
		this.jsname = jsname;
	}
	
    /**
     * 角色名称
     * @return
     */	
    public String getJsname(){
    	return jsname;
    }
}