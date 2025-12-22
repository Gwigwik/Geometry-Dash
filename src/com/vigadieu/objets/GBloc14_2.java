package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc14_2 extends GObjet { // 2 = largeur et 1 = hauteur

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc14_2 (int x, int y) {
		
		super(x, y, 700, 100);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc14_2.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
