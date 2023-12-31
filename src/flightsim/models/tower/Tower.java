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
		for (int i = 0; i < observers.size(); i++) {
			this.observers.get(i).updateConditions();
		}
	}
}
