package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.EndpointConfig;

//@WebService(portName = "SecurityServicePort", 
//serviceName = "SecurityService", 
//wsdlLocation = "WEB-INF/wsdl/SecurityService.wsdl", 
//targetNamespace = "http://www.jboss.org/jbossws/ws-extensions/wssecuritypolicy", 
//endpointInterface = "org.jboss.test.ws.jaxws.samples.wsse.policy.basic.ServiceIface")


@WebService(portName="HelloWorldWebservicePort", 
	serviceName="HelloWorld", 
	wsdlLocation="WEB-INF/wsdl/hello.wsdl", 
	targetNamespace="http://webservices.samples.jboss.org",
	endpointInterface="org.jboss.samples.webservices.HelloWorldInterface")
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config.xml", configName = "Custom WS-Security Endpoint")
public class HelloWorld implements HelloWorldInterface {

	@WebMethod(operationName="sayHello")
	public String sayHello(@WebParam(name="name") String name) {
	    if (name != null) {
	    	return "Hello " + name + "!";
	    } else {
	    	return "Hello!";
	    }
	}
	
	@WebMethod(operationName="somar", action="Sums two integer numbers")
	public int somar(@WebParam(name="x") int a, @WebParam(name="y") int b) {
		return a + b;
	}
	
}
