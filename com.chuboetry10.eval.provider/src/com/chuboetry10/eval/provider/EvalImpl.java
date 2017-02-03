package com.chuboetry10.eval.provider;

import org.osgi.service.component.annotations.Component;

import com.chuboe.try10.eval.api.Eval;

import osgi.enroute.debug.api.Debug;

/**
 * 
 */
@Component(
		name = "com.chuboetry10.eval",
		property = {
				Debug.COMMAND_SCOPE + "=test",
				Debug.COMMAND_FUNCTION + "=calculate"
		}
		)
public class EvalImpl implements Eval{

	
	
	@Override
	public String calculate(String input) {
		
		return input.toUpperCase();
		
	}

}
