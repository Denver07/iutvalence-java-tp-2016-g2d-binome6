package fr.iutvalence.mordohaycoste.battleship;

import fr.iutvalence.mordohaycoste.battleship.boat.Boat;

import static fr.iutvalence.mordohaycoste.battleship.Direction.*;

public class Grid {
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	
	private final Case[][] grid;
	
	public Grid(int player, int numgrille){
		int i,j;
		this.grid = new Case[WIDTH][HEIGHT];
		for(i=0;i<WIDTH;i++){
			for(j = 0;j<HEIGHT;j++){
				this.grid[i][j].presence= false;
			}
		}
	}
	
	// TODO Placer un bateau
	
	public void putBoat(Boat boat, int x, int y, Direction direction) {
		 int i;
		 if(direction == HORIZONTAL){
			 for(i=y;i<y+boat.health();i++){
				this.grid[x][i].presence= true;
					
				
			 }
		 }
		 else{
			 for(i=x;i<x+boat.health();i++){
					this.grid[i][y].presence= true;
					
				
			 }
		 }
			
		
	}
}
