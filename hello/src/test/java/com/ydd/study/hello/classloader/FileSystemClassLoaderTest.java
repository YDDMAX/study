package com.ydd.study.hello.classloader;

import org.junit.Test;


public class FileSystemClassLoaderTest   {
	@Test
	public void test_һ���������ClassLoader������()
	{
		FileSystemClassLoader fileSystemClassLoader=new FileSystemClassLoader("D:\\");
		try {
			Class<?>c=fileSystemClassLoader.loadClass("TestClass");
			System.out.println(c);
			Object testClass=(c.newInstance());
			System.out.println(c+"|"+testClass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * ���Խ���ǅg����,��������Ķ���ͬһ������
	 * �����
	 * sun.misc.Launcher$AppClassLoader@761db1c5
       sun.misc.Launcher$AppClassLoader@761db1c5
       sun.misc.Launcher$AppClassLoader@761db1c5
                  ���end
	 * ���Կ���ClassLoader��Ĭ��parent��ϵͳ�������
	 */
	@Test
	public void test_����ϵͳ��������Ƿ�g��()
	{
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(Thread.currentThread().getContextClassLoader());
		
	}
}
