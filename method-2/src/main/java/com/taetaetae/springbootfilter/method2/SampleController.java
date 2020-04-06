package com.taetaetae.springbootfilter.method2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SampleController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/filtered/test")
	public String filteredTest() {
		return "filtered";
	}
}
