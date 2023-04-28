package com.family.manage.mapper;

import com.family.manage.entity.Houses;
import com.family.manage.entity.HousesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousesMapper {

    List<Houses> selectByUid(Integer uid);

    long countByExample(HousesExample example);

    int deleteByExample(HousesExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Houses record);

    int insertSelective(Houses record);

    List<Houses> selectByExample(HousesExample example);

    Houses selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Houses record, @Param("example") HousesExample example);

    int updateByExample(@Param("record") Houses record, @Param("example") HousesExample example);

    int updateByPrimaryKeySelective(Houses record);

    int updateByPrimaryKey(Houses record);
}