/**
 * 
 */
package com.test.automation.service;

import org.glassfish.jersey.process.internal.RequestScoped;



/**
 * @author ranjit.soni
 *
 */

@RequestScoped
public class MyResourceServices {

	public String test()
	{
		return "My Test String is here";
	}
}
