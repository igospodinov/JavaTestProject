package com.chuboe.try10.eval.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.chuboe.try10.eval.api.Eval;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.debug.api.Debug;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="com.chuboe.try10.eval",
			property = {
					Debug.COMMAND_SCOPE + "=test2",
					Debug.COMMAND_FUNCTION + "=getCalculate"
			}
		)
public class EvalApplication implements REST {

	Eval e;
	
	public String getCalculate(String string) throws Exception {
		return e.calculate(string);
	}
	
	@Reference
	public void setEval(Eval e){
		this.e = e;
	}

}
