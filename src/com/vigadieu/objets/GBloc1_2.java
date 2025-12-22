package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc1_2 extends GObjet { // 2 = largeur et 1 = hauteur

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc1_2 (int x, int y) {
		
		super(x, y, 50, 100);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc1_2.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
