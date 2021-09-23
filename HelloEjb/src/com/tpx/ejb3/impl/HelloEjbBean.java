package com.tpx.ejb3.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.tpx.ejb3.HelloEjb;


@Stateless
@Remote(HelloEjb.class)
public class HelloEjbBean implements HelloEjb {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
