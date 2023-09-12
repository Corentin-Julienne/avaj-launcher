package flightsim.models.aircraft;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;

public class AircraftFactory {

	private static AircraftFactory instance = null;
	private static final Map<String, BiFunction<String, Coordinates, Flyable>> registry = new HashMap<>();
	private long maxId = 0;

	private AircraftFactory() {};

	// ensure that the factory is a singleton
	public static AircraftFactory getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}
		return instance;
	}

	private Baloon newBaloon(String name, Coordinates coordinates) {
		return (new Baloon(this.attributeIdToAircraft(), name, coordinates));
	}

	private JetPlane newJetPlane(String name, Coordinates coordinates) {
		return (new JetPlane(this.attributeIdToAircraft(), name, coordinates));
	}

	private Helicopter newHelicopter(String name, Coordinates coordinates) {
		return (new Helicopter(this.attributeIdToAircraft(), name, coordinates));
	}

	private long attributeIdToAircraft() {
		return ++this.maxId;
	}

	public void registerAircraftType(String type, BiFunction<String, Coordinates, Flyable> functionName) {
		registry.put(type, functionName);
	}

	public Flyable newAircraft(String type, String name, Coordinates coordinates) {

		BiFunction<String, Coordinates, Flyable> factoryMethod = registry.get(type);

		if (factoryMethod != null) {
            return factoryMethod.apply(name, coordinates);
        } else {
            throw new IllegalArgumentException("No such aircraft type: " + type);
        }
	}
}
