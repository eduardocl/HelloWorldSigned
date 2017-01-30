package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://webservices.samples.jboss.org")
public interface HelloWorldInterface {

	@WebMethod
	public String sayHello(String name);
	
	@WebMethod
	public int somar(int a, int b);
	
}
