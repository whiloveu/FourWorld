package com.wh.lib.service;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.wh.lib.Impl.adminImpl;
import com.wh.lib.domain.admin;
import com.wh.library.test.TestAdmin;

public class TestadminT1 {
	private static Logger logger = Logger.getLogger(TestAdmin.class);
	private adminImpl adminimpl = null;
	private admin admin = null;
	private adminService adminservice;
	@Test
	public void selectAdmin(){
		//admin = adminimpl.selectByPrimaryKey(7051201);
		admin = adminservice.getadminbyid(7051201);
		System.out.println(admin.getName());
	}

}
