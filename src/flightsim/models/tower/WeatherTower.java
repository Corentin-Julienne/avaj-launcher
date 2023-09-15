package flightsim.models.tower;

import flightsim.models.aircraft.Coordinates;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates) {
		WeatherProvider weatherProvider = WeatherProvider.getInstance();

		return weatherProvider.getCurrentWeather(coordinates);
	}

	public void changeWeather() {
		this.conditionChanged();
	}
}
