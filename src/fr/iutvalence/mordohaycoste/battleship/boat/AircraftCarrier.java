/**
 * First type of boat where health is equal to 5 
 * Extends of the class boat and represented by "C" case on the grid
 * 
 * 
 * 
 */

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
	
	@Override
	public String getName() {
		return "Aircraft Carrier";
	}
}
