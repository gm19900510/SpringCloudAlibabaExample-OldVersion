package com.jztx.gm.demo.nacos_discovery_dubbo_provider.service;

import org.apache.dubbo.config.annotation.Service;
import com.jztx.gm.demo.nacos_discovery_dubbo_api.IHelloService;

/**
 * 功能描述 Dubbo服务提供方
 */
@Service
public class HelloServiceImpl implements IHelloService {

	@Override
	public String hello(String name) {
		return "Hello:" + name;
	}

}
