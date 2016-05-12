package com.ydd.study.hello.classloader;

import org.junit.Test;


public class FileSystemClassLoaderTest   {
	@Test
	public void test_一个深入理解ClassLoader的例子()
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
	 * 测试结果是単例的,下面输出的都是同一个对象
	 * 输出：
	 * sun.misc.Launcher$AppClassLoader@761db1c5
       sun.misc.Launcher$AppClassLoader@761db1c5
       sun.misc.Launcher$AppClassLoader@761db1c5
                  输出end
	 * 可以看出ClassLoader的默认parent是系统类加载器
	 */
	@Test
	public void test_测试系统类加载器是否単例()
	{
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(Thread.currentThread().getContextClassLoader());
		
	}
}
