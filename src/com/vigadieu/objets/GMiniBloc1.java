package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GMiniBloc1 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GMiniBloc1 (int x, int y) {
		
		super(x, y, 50, 20);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/miniBloc1.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
