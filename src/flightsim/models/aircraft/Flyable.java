package flightsim.models.aircraft;

package flightsim.models.aircraft;

import flightsim.models.tower.WeatherProvider;
import flightsim.models.tower.WeatherTower;

public abstract class Flyable {
	
	protected	WeatherProvider weatherTower;

	public abstract void	updateConditions();
	public void				registerTower(WeatherTower p_tower) {
		// TODO
	}
}
