package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.AircraftCarrier;
import fr.iutvalence.mordohaycoste.battleship.boat.Boat;
import fr.iutvalence.mordohaycoste.battleship.boat.Destroyer;
import fr.iutvalence.mordohaycoste.battleship.boat.PatrolBoat;
import fr.iutvalence.mordohaycoste.battleship.boat.ShipBattle;
import fr.iutvalence.mordohaycoste.battleship.boat.Submarine;
import java.util.Scanner;

public class Game {
	Boat Aircraftcarrier = new AircraftCarrier();
	Boat ShipBattle = new ShipBattle();
	Boat Destroyer = new Destroyer();
	Boat PatrolBoat = new PatrolBoat();
	Boat Submarine = new Submarine();
	
	
	
	public Game() {
		// TODO Auto-generated method stub	
		Grid Grid1_1 = new Grid(1,1);
		Grid Grid1_2 = new Grid(1,2);
		Grid Grid2_1 = new Grid(2,1);
		Grid Grid2_2 = new Grid(2,2);
		Scanner saisieUtilisateur = new Scanner(System.in); 
		
		/*System.out.println("Please enter the position of the Aircraft Carrier ");
		int AircraftCarrier_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Ship 0Battle :");
		int ShipBattle_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Destroyer ");
		int Destroyer_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Patrol Boat ");
		int PatrolBoat_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Submarine ");
		int Submarine_int = saisieUtilisateur.nextInt();*/
		
		int aircraftX = 0;
		int aircraftY = 0;
		Direction aircraftD = Direction.HORIZONTAL;
		Grid1_1.putBoat(Aircraftcarrier, aircraftX, aircraftY, aircraftD);
		
/*
		 for(i=casedebut;i<casemaxbateau;i++){
			Grid1_1.Case[i][j].occupee= true;
			
		}
		
*/


		
	}
	
	public void run() {
		
		// TODO Auto-generated method stub
	}
}
