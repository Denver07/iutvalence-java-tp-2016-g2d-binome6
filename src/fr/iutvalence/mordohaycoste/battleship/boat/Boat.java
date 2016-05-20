package fr.iutvalence.mordohaycoste.battleship.boat;

public class Boat {
	
    private int health;
    private boolean sunk;

    public Boat(int initialHealth)
    {
     this.health = initialHealth;
     this.sunk = false;
    }
	
	public final boolean isSunk()
	{
		return this.sunk;
	}
	
	public final int health()
	{
		
		return this.health;
	}
	
	public final void hit()
	{
		if (this.sunk) {
			// TODO Exception dans la cas où on tire un bateau mort
		}
		
		this.health--;
		this.sunk = (this.health == 0);
	}
}
