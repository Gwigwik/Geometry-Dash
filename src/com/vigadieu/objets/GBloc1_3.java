package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc1_3 extends GObjet { // 2 = largeur et 1 = hauteur

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc1_3 (int x, int y) {
		
		super(x, y, 50, 150);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc1_3.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
