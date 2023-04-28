package com.family.manage.mapper;

import com.family.manage.entity.Family;
import java.util.List;

public interface FamilyMapper {

    Family selectByUid(Integer uid);

    List<Family> selectByFid(Integer fid);

    int deleteByPrimaryKey(Integer uid);

    int insert(Family family);

}