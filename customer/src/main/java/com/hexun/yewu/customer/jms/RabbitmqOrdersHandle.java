package com.hexun.yewu.customer.jms;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hexun.framework.core.rabbitmq.RabbitmqHandle;
import com.hexun.yewu.customer.entity.Test;
import com.hexun.yewu.customer.service.TestService;

/**
 * 消费者
 * @author zhoudong
 *
 */
@Service
public class RabbitmqOrdersHandle implements RabbitmqHandle{
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Resource
	private TestService testService;
	
	@Override
	public void exec(final JSONObject message) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				log.info("接收到消息：{}",message);
				testService.insert(JSON.toJavaObject(message, Test.class));
			}
		}).start();
		
	}
}
