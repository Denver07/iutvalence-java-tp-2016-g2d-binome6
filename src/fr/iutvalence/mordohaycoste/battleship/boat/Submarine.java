/**
 * First type of boat where health is equal to 3 
 * Extends of the class boat and represented by "S" case on the grid
 * 
 * 
 * 
 */
package fr.iutvalence.mordohaycoste.battleship.boat;

public class Submarine extends Boat {

	private static final int SUBMARINE = 3;

	public Submarine() {
		super(SUBMARINE);
	}
	@Override
	public String toString() {
		return "S";
	}
	
	@Override
	public String getName() {
		return "Submarine";
	}
}
