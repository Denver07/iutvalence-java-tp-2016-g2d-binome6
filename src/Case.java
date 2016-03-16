
public class Case {
	//Attribut Tiré ou pas, et ensuite bateaux ou pas.
	public static final boolean SHOT_DEFAULT=0;
	public static final boolean PRESENCE_BATTLESHIP_DEFAULT=0;
	public boolean shot;
	public boolean  presence;
	
	public Case(boolean shot0, boolean presence0){
		this.shot=shot0;
		this.presence=presence0;
		if(this.shot){
			this.presence=false;
		}
		
	}
	
	

}
