package com.abgi.microservicesboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroservicesController {

	@RequestMapping("/hi")
	public @ResponseBody String hiThere() {
		return "Ola mundo!";
	}
}
