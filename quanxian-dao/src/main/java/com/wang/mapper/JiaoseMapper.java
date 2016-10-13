package com.wang.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.wang.entity.Jiaose;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface JiaoseMapper {

	void insertJiaose(Jiaose jiaose);

	void deleteJiaoseByJsid(Integer jsid);

	void updateJiaose(Jiaose jiaose);

	Page<Jiaose> searchJiaoseByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Jiaose> searchJiaoseByParams(@Param("map") Map<String, String> map);

} 
