
public class Grid {
	public static final int WIDTH=10;
	public static final int HEIGHT=10;
	
	private final int numplayer;
	private final Case grid[][];
	private final int numgrille;
	
	public Grid(int player, int numgrille){
		this.grid = new Case[WIDTH][HEIGHT];
		this.numplayer = player;
		this.numgrille = numgrille;
	}
}
