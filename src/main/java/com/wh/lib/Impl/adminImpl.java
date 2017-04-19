package com.wh.lib.Impl;

import com.wh.lib.domain.admin;

public interface adminImpl {
	void addadmin(admin admin);
	
	admin getadminbyid(int id);
	
	admin getadminbyName(String name);

}
