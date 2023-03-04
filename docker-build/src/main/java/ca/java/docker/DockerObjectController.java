package ca.java.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker-build")
public class DockerObjectController {

	@GetMapping
	public DockerObject dockerEnv() {
		// var hostName = System.getenv("COMPUTERNAME");
		var hostName = System.getenv("HOSTNAME");
		return new DockerObject("Docker", hostName);
	}
}