/**
 * 
 */
package com.test.automation.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.test.automation.service.MyResourceServices;

/**
 * @author ranjit.soni
 *
 */
public class MyApplicationBinder extends AbstractBinder{

	@Override
	protected void configure() {
		bind(MyResourceServices.class).to(MyResourceServices.class);
	}
}
