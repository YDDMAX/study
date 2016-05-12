package com.ydd.study.hello.classloader;

public class TestClass {
	TestClass t;
	/*static Object o=new Object();
	static {
		
		System.out.println(o.getClass().getClassLoader());
	}*/
public boolean instance()
{
	return this instanceof TestClass;
}
public void convert(TestClass t)
{
	this.t=t;
}

}
