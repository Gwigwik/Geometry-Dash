package com.vigadieu.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GClavier implements KeyListener {

	public void keyPressed(KeyEvent e) {
		
		if (GMain.scene.cube.getY() + 50 == GMain.scene.getySol() ) { // pour l'empecher de sauter quand il chute d'un bloc
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				GMain.scene.cube.setSaut (true);
			}
		}
		
		if (GMain.scene.getEtapes() == 5) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				GMain.scene.rejouerEspace();
			}
		}
		
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}
}
