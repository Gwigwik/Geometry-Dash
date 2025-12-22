package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc1_1 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc1_1 (int x, int y) {
		
		super(x, y, 50, 50);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc1_1.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
