import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;


public class game extends Observable{
	private int[][] solution;
	private int[][] game;
	private boolean[][] check;
	private int selectedNumber;
	private boolean help;
	
	public game(){
		
	}
	
	
	
	
	private int[][] generateSolution(int[][] game, int index){
		if(index >80) return game;
		
		int x = index % 9;
		int y = index / 9;
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i <=9; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		while(numbers.size()>0){
			int number = getNextPossibleNumber(game,x,y,numbers);
		}
		return game;
	}




	private int getNextPossibleNumber(int[][] game2, int x, int y,
			List<Integer> numbers) {
		// TODO Auto-generated method stub
		return 0;
	}
}
