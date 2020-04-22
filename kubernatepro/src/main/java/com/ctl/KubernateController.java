package com.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernateController {
	
	@RequestMapping("hi")
	private String getMessage() {
		return "VANAKKAM KUBERNATE";
	}
}
