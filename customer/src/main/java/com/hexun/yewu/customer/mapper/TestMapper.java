package com.hexun.yewu.customer.mapper;

import com.hexun.yewu.customer.entity.Test;

public interface TestMapper {
    int deleteByPrimaryKey(String id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

	Test findOneByCode(String userCode);
}