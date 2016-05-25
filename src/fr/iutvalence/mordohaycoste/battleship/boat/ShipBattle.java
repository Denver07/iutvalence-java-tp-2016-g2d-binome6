/**
 * First type of boat where health is equal to 4 
 * Extends of the class boat and represented by "B" case on the grid
 * 
 * 
 * 
 */
package fr.iutvalence.mordohaycoste.battleship.boat;

public class ShipBattle extends Boat {
	private static final int SHIP_BATTLE = 4;

	public ShipBattle() {
		super(SHIP_BATTLE);
	}
	
	@Override
	public String toString() {
		return "B";
	}
	
	@Override
	public String getName() {
		return "Ship Battle";
	}
}
