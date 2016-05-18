package fr.iutvalence.mordohaycoste.battleship;

import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String player1 = scanner.nextLine();
		String player2 = scanner.nextLine();
		
		
		Game game = new Game(player1, player2);
		game.run();
	}

}
