package flightsim.models.aircraft;

import java.util.Map;
import java.util.HashMap;
import java.util.function.BiFunction;

public class AircraftFactory {

	private static AircraftFactory instance = null;
	private static final Map<String, BiFunction<String[], Coordinates, Flyable>> registry = new HashMap<>();
	private int uniqId = 0;

	private AircraftFactory() {};

	// ensure that the factory is a singleton
	public static AircraftFactory getInstance() {
		if (instance == null) {
			instance = new AircraftFactory();
		}
		return instance;
	}

	private Baloon newBaloon(String[] params, Coordinates coordinates) {
		return (new Baloon(Integer.parseInt(params[0]), params[1], coordinates));
	}

	private JetPlane newJetPlane(String[] params, Coordinates coordinates) {
		return (new JetPlane(Integer.parseInt(params[0]), params[1], coordinates));
	}

	private Helicopter newHelicopter(String[] params, Coordinates coordinates) {
		return (new Helicopter(Integer.parseInt(params[0]), params[1], coordinates));
	}

	private int attributeUniqId() {
		return ++this.uniqId;
	}

	public void registerAircraftType(String type, BiFunction<String[], Coordinates, Flyable> functionName) {
		registry.put(type, functionName);
	}

	public Flyable newAircraft(String type, String name, Coordinates coordinates) {

		BiFunction<String[], Coordinates, Flyable> factoryMethod = registry.get(type);
		String[] params = new String[2];
		
		if (factoryMethod != null) {
			params[0] = Integer.toString(this.attributeUniqId());
			params[1] = name;
            return factoryMethod.apply(params, coordinates);
        } else {
            throw new IllegalArgumentException("No such aircraft type: " + type);
        }
	}
}
