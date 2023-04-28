package com.family.manage.service.User;

import com.family.manage.entity.Houses;
import com.family.manage.mapper.HousesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HouseService {

    @Resource
    private HousesMapper houseMapper;

    public List<Houses> selectByUid(Integer uid){
        return houseMapper.selectByUid(uid);
    }

    public int insert(Houses houses){
        return houseMapper.insert(houses);
    }
}
