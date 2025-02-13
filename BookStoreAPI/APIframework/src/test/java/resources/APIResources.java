package resources;

//enum is a special class in java which has collection of methods or constants
public enum APIResources {

	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	updatePlaceAPI("/maps/api/place/get/json/maps/api/place/update/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
    private String resource;
	
	APIResources(String resource) {
		
		this.resource=resource;
	}
	
	public String getResource() {
		return resource;
	}
	
	
}
