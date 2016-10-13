package com.wang.entity;

/**
 * 
 * @author wangguangjun
 */
public class Juesemodel {
	/**
	 *  角色模块对应表的角色ID
	 */
	private Integer jsid;
	/**
	 *  角色模块对应表的模块ID
	 */
	private Integer modelid;
	/**
	 *  对应关系表id
	 */
	private Integer jsmodelid;
	/**
	 * 角色模块对应表的角色ID
	 * @param jsid
	 */
	public void setJsid(Integer jsid){
		this.jsid = jsid;
	}
	
    /**
     * 角色模块对应表的角色ID
     * @return
     */	
    public Integer getJsid(){
    	return jsid;
    }
	/**
	 * 角色模块对应表的模块ID
	 * @param modelid
	 */
	public void setModelid(Integer modelid){
		this.modelid = modelid;
	}
	
    /**
     * 角色模块对应表的模块ID
     * @return
     */	
    public Integer getModelid(){
    	return modelid;
    }
	/**
	 * 对应关系表id
	 * @param jsmodelid
	 */
	public void setJsmodelid(Integer jsmodelid){
		this.jsmodelid = jsmodelid;
	}
	
    /**
     * 对应关系表id
     * @return
     */	
    public Integer getJsmodelid(){
    	return jsmodelid;
    }
}