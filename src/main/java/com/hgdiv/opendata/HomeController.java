package com.hgdiv.opendata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

}
