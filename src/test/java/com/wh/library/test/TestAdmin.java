package com.wh.library.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.wh.lib.Impl.adminImpl;
import com.wh.lib.domain.admin;
import com.wh.lib.service.adminService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestAdmin {
	//日志
	private static Logger logger = Logger.getLogger(TestAdmin.class);
	private adminImpl adminimpl = null;
	private adminService adminsercive;
	private ApplicationContext ac = null;
	// admin admin = null;
	/*@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		adminsercive = (adminService) ac.getBean("adminsercive");
	}*/
	@Test
	public void selectAdmin(){
		//admin = adminimpl.selectByPrimaryKey(7051201);
		admin admin = adminsercive.getadminbyid(7021201);
		System.out.println(admin.getName());
		logger.info(JSON.toJSONString(admin));
	}

}
