package com.wang.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.wang.entity.Juesemodel;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface JuesemodelMapper {

	void insertJuesemodel(Juesemodel juesemodel);

	void deleteJuesemodelByJsmodelid(Integer jsmodelid);

	void updateJuesemodel(Juesemodel juesemodel);

	Page<Juesemodel> searchJuesemodelByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Juesemodel> searchJuesemodelByParams(@Param("map") Map<String, String> map);

} 
