package com.my.sts.controller;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@GetMapping("/")
	public ResponseEntity<?> index() {
		String url = "https://dummyjson.com/carts";
//		String url = "https://jsonplaceholder.typicode.com/posts";
		RestTemplate template;
		template = new RestTemplate();

//		ResponseEntity<Map> result = template.getForEntity(url, Map.class);
//		return result;
//		Map result = template.getForObject(url, Map.class);
//		return ResponseEntity.ok(result);
		
//		return template.postForEntity(url, null, String.class);
		return template.exchange(url, HttpMethod.GET, new HttpEntity<>(String.class), String.class, Map.of("limit", "1"));
	}

}
