package com.vc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vc.services.AmcsServices;

@RestController
public class Controller {

	@Autowired
	private AmcsServices amcsservices;
	@GetMapping("/getamcs")
	public String getamcs()
	{
		return amcsservices.getamcsmf();
	}
	
}
