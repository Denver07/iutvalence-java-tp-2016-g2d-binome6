package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.Boat;

public class Case {
	private boolean shot;
	private Boat boat;
	
	public Case(){
		this.shot=false;
		this.boat=null;
	}
	
	public void shot() {
		shot = true;
		boat.hit();
	}

	public boolean isEmpty() {
		return this.boat == null;
	}
	
	public void setBoat(Boat boat2) {
		this.boat = boat2;
	}
}
