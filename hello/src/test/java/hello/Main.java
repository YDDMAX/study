package hello;

public class Main {
  public static void main(String[]a)
  {
	  System.out.println("Main��classloader:"+Main.class.getClassLoader());
	  System.out.println("Main��classloader��classloader:"+Main.class.getClassLoader().getClass().getClassLoader());
	  Object o=new Object();
	  ClassLoader c=o.getClass().getClassLoader();
	  System.out.println(c);
	  //���Ϊnull,��Ϊʹ�õ��������������
	 // System.out.println(c.getClass());
	  //��ʼĬ�ϵ��߳��������Ϊapp�������������̵߳��̼߳������Ӹ�thread���̼߳������̳�
	  System.out.println("�߳��������"+Thread.currentThread().getContextClassLoader());
    
  }
}
