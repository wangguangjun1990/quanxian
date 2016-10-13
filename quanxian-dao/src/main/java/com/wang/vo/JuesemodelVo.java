package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class JuesemodelVo {
	/**
	 *  角色模块对应表的角色ID
	 */
	private Integer jsid;
	/**
	 *  角色模块对应表的模块ID
	 */
	private Integer modelid;
	/**
	 * 角色模块对应表的角色ID
	 * @param jsid
	 */
	public void setJsid(Integer jsid){
		this.jsid = jsid;
	}
	
    /**
     * 角色模块对应表的角色ID
     * @return Integer
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
     * @return Integer
     */	
    public Integer getModelid(){
    	return modelid;
    }
}