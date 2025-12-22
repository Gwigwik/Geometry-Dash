package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GMiniSpike1 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GMiniSpike1 (int x, int y) {
		
		super(x, y, 25, 20); // 25 car le cube ne peut pas toucher l'autre moitié et pour éviter les problèmes de hitbox
		super.icoObjet = new ImageIcon(getClass().getResource("/images/miniSpike1.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}