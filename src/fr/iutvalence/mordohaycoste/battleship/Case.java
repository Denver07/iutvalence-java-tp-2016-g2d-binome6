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
		if (boat != null) boat.hit();
	}

	public boolean isEmpty() {
		return this.boat == null;
	}
	
	public void setBoat(Boat boat) {
		this.boat = boat;
	}

	@Override
	public String toString() {
		if (!shot && isEmpty()) {
			return " ";
		}
		if (shot && isEmpty()) {
			return "+";
		}
		if (!shot && !isEmpty()) {
			return boat.toString();
		}
		if (shot && !isEmpty() && !boat.isSunk()) {
			return "X";
		}
		if (shot && !isEmpty() && boat.isSunk()) {
			return "*";
		}
		return "?";		
	}
	
}
