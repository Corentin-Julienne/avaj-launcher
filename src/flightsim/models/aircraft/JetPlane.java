package flightsim.models.aircraft;

public class JetPlane extends Aircraft {

	public JetPlane(long p_id, String p_name, Coordinates p_coordinates) {
		super(p_id, p_name, p_coordinates);
	}
	
	public void	updateConditions() {
		String weather = this.weatherTower.getWeather(this.coordinates);
		
		if (weather == "RAIN") {
			this.coordinates = new Coordinates(this.coordinates.getLongitude(), 
			this.coordinates.getLongitude(), this.coordinates.getHeight());
			System.out.println("");
		} else if (weather == "FOG") {
			this.coordinates = new Coordinates(this.coordinates.getLongitude(), 
			this.coordinates.getLatitude(), this.coordinates.getHeight());
			System.out.println("");
		} else if (weather == "SUN") {
			this.coordinates = new Coordinates(this.coordinates.getLongitude(), 
			this.coordinates.getLatitude(), this.coordinates.getHeight());			
			System.out.println("");
		} else { // snow
			this.coordinates = new Coordinates(this.coordinates.getLongitude(), 
			this.coordinates.getLatitude(), this.coordinates.getHeight());			
			System.out.println("");
		}
	}
}
