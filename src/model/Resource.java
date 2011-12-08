package model;

public class Resource {
	private String name;
	private String type;
	
	public Resource(String name, String type) {
		this.setName(name);
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
