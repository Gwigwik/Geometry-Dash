package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GSpike4 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GSpike4 (int x, int y) {
		
		super(x, y, 175, 50); // car le cube ne peut pas toucher l'autre moitié et pour éviter les problèmes de hitbox
		super.icoObjet = new ImageIcon(getClass().getResource("/images/spike4.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
