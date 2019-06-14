package com.springcloud.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberApiController {
	
	//配置文件赋值
	//测试ribbon本地负载均衡  修改port 启动多台member服务
	@Value("${server.port}")
	private String host;
	
	@GetMapping("/getMember/{name}")
	public String getMember(@PathVariable String name) {
		return "this is member host：" + host + ", param :" + name;
	}
	
	@GetMapping("/getForEntity")
	public String getForEntity(String name) {
		return name;
	}
	
	@GetMapping("/getForObject")
	@ResponseBody
	public Object getForObject(String name, int age) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("age", age);
		return map;
	}
	
	@PostMapping("/postForObject")
	@ResponseBody
	public Object postForObject(@RequestBody Map<String, Object> map) {
		return map;
	}
	
	@PostMapping("/postForObject1")
	@ResponseBody
	public Object postForObject1(@RequestBody(required = false) Map<String, Object> map, String sex, String address) {
		map.put("sex", sex);
		map.put("address", address);
		return map;
	}
}
