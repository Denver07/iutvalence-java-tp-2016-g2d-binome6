package fr.iutvalence.mordohaycoste.battleship;

public class Case {
	//Attribut Tiré ou pas, et ensuite bateaux ou pas.
	public static final boolean SHOT_DEFAULT=false;
	public static final boolean PRESENCE_BATTLESHIP_DEFAULT=false;
	public boolean shot;
	public boolean  presence;
	
	public Case(){
		this.shot=SHOT_DEFAULT;
		this.presence=PRESENCE_BATTLESHIP_DEFAULT;
		if(this.shot){
			this.presence=false;
		}
		
	}
	
	public Case(boolean shot0, boolean presence0){
		this.shot=shot0;
		this.presence=presence0;
		if(this.shot){
			this.presence=false;
		}
		
	}
	
	

}
