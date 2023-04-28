package com.family.manage.service.User;

import com.family.manage.entity.Gupiao;
import com.family.manage.mapper.GupiaoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GupiaoService {

    @Resource
    private GupiaoMapper mapper;

    public List<Gupiao> selectByUid(Integer uid){
        return mapper.selectByUid(uid);
    }

    public int insert(Gupiao gupiao){
        return  mapper.insert(gupiao);
    }

    public int delete(Integer uid){
        return mapper.deleteByUid(uid);
    }
}
