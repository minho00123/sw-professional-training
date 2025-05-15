package com.my.module;

import java.util.Set;

public class Module05 implements MyModule {
//	List list;
	Set list;

//	public void setList(List list) {
//		this.list = list;
//	}

	public void setList(Set list) {
		this.list = list;
	}

	@Override
	public void func01() {
		System.out.println(list);
	}

}
