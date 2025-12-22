package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GMiniSpike20 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GMiniSpike20 (int x, int y) {
		
		super(x, y, 975, 20); // 75 car le cube ne peut pas toucher l'autre moitié et pour éviter les problèmes de hitbox
		super.icoObjet = new ImageIcon(getClass().getResource("/images/miniSpike20.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}