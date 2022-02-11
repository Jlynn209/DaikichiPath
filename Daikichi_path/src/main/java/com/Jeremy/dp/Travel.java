package com.Jeremy.dp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Travel {
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "Congratulations! You will soon travel to " + place;
	}
}
