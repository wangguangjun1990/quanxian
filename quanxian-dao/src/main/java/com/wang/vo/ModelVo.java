package com.wang.vo;

/**
 * 
 * @author wangguangjun
 */
public class ModelVo {
	/**
	 *  模块ID
	 */
	private Integer modelid;
	/**
	 *  模块名称
	 */
	private String modelname;
	/**
	 *  模块级别
	 */
	private Integer modeljibie;
	/**
	 *  父级模块ID
	 */
	private Integer prentmodelid;
	/**
	 *  模块地址
	 */
	private String modeladdress;
	/**
	 *  模块描述
	 */
	private String modelmiaoshu;
	/**
	 *  是否有子模块，1表示有
	 */
	private Integer issonmodel;
	/**
	 *  排序号
	 */
	private Integer paixuid;
	/**
	 * 模块ID
	 * @param modelid
	 */
	public void setModelid(Integer modelid){
		this.modelid = modelid;
	}
	
    /**
     * 模块ID
     * @return Integer
     */	
    public Integer getModelid(){
    	return modelid;
    }
	/**
	 * 模块名称
	 * @param modelname
	 */
	public void setModelname(String modelname){
		this.modelname = modelname;
	}
	
    /**
     * 模块名称
     * @return String
     */	
    public String getModelname(){
    	return modelname;
    }
	/**
	 * 模块级别
	 * @param modeljibie
	 */
	public void setModeljibie(Integer modeljibie){
		this.modeljibie = modeljibie;
	}
	
    /**
     * 模块级别
     * @return Integer
     */	
    public Integer getModeljibie(){
    	return modeljibie;
    }
	/**
	 * 父级模块ID
	 * @param prentmodelid
	 */
	public void setPrentmodelid(Integer prentmodelid){
		this.prentmodelid = prentmodelid;
	}
	
    /**
     * 父级模块ID
     * @return Integer
     */	
    public Integer getPrentmodelid(){
    	return prentmodelid;
    }
	/**
	 * 模块地址
	 * @param modeladdress
	 */
	public void setModeladdress(String modeladdress){
		this.modeladdress = modeladdress;
	}
	
    /**
     * 模块地址
     * @return String
     */	
    public String getModeladdress(){
    	return modeladdress;
    }
	/**
	 * 模块描述
	 * @param modelmiaoshu
	 */
	public void setModelmiaoshu(String modelmiaoshu){
		this.modelmiaoshu = modelmiaoshu;
	}
	
    /**
     * 模块描述
     * @return String
     */	
    public String getModelmiaoshu(){
    	return modelmiaoshu;
    }
	/**
	 * 是否有子模块，1表示有
	 * @param issonmodel
	 */
	public void setIssonmodel(Integer issonmodel){
		this.issonmodel = issonmodel;
	}
	
    /**
     * 是否有子模块，1表示有
     * @return Integer
     */	
    public Integer getIssonmodel(){
    	return issonmodel;
    }
	/**
	 * 排序号
	 * @param paixuid
	 */
	public void setPaixuid(Integer paixuid){
		this.paixuid = paixuid;
	}
	
    /**
     * 排序号
     * @return Integer
     */	
    public Integer getPaixuid(){
    	return paixuid;
    }
}