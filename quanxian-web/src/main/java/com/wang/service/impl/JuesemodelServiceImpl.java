package com.wang.service.impl;

import com.wang.mapper.JuesemodelMapper;
import com.wang.service.JuesemodelService;
import com.wang.vo.JuesemodelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class JuesemodelServiceImpl implements JuesemodelService {
    @Autowired
    private JuesemodelMapper juesemodelMapper;
    @Override
    public  List<JuesemodelVo> findbyid(int s) {

       List<JuesemodelVo> list  =juesemodelMapper.searchJuesemodelByParams1(s);
        if(list!=null)
            return list;
        else
            return null;
    }
}
