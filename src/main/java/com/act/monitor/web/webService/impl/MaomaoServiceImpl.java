package com.act.monitor.web.webService.impl;



import com.act.monitor.web.webService.MaomaoService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "MaomaoService",serviceName = "MaomaoService",
endpointInterface = "com.act.monitor.web.webService.MaomaoService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class MaomaoServiceImpl implements MaomaoService {

	@Override
	public String idc_command(String name, String age) {
		System.out.println(name+age);
		return "你好："+name;
	}

}
