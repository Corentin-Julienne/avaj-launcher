package flightsim.models.tower;

import flightsim.models.aircraft.Flyable;
import java.util.List;

public class Tower {
	
	private List<Flyable> observers;

	public void register(Flyable p_flyable) {
		observers.add(p_flyable);
	}

	public void unregister(Flyable p_flyable) {
		observers.remove(p_flyable);
	}

	protected void conditionChanged() {
		// should be able to notify observers that the weather will actually change
		
	}
}
