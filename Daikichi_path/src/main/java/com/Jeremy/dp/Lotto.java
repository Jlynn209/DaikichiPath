package com.Jeremy.dp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Lotto {
	@RequestMapping("/lotto/{number}")
	public String travel(@PathVariable("number") int number) {
		if (number % 2 == 0) {
			return "you will take a grand journey in the near future, but be weary of temptining offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
