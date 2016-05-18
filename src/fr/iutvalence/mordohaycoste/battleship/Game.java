package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.AircraftCarrier;
import fr.iutvalence.mordohaycoste.battleship.boat.Boat;
import fr.iutvalence.mordohaycoste.battleship.boat.Destroyer;
import fr.iutvalence.mordohaycoste.battleship.boat.PatrolBoat;
import fr.iutvalence.mordohaycoste.battleship.boat.ShipBattle;
import fr.iutvalence.mordohaycoste.battleship.boat.Submarine;
import java.util.Scanner;

public class Game {
	Boat Aircraftcarrier1 = new AircraftCarrier();
	Boat ShipBattle1 = new ShipBattle();
	Boat Destroyer1 = new Destroyer();
	Boat PatrolBoat1 = new PatrolBoat();
	Boat Submarine1 = new Submarine();
	
	Boat Aircraftcarrier2 = new AircraftCarrier();
	Boat ShipBattle2 = new ShipBattle();
	Boat Destroyer2 = new Destroyer();
	Boat PatrolBoat2 = new PatrolBoat();
	Boat Submarine2 = new Submarine();
	
	Grid Grid1_1;
	Grid Grid1_2; 
	Grid Grid2_1; 
	Grid Grid2_2; 
	
	private final Player p1;
	private final Player p2;
	
	public Game(String player1, String player2) {
		p1 = new Player(player1, 1);
		p2 = new Player(player2, 2);
		
		/* TODO Auto-generated method stub	

		Scanner saisieUtilisateur = new Scanner(System.in); 
		
		System.out.println("Please enter the position of the Aircraft Carrier ");
		int AircraftCarrier_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Ship 0Battle :");
		int ShipBattle_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Destroyer ");
		int Destroyer_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Patrol Boat ");
		int PatrolBoat_int = saisieUtilisateur.nextInt();
		System.out.println("Please enter the position of the Submarine ");
		int Submarine_int = saisieUtilisateur.nextInt();
		
		int aircraftX = 0;
		int aircraftY = 0;
		Direction aircraftD = Direction.HORIZONTAL;
		Grid1_1.putBoat(Aircraftcarrier1, aircraftX, aircraftY, aircraftD);
		

		 for(i=casedebut;i<casemaxbateau;i++){
			Grid1_1.Case[i][j].occupee= true;
			
		}
		
*/


		
	}
	
	public void initJoueur1(){
		Scanner scanner = new Scanner(System.in);

		Grid1_1 = new Grid(1, 1);
		boolean testBoat = false;
		while(!testBoat)
		{
			System.out.println("Please enter the position of the Aircraft Carrier");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();
			
			if(orientationBateauA==0){
				testBoat = Grid1_1.putBoat(Aircraftcarrier1,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}
				
		}
		testBoat = false;

		while(!testBoat)
		{
			System.out.println("Please enter the position of the Aircraft Carrier");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();
			
			if(orientationBateauA==0){
				testBoat = Grid1_1.putBoat(this.Destroyer1,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}
				
		}
	}
	
	public void run() {
		initJoueur1();
		//initJoueur2();
			
	}

	/*Position_A = readInteger("Donnez un nombre entier entre 1 et 8 pour l'absisse d'une case que vous pensez être occupée par un bateau ennemi.");
	  println(x);
	// Pour Joueur 1 :
	  Grid Grille1.1 = new Grid(1,1);
		// Demander position, direction du bateau A.
	  PositionX_bateauA = readInteger("Donnez l'abscisse du bateau ");
	  PositionY_bateauA = readInteger("Donnez l'ordonnée du bateau ");
	  Orientation_bateauA = readInteger("Donnez l'orientation du bateau ");
	  
	  if(PositionX_bateauA>0 || PositionY_bateauA<10)*/
		// Tester + Placer + Afficher
		// Demander position, direction du bateau B.
		// Tester + Placer + Afficher
	// Pareil pour Joueur 2 :
	
	// Boucle jusqu'à victoire d'un tour de jeu.
		// 
	
	// TODO Auto-generated method stub
}
