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
}
