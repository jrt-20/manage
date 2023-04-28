package com.family.manage.service.dao;

import com.family.manage.entity.Dao.Childitem;
import com.family.manage.mapper.ChilditemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DaoService {
    @Resource
    private ChilditemMapper childitemMapper;

    public List<Childitem> selectAll(){
        return childitemMapper.selectAll();
    }

}

