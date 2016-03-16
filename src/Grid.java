
public class Grid {
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	
	private final int numplayer;
	private final Case grid[][];
	
	public Grid(int player){
		this.grid = new Case[WIDTH][HEIGHT];
		this.numplayer = player;
	}
}
