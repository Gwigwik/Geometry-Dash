package com.vigadieu.objets;

import javax.swing.ImageIcon;

public class GBloc22_2 extends GObjet {

	// VARIABLES//
	
	// CONSTRUCTEUR//
	public GBloc22_2 (int x, int y) {
		
		super(x, y, 1100, 100);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/bloc22_2.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
	// GETTERS
		
	// SETTERS//
		
	// METHODES//
	
}
