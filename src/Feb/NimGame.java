package Feb;

public class NimGame {

	public static void main(String arg[]){
		int noOfStones = 8;
		NimGame ng = new NimGame();
		boolean result = ng.nimGame(noOfStones);
		System.out.println(result);
	}
	public boolean nimGame(int noOfStones){		
		return noOfStones % 4 != 0;
	}
}
