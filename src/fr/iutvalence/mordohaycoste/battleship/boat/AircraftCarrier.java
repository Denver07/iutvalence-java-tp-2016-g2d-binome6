package fr.iutvalence.mordohaycoste.battleship.boat;

public class AircraftCarrier extends Boat {
	private static final int AIRCRAFT_CARRIER = 5;

	public AircraftCarrier() {
		super(AIRCRAFT_CARRIER);
	}

	@Override
	public String toString() {
		return "C";
	}
}
