package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc11_1 extends GObjet { // 2 = largeur et 1 = hauteur

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc11_1 (int x, int y) {
		
		super(x, y, 550, 50);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc11_1.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
