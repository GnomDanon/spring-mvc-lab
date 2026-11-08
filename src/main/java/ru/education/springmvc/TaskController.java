package ru.education.springmvc;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
public class TaskController {

	static private final String PRODUCES_VALUE = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8";

	@GetMapping(value = "/about", produces = PRODUCES_VALUE)
	public String about() {
		return "Гарипов Даниил Максимович, РИМ-250950";
	}

	@GetMapping(value = "/time", produces = PRODUCES_VALUE)
	public String time() {
		return OffsetDateTime.now().toString();
	}

	@GetMapping(value = "/length", produces = PRODUCES_VALUE)
	public String length(@RequestParam(name = "text") String text) {
		return String.valueOf(text.length());
	}
}
