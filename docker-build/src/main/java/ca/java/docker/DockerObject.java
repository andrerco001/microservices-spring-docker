package ca.java.docker;

public class DockerObject {

	private final String content;
	private final String environment;

	public DockerObject(String content, String environment) {
		super();
		this.content = content;
		this.environment = environment;
	}

	public String getContent() {
		return content;
	}

	public String getEnvironment() {
		return environment;
	}
}