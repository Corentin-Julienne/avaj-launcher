package flightsim.models.tower;

import flightsim.models.aircraft.Coordinates;

public class WeatherProvider extends Tower {
	
	private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
	private static WeatherProvider instance = null;
	
	private WeatherProvider() {}

	public static WeatherProvider getInstance() {
		if (instance == null) {
			instance = new WeatherProvider();
		}
		return instance;
	}
	
	public String getCurrentWeather(Coordinates p_coordinates) {
		// random algo for the weather for a given set of coordinates
		if () {
			return (this.weather[0]);
		} else if () {
			return (this.weather[1]);
		} else if (p_coordinates.g) {
			return (this.weather[2]);
		}
		return (this.weather[3]);
	}
}
