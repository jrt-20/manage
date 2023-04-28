package com.family.manage.service.User;

import com.family.manage.entity.Bank;
import com.family.manage.mapper.BankMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BankService {
    @Resource
    private BankMapper bankMapper;

    public List<Bank> selectByUid(Integer uid){
        return bankMapper.selectByUid(uid);
    }

    public int moneyIn(Integer bid,Integer uid,Double moneyIn){
        return bankMapper.moneyIn(bid,uid,moneyIn);
    }

    public int insert(Bank bank){
        return bankMapper.insert(bank);
    }

    public int deleteByUid(Integer uid){
        return bankMapper.deleteByUid(uid);
    }
}
