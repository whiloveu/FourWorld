package com.wh.lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wh.lib.Impl.adminImpl;
import com.wh.lib.dao.adminMapper;
import com.wh.lib.domain.admin;

@Service("adminService")
public class adminService implements adminImpl{
	@Autowired
	private adminMapper adminmapper;

	@Override
	public void addadmin(admin admin) {
		// TODO Auto-generated method stub
		adminmapper.insert(admin);
	}

	public admin getadminbyid(int id) {
		// TODO Auto-generated method stub
		return adminmapper.selectByPrimaryKey(id);
	}

	@Override
	public admin getadminbyName(String name) {
		// TODO Auto-generated method stub
		return adminmapper.selectByName(name);
	}
	

}
