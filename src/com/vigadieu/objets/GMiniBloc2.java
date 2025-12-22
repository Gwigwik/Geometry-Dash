package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GMiniBloc2 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GMiniBloc2 (int x, int y) {
		
		super(x, y, 100, 20);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/miniBloc2.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
