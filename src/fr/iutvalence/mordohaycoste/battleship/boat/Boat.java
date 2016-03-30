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
		this.health=this.health-1;
		if(this.health==0)
		{
			this.sunk=true;
		}
	}
	
	

}
