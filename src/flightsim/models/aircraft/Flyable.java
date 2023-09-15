package flightsim.models.aircraft;

import flightsim.models.tower.WeatherTower;

public abstract class Flyable {
	
	protected	WeatherTower weatherTower;

	public abstract void	updateConditions();
	
	public void				registerTower(WeatherTower p_tower) {
		this.weatherTower = p_tower;
	}
}
