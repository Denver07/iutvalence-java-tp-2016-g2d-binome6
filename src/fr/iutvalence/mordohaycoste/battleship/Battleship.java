package fr.iutvalence.mordohaycoste.battleship;

import java.util.Scanner;

/**
 * 
 * @author costecle
 *
 */
public class Battleship {
	/**
	 * 
	 *Class to get the name of each player and create a new class game and run it.
 * 
	 */
	public static void main(String[] args) {
		System.out.println("Enter the name of the player 1");
		Scanner scanner = new Scanner(System.in);
		String player1 = scanner.nextLine();
		System.out.println("Enter the name of the player 2");
		Scanner scanner2 = new Scanner(System.in);
		String player2 = scanner.nextLine();
		
		
		Game game = new Game(player1, player2);
		game.run();
		scanner.close();
	}

}
