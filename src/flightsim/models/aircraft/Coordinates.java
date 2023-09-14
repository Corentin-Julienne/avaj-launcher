package flightsim.models.aircraft;

public class Coordinates {

	private int	longitude;
	private int latitude;
	private int	height;

	Coordinates(int p_longitude, int p_latitude, int p_height) {
		
		if (p_longitude < 0)
			p_longitude = 0;
		if (p_latitude < 0)
			p_latitude = 0;
		if (p_height < 0)
			p_height = 0;
		if (p_height > 100)
			p_height = 100;
		
		this.longitude = p_longitude;
        this.latitude = p_latitude;
        this.height = p_height;
    }

	public int getLongitude() {
		return this.longitude;
	}

	public int	getLatitude() {
		return this.latitude;
	}

	public int getHeight() {
		return this.height;
	}
}
