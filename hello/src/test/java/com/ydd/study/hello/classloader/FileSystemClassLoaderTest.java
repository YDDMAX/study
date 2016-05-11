package com.ydd.study.hello.classloader;

import org.junit.Test;


public class FileSystemClassLoaderTest   {
	@Test
	public void test()
	{
		FileSystemClassLoader fileSystemClassLoader=new FileSystemClassLoader("D:\\");
		try {
			Class<?>c=fileSystemClassLoader.loadClass("TestClass");
			Object testClass=(c.newInstance());
			System.out.println(c+"|"+testClass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
