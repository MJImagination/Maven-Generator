package com.mj.mapper;

import com.mj.model.BankDataMain;

public interface BankDataMainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BankDataMain record);

    int insertSelective(BankDataMain record);

    BankDataMain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BankDataMain record);

    int updateByPrimaryKeyWithBLOBs(BankDataMain record);

    int updateByPrimaryKey(BankDataMain record);
}