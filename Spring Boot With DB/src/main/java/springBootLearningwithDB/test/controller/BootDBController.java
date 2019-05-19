package springBootLearningwithDB.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springBootLearningwithDB.test.service.BootDBLearningService;


@RestController
public class BootDBController {

	@Autowired
	private BootDBLearningService service;
	
	
	
	@RequestMapping("/test")
	public String bootDBTest() {
		return service.bootDBTest();
	}
}
