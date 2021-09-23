package com.tpx.ejb3.test;

import java.util.Properties;

import javax.naming.InitialContext;

import com.tpx.ejb3.HelloEjb;

public class EjbClient {

	public static void main(String[] args) {
//		Properties props = new Properties();
//		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
//		props.setProperty("java.naming.provider.url", "localhost:1099");
//		
//		try {
//			InitialContext ctx = new InitialContext(props);
//			HelloEjb helloejb = (HelloEjb) ctx.lookup("HelloEjbBean/remote");
//			System.out.println(helloejb.sayHello("·ðÉ½"));
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

		try {
			InitialContext ctx = new InitialContext();
			HelloEjb helloejb = (HelloEjb) ctx.lookup("HelloEjbBean/remote");
			System.out.println(helloejb.sayHello("·ðÉ½1"));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
