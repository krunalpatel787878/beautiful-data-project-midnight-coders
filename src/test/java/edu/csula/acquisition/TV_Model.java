package edu.csula.acquisition;

public class TV_Model {
	
	String id;
	String name;
	String season;

	public TV_Model(String id,String name, String season) {
		this.id=id;
		this.name = name;
		this.season = season;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
