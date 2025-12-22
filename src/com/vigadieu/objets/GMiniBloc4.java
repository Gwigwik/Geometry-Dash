package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GMiniBloc4 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GMiniBloc4 (int x, int y) {
		
		super(x, y, 200, 20);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/miniBloc4.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
