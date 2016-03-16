
public class Bateau {
	public static final int stateShipBattle=4;
	public static final int stateSubmarine=3;
	public static final int stateDestroyer=3;
	public static final int statePatrolboat=2;
	
    public int health;
    public boolean sunk;

    public Bateau(int initialHealth)
    {
     this.health = initialHealth;
     this.sunk = false;
    }
	
	public boolean isSunk()
	{
		return this.sunk;
	}
}
