package com.pm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex03 {
	int su = 1111;
	int su2 = 2222;
	
	public Ex03() {}
	public Ex03(int a) {}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 클래스의 정보를 갖는 객체
		Class ex03=Ex03.class; // 클래스를 갖고 있을 때
		System.out.println(ex03);
		Class clz;
//		clz=Class.class;
		clz=Class.forName("com.pm.Ex22"); // 클래스가 없을 떄
		System.out.println(clz);
		
//		Ex03 me=clz.newInstance(); // 오류! 
//		Object me=clz.newInstance();
		
		Constructor[] construct = ex03.getConstructors();
		for(int i=0; i<construct.length; i++) {
			System.out.println(construct[i]);
		}
		Field[] arr2 = ex03.getDeclaredFields();
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		Method[] arr3 = ex03.getDeclaredMethods();
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		Ex22 me;
		me=(Ex22)(clz.newInstance());
		me=new Ex22();
		System.out.println(me.su);
		me.func01();
		
		
	}

}
