/**
 * 
 */
package com.test.automation.rest;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author ranjit.soni
 *
 */
public class MyApplication extends ResourceConfig {
	
	public MyApplication() {
        register(new MyApplicationBinder());
        packages(true, "com.test.automation.rest");
    }
	
}
