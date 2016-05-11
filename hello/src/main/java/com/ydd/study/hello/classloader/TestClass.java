package com.ydd.study.hello.classloader;

public class TestClass {
	TestClass t;
public boolean instance()
{
	return this instanceof TestClass;
}
public void convert(TestClass t)
{
	this.t=t;
}

}
