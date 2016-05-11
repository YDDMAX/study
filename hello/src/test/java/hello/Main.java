package hello;

public class Main {
  public static void main(String[]a)
  {
	  System.out.println("Main的classloader:"+Main.class.getClassLoader());
	  System.out.println("Main的classloader的classloader:"+Main.class.getClassLoader().getClass().getClassLoader());
	  Object o=new Object();
	  ClassLoader c=o.getClass().getClassLoader();
	  System.out.println(c);
	  //输出为null,因为使用的是启动类加载器
	 // System.out.println(c.getClass());
	  //初始默认的线程类加载器为app加载器，创建线程的线程加载器从父thread的线程加载器继承
	  System.out.println("线程类加载器"+Thread.currentThread().getContextClassLoader());
    
  }
}
