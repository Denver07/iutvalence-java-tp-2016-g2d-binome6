package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.Boat;

import static fr.iutvalence.mordohaycoste.battleship.Direction.*;

public class Grid {
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	public static int numplayer;
	public static int numgrille;

	private final Case[][] grid;

	public Grid(int player, int numgrille){
		this.grid = new Case[WIDTH][HEIGHT];

		for(int i=0;i<WIDTH;i++){
			for(int j = 0;j<HEIGHT;j++){
				this.grid[i][j] = new Case();
			}
		}
	}

	// TODO Placer un bateau

	public boolean putBoat(Boat boat, int x, int y, Direction direction) {
		int i;
		if(direction == HORIZONTAL){
			for(i=y;i<y+boat.health();i++){
				if(!this.grid[x][i].isEmpty()){
					return false;
				}
			}

			for(i=y;i<y+boat.health();i++){
				this.grid[x][i].setBoat(boat);
			}
		}
		else{
			for(i=x;i<x+boat.health();i++){

				if(!this.grid[i][y].isEmpty()){
					return false;
				}
			}

			for(i=x;i<x+boat.health();i++){
				this.grid[i][y].setBoat(boat);
			}

		}

		return true;
	}

	public void shot(int x, int y) {
		grid[x][y].shot();
	}

	public void print() {
		for(int i=0;i<WIDTH;i++){
			System.out.print("\n|");
			for(int j = 0;j<HEIGHT;j++){
				System.out.print(this.grid[i][j] + "|");
				
			}
		}		
	}
}
