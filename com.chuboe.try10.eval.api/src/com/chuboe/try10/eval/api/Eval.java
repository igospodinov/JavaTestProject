package com.chuboe.try10.eval.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * 
 */
@ProviderType
public interface Eval {
	
	/**
	 * 
	 */
	
	String calculate(String input);
		
}
