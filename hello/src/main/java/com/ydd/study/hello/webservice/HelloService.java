package com.ydd.study.hello.webservice;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService(serviceName="HelloService",targetNamespace="http://www.yunzhu.com")
public class HelloService {
	    @WebMethod(operationName="AliassayHello")
	    @WebResult(name="myReturn")
	    public String sayHello(@WebParam(name="name") String name){
	        return  "hello: " + name;
	    }
	    
	    public String sayGoodbye(String name){
	    
	        return  "goodbye: " + name;
	    }
	    
	    @WebMethod(exclude=true)//当前方法不被发布出去
	    public String sayHello2(String name){
	        return "hello " + name;
	    }    

	    public static void main(String[] args) {
	        /**
	         * 参数1：服务的发布地址
	         * 参数2：服务的实现者
	         *  Endpoint  会重新启动一个线程
	         */
	        Endpoint.publish("http://www.yunzhu.com:81/", new HelloService());
	        System.out.println("Server ready...");
	    }
}
