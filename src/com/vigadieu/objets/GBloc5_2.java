package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc5_2 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc5_2 (int x, int y) {
		
		super(x, y, 250, 100);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc5_2.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
