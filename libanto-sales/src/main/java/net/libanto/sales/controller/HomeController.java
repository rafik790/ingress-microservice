package net.libanto.sales.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		Optional<String> podName = Optional.ofNullable(System.getenv("HOSTNAME"));
		return "Hello, Welcome to Sales k8s From:"+(podName.isPresent()?podName.get():"");
	}

}
