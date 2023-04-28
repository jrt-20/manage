package com.family.manage.mapper;

import com.family.manage.entity.Dao.Childitem;
import com.family.manage.entity.ChilditemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChilditemMapper {
    List<Childitem> selectAll();
    long countByExample(ChilditemExample example);

    int deleteByExample(ChilditemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Childitem record);

    int insertSelective(Childitem record);

    List<Childitem> selectByExample(ChilditemExample example);

    Childitem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Childitem record, @Param("example") ChilditemExample example);

    int updateByExample(@Param("record") Childitem record, @Param("example") ChilditemExample example);

    int updateByPrimaryKeySelective(Childitem record);

    int updateByPrimaryKey(Childitem record);
}