package com.wang.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.wang.entity.Model;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface ModelMapper {

	void insertModel(Model model);

	void deleteModelByModelid(Integer modelid);

	void updateModel(Model model);

	Page<Model> searchModelByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Model> searchModelByParams(@Param("map") Map<String, String> map);

} 
