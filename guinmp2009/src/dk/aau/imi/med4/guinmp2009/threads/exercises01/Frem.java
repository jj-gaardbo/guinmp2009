package dk.aau.imi.med4.guinmp2009.threads.exercises01;

public class Frem implements Runnable {
	public void run() {
		for(int i = 0; i < 10; i++) {
			FremOgTilbage.ARRAY[i] = i+1;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
