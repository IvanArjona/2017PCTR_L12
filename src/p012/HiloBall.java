package p012;

public class HiloBall implements Runnable {

	private final Ball ball;
	
	public HiloBall(Ball ball){
		this.ball = ball;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				// Mueve
				ball.move();
				ball.reflect();
				Thread.sleep(10);
			}
		}catch(InterruptedException ex){
			// Deja de mover
			return;
		}
		
	}
	

}
