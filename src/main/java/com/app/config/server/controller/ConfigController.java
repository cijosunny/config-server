package com.app.config.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.server.model.Member;
import com.app.config.server.service.ConfigService;

@RestController
@RequestMapping("/config/v1")
public class ConfigController {
	@Autowired
	private ConfigService configService;
	
	@GetMapping("/members")
	public List<Member> getMembers(){
		return configService.getMembers();
	}
}
