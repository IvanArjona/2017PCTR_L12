package p012;

public class HiloBall implements Runnable {

	private final Ball ball;
	private final Board board;
	
	public HiloBall(Ball ball, Board board){
		this.ball = ball;
		this.board = board;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				// Mueve
				ball.move();
				ball.reflect();
				board.repaint();
				Thread.sleep(100);
			}
		}catch(InterruptedException ex){
			// Para las bolas
		}
		
	}
	

}
