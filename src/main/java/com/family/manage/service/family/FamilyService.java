package com.family.manage.service.family;

import com.family.manage.entity.Family;
import com.family.manage.mapper.FamilyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FamilyService {
    @Resource
    private FamilyMapper familyMapper;

    /**
     * 根据用户id查询家庭信息
     * @param uid
     * @return
     */
    public Family selectByUid(Integer uid){
        return familyMapper.selectByUid(uid);
    }

    public List<Family> selectByFid(Integer fid){
        return familyMapper.selectByFid(fid);
    }

    public int delete(Integer uid){
        return familyMapper.deleteByPrimaryKey(uid);
//        return 1;
    }
    public int insert(Family family){
        return familyMapper.insert(family);
    }

}
