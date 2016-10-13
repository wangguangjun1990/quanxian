package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class UserVo {
	/**
	 *  用户ID
	 */
	private Integer userid;
	/**
	 *  用户名
	 */
	private String username;
	/**
	 *  用户密码
	 */
	private String passward;
	/**
	 *  是否禁用，1表示禁用
	 */
	private Integer isdelete;
	/**
	 *  角色ID,是外键
	 */
	private Integer jsid;
	/**
	 * 用户ID
	 * @param userid
	 */
	public void setUserid(Integer userid){
		this.userid = userid;
	}
	
    /**
     * 用户ID
     * @return Integer
     */	
    public Integer getUserid(){
    	return userid;
    }
	/**
	 * 用户名
	 * @param username
	 */
	public void setUsername(String username){
		this.username = username;
	}
	
    /**
     * 用户名
     * @return String
     */	
    public String getUsername(){
    	return username;
    }
	/**
	 * 用户密码
	 * @param passward
	 */
	public void setPassward(String passward){
		this.passward = passward;
	}
	
    /**
     * 用户密码
     * @return String
     */	
    public String getPassward(){
    	return passward;
    }
	/**
	 * 是否禁用，1表示禁用
	 * @param isdelete
	 */
	public void setIsdelete(Integer isdelete){
		this.isdelete = isdelete;
	}
	
    /**
     * 是否禁用，1表示禁用
     * @return Integer
     */	
    public Integer getIsdelete(){
    	return isdelete;
    }
	/**
	 * 角色ID,是外键
	 * @param jsid
	 */
	public void setJsid(Integer jsid){
		this.jsid = jsid;
	}
	
    /**
     * 角色ID,是外键
     * @return Integer
     */	
    public Integer getJsid(){
    	return jsid;
    }
}