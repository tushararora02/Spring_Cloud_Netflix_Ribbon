package com.infosys.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
public class CustRibbonConfig {
	@Autowired
	IClientConfig clientconfig;
	@Bean
	public IPing changePing(IClientConfig clientconfig){
	return new PingUrl();	
	}
	

}
