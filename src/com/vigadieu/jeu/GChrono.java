package com.vigadieu.jeu;

public class GChrono implements Runnable{

	private final int PAUSE = 2;
	private final int PAUSEMORT = 1000;
	
	public void run() {

		while (true) {
			
			if (GMain.scene.getEtapes() <=2) {
				GMain.scene.repaint();
				
			}
			
			if (GMain.scene.getEtapes() == 3) {
				GMain.scene.repaint();
				
				try {
					Thread.sleep(PAUSE);
				} catch (InterruptedException e) {
					e.printStackTrace();}
			}
			
			if (GMain.scene.getEtapes() == 4) {
				GMain.scene.repaint();
				
				try {
					Thread.sleep(PAUSEMORT);
				} catch (InterruptedException e) {
					e.printStackTrace();}
				GMain.scene.setEtapes(5);
				GMain.scene.repaint();
			}
			if (GMain.scene.getEtapes() == 5) {
				GMain.scene.repaint();
			}
		}
	}

}
