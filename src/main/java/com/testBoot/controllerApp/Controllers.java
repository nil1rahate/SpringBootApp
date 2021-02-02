package com.testBoot.controllerApp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	@PostMapping(path = "/saveCustInfo")
	public String custInformation(@RequestBody String customer) {
		return "Data save successfully for custmoer " + customer;
	//hello my new code is here	
	}

}
