package com.family.manage.mapper;

import com.family.manage.entity.Gupiao;
import com.family.manage.entity.GupiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GupiaoMapper {

    int deleteByUid(Integer uid);
    public List<Gupiao> selectByUid(Integer uid);
    long countByExample(GupiaoExample example);

    int deleteByExample(GupiaoExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Gupiao record);

    int insertSelective(Gupiao record);

    List<Gupiao> selectByExample(GupiaoExample example);

    Gupiao selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Gupiao record, @Param("example") GupiaoExample example);

    int updateByExample(@Param("record") Gupiao record, @Param("example") GupiaoExample example);

    int updateByPrimaryKeySelective(Gupiao record);

    int updateByPrimaryKey(Gupiao record);
}