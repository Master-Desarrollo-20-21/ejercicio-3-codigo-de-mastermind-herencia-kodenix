
public class MasterMind {
	
	private Board board;
	
	MasterMind() {
		
	}
	
	public void play() {
		do {
			this.board = new Board();
			this.board.play();
		} while (this.isResumed());
	}
	
	private boolean isResumed() {
		
		return false;
	}
	
	public static void main(String[] args) {
		new MasterMind().play();

	}


}
