package com.ydd.aop;

public aspect TxAspect 
{ 
// ָ��ִ�� Hello.sayHello() ����ʱִ����������
void around():call(void Hello.sayHello()){System.out.println("��ʼ���� ...");proceed();System.out.println("������� ...");}
}