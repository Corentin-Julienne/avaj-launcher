package flightsim.models.tower;

import flightsim.models.aircraft.Coordinates;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates) {
		WeatherProvider weatherProvider;
		
		weatherProvider.g
	}

	public void changeWeather() {
		
		// notify the observers that the climatic conditions have changed
		this.conditionChanged();
	}
}
