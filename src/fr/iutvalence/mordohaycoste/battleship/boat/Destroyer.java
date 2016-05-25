/**
 * First type of boat where health is equal to 3 
 * Extends of the class boat and represented by "D" case on the grid
 * 
 * 
 * 
 */
package fr.iutvalence.mordohaycoste.battleship.boat;

public class Destroyer extends Boat {
	private static final int DESTROYER = 3;

	public Destroyer() {
		super(DESTROYER);
	}
	
	@Override
	public String toString() {
		return "D";
	}
	
	@Override
	public String getName() {
		return "Destroyer";
	}
}
