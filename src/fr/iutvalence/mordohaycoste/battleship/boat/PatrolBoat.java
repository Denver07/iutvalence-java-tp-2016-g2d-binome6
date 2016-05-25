/**
 * First type of boat where health is equal to 2 
 * Extends of the class boat and represented by "P" case on the grid
 * 
 * 
 * 
 */
package fr.iutvalence.mordohaycoste.battleship.boat;

public class PatrolBoat extends Boat {
	private static final int PATROLBOAT = 2;

	public PatrolBoat() {
		super(PATROLBOAT);
	}
	
	@Override
	public String toString() {
		return "P";
	}
	
	@Override
	public String getName() {
		return "Patrol Boat";
	}
}
