package com.ydd.aop;

public class Hello {
	// ����һ���򵥷�����ģ��Ӧ���е�ҵ���߼�����
	public void sayHello() {
		System.out.println("Hello AspectJ!");
	}

	// ����������������
	public static void main(String[] args) {
		Hello h = new Hello();
		h.sayHello();
	}
}
