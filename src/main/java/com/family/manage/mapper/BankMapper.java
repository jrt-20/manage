package com.family.manage.mapper;

import com.family.manage.entity.Bank;
import com.family.manage.entity.BankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankMapper {

    int deleteByUid(Integer uid);
    int moneyIn(@Param("bid") Integer bid,@Param("uid") Integer uid,@Param("moneyIn") Double moneyIn);

    List<Bank> selectByUid(Integer uid);
    long countByExample(BankExample example);

    int deleteByExample(BankExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(Bank record);

    int insertSelective(Bank record);

    List<Bank> selectByExample(BankExample example);

    Bank selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") Bank record, @Param("example") BankExample example);

    int updateByExample(@Param("record") Bank record, @Param("example") BankExample example);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);
}