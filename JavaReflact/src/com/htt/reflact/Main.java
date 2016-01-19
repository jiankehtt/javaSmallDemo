package com.htt.reflact;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {

	public static void main(String[] args) {
		
//		Demo demo = new Demo();
		Demo1 demo = new Demo1();
		Class typeclass = (Class)((ParameterizedType)(demo.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
		System.out.println(typeclass);
		try {
		  Object o = 	typeclass.newInstance();
		  System.out.println(o.toString());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
}
