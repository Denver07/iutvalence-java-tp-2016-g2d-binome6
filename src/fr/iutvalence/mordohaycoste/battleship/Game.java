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

	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}


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
		Grid1_2 = new Grid(1, 2);
		boolean testBoat = false;
		while(!testBoat)
		{
			System.out.println("Player 1, please enter the position of the Aircraft Carrier");
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

		/*while(!testBoat)
		{
			System.out.println("Please enter the position of the ShipBattle");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid1_1.putBoat(this.ShipBattle1,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}

		while(!testBoat)
		{
			System.out.println("Please enter the position of the Destroyer");
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

		while(!testBoat)
		{
			System.out.println("Please enter the position of the PatrolBoat");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid1_1.putBoat(this.PatrolBoat1,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}

		while(!testBoat)
		{
			System.out.println("Please enter the position of the SubMarine");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid1_1.putBoat(this.Submarine1,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}*/
	}

	public void initJoueur2(){
		Scanner scanner = new Scanner(System.in);

		Grid2_1 = new Grid(2, 1);
		Grid2_2 = new Grid(2, 2);

		boolean testBoat = false;
		while(!testBoat)
		{
			System.out.println("Player 2, please enter the position of the Aircraft Carrier");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid2_1.putBoat(Aircraftcarrier2,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}
		testBoat = false;

		/*while(!testBoat)
		{
			System.out.println("Please enter the position of the ShipBattle");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid2_1.putBoat(this.ShipBattle2,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}

		while(!testBoat)
		{
			System.out.println("Please enter the position of the Destroyer");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid2_1.putBoat(this.Destroyer2,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}

		while(!testBoat)
		{
			System.out.println("Please enter the position of the PatrolBoat");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid2_1.putBoat(this.PatrolBoat2,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}

		while(!testBoat)
		{
			System.out.println("Please enter the position of the SubMarine");
			System.out.println("Donnez l'abscisse du bateau");
			int positionXBateauA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du bateau");
			int positionYBateauA = scanner.nextInt();
			System.out.println("Donnez l'orientation du bateau, 0 pour horizontale, 1 pour vertical");
			int orientationBateauA = scanner.nextInt();

			if(orientationBateauA==0){
				testBoat = Grid2_1.putBoat(this.Submarine2,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				if(!testBoat)
					System.out.println("replacez votre bateau");
			}

		}*/
	}
	public void run() {
		initJoueur1();
		initJoueur2();

		boolean p1=false, p2=false;
		Scanner scanner = new Scanner(System.in);

		while(!p1 &&!p2){
			System.out.println("C'est au tour du joueur 1");

			Grid1_1.print();
			Grid1_2.print();

			System.out.println("Donnez l'abscisse du tir");
			int shotA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du tir");
			int shotO = scanner.nextInt();

			Grid2_1.shot(shotA,shotO);
			Grid1_2.shot(shotA,shotO);

			if (Aircraftcarrier2.isSunk() && ShipBattle2.isSunk() && Destroyer2.isSunk() && PatrolBoat2.isSunk() && Submarine2.isSunk()) {
				p2 = true;
				break;
			}

			System.out.println("C'est au tour du joueur 2");

			Grid2_1.print();
			Grid2_2.print();

			System.out.println("Donnez l'abscisse du tir");
			shotA = scanner.nextInt();
			System.out.println("Donnez l'ordonnée du tir");
			shotO = scanner.nextInt();

			Grid1_1.shot(shotA,shotO);
			Grid2_2.shot(shotA,shotO);

			if (Aircraftcarrier1.isSunk() && ShipBattle1.isSunk() && Destroyer1.isSunk() && PatrolBoat1.isSunk() && Submarine1.isSunk()) {
				p1 = true;
				break;
			}
		}

		// TODO Afficher victoire
	}
}
