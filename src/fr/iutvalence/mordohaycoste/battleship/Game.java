package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.AircraftCarrier;
import fr.iutvalence.mordohaycoste.battleship.boat.Boat;
import fr.iutvalence.mordohaycoste.battleship.boat.Destroyer;
import fr.iutvalence.mordohaycoste.battleship.boat.PatrolBoat;
import fr.iutvalence.mordohaycoste.battleship.boat.ShipBattle;
import fr.iutvalence.mordohaycoste.battleship.boat.Submarine;

import java.util.Scanner;

/**
 * 
 * @author costecle
 *Class game initializes each boat for the 2 players. They are put on their proper Grid.
 */
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

	Grid GridTab[][] = new Grid[2][2];
	

	private final Player p1;
	private final Player p2;

	public Player getP1() {
		return p1;
	}

	public Player getP2() {
		return p2;
	}

/**
 * Creates grids and players.
 */
	public Game(String player1, String player2) {
		p1 = new Player(player1, 1);
		p2 = new Player(player2, 2);
		GridTab[0][0] = new Grid(1, 1);
		GridTab[0][1]= new Grid(1, 2);
		GridTab[1][0] = new Grid(2, 1);
		GridTab[1][1] = new Grid(2, 2);
	}
	
	/**
	 * 
	 * @param player
	 * @param boat
	 * Get the position, the abscissa, the ordinate, and the direction of each boat to put them on the grid.
	 * 
	 */
	public void PlacerBateau(int player, Boat boat){
			Scanner scanner = new Scanner(System.in);
			boolean testBoat = false;
			while(!testBoat)
			{
				
				System.out.println("Player " + player + ", please enter the position of the " + boat.getName());

				System.out.println("Enter the abscissa of the boat");
				int positionXBateauA = scanner.nextInt();
				System.out.println("Enter the ordinate of the boat");
				int positionYBateauA = scanner.nextInt();
				System.out.println("Enter the direction of the boat, type 0 for horizontal direction, type 1 for vertical direction ");
				int orientationBateauA = scanner.nextInt();
				
				if(orientationBateauA==0){
					testBoat = GridTab[player - 1][0].putBoat(boat,positionXBateauA,positionYBateauA,Direction.HORIZONTAL);
				}
				else{
					testBoat = GridTab[player - 1][0].putBoat(boat,positionXBateauA,positionYBateauA,Direction.VERTICAL);
				}
				
				if(!testBoat)
					System.err.println("Please replace the boat");
			}
		}

/**
 * Function to initialize boats in the grid of the player 1
 */
		public void initJoueur1(){
		PlacerBateau(1, Aircraftcarrier1);
		PlacerBateau(1, ShipBattle1);
		PlacerBateau(1, Destroyer1);
		PlacerBateau(1, PatrolBoat1);
		PlacerBateau(1, Submarine1);
		
	}
/**
 *  * Function to initialize boats in the grid of the player 2
 */
	public void initJoueur2(){
		PlacerBateau(2, Aircraftcarrier2);
		PlacerBateau(2, ShipBattle2);
		PlacerBateau(2, Destroyer2);
		PlacerBateau(2, PatrolBoat2);
		PlacerBateau(2, Submarine2);	
	}
	/**
	 * Start the game and progress it.
	 */
	public void run() {
		initJoueur1();
		initJoueur2();

		boolean loose1=false, loose2=false;
		Scanner scanner = new Scanner(System.in);
/**
 * Condition in order to ask to the player where on the grid they want to shot while nobody already won the game. 
 */
		while(!loose1 &&!loose2){
			System.out.println("Turn of the player 1");

			GridTab[0][0].print();
			GridTab[0][1].print();

			System.out.println("Enter the abscissa of the shot");
			int shotA = scanner.nextInt();
			System.out.println("Enter the ordinate of the shot");
			int shotO = scanner.nextInt();

			GridTab[1][0].shot(shotA,shotO);
			GridTab[0][1].shot(shotA,shotO);
/**
 * If every boat is sunk, the game is ended and the player who still have at least one boat alive won the game.
 */
			if (Aircraftcarrier2.isSunk() && ShipBattle2.isSunk() && Destroyer2.isSunk() && PatrolBoat2.isSunk() && Submarine2.isSunk()) {
				loose2 = true;
				break;
			}

			System.out.println("Turn of the player 2");

			GridTab[1][0].print();
			GridTab[1][1].print();

			System.out.println("Enter the abscissa of the shot");
			shotA = scanner.nextInt();
			System.out.println("Enter the ordinate of the shot");
			shotO = scanner.nextInt();
			
			GridTab[0][0].shot(shotA,shotO);
			GridTab[1][1].shot(shotA,shotO);
			/**
			 * If every boat is sunk, the game is ended and the player who still have at least one boat alive won the game.
			 */
			if (Aircraftcarrier1.isSunk() && ShipBattle1.isSunk() && Destroyer1.isSunk() && PatrolBoat1.isSunk() && Submarine1.isSunk()) {
				loose1= true;
				break;
			}
		}
		/**
		 * Print the result
		 */
		if(loose1=true){
			System.out.println("Player 1 :" +p1.name+ " lost" + "Player 2 :" +p2.name+" won");
		}
		else{
			System.out.println("Player 2" +p2.name+ "lost" + "Player 1" +p1.name+"won");
		}

		
	}
}

