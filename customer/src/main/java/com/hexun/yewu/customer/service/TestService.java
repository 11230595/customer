package com.hexun.yewu.customer.service;

import com.hexun.yewu.customer.entity.Test;

public interface TestService {
	int deleteByPrimaryKey(String id);

	void insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

	Test findOneByCode(String userCode);

	void redisInsert(Test test);
}
