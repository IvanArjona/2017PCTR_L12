package p012;

public class HiloBoard implements Runnable {

	private final Board board;
	
	public HiloBoard(Board board){
		this.board = board;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				// Pinta el tablero
				board.repaint();
				Thread.sleep(10);
			}
		}catch(InterruptedException ex){
			// Termina
			return;
		}
		
	}
	

}
