package fr.iutvalence.mordohaycoste.battleship.boat;
/**
 *  @author costecle
 * Class boat characterised by the health (int), Sunk(boolean)
 * A method to decrease the health and put the status of the boat to sunk 
 * When the health equals 0.
 *
 *
 *
 */
public abstract class Boat {
	
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
	
	public abstract String getName();
}
