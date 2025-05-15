package com.my.service;

import com.my.module.*;

public class Service01 {
	MyModule module;

	public Service01() {
	}

	// DI - ������ ���� (������ ����)
	public Service01(MyModule module) {
		super();
		this.module = module;
	}

	// DI - ������ ���� (setter)
	public void setModule(MyModule module) {
		this.module = module;
	}

	public void serv01() {
		module.func01();
	}

	// IoC - ������ ����
	public void serv01(MyModule my) {
		MyModule module = my;
		module.func01();
	}
}
