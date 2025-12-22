package com.vigadieu.jeu;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.vigadieu.objets.GObjet;

public class GCube {

		//VARIABLES//
		private Image imgCube;
		private ImageIcon icoCube;
		private String str;
		public String strSkin;
		
		private boolean saut; //pour pouvoir voir s'il est en saut (true = saute)
		private int compteurSaut;
		
		int rotation;
		
		private int y; //enlevé largeur et hauteur car que 1 perso
		
		//CONSTRUCTEUR//
		public GCube (int y) {

		this.y = y; 
		
		
		this.rotation = 50;
		this.icoCube = new ImageIcon(getClass().getResource("/images/cube2_1.png"));
		this.imgCube = this.icoCube.getImage();
		
		this.saut = false;
		this.compteurSaut = 0;
		}
		
		//GETTERS//
		
		public Image getImgCube() { return imgCube; }
		
		public ImageIcon getIcoCube() { return icoCube; }

		public int getY() { return y; }
		
		public boolean isSaut() { return saut; }
		
		public int getRotation() { return rotation; }
		
		//SETTERS//

		public void setSaut(boolean saut) { this.saut = saut; }

		public void setY(int y) { this.y = y; }
		
		public void setRotation(int rotation) { this.rotation = rotation; }

		public void setCompteurSaut(int compteurSaut) { this.compteurSaut = compteurSaut; }
		
		public void setStrSkin(String strSkin) { this.strSkin = strSkin; }
		
		
		//METHODES
	
		
		public boolean proche (GObjet objet) {
			if (250 > objet.getX() - 5 && 200 < objet.getX() + objet.getLargeur() + 5 && this.y < objet.getY() + objet.getHauteur() + 5 && this.y + 50 > objet.getY() - 5)
			{ return true; }
			else { return false; }
		}

		public boolean contactAvant (GObjet objet ) {
			
			if ( objet.getX() != 245 || // 200 c'est le x du cube
				this.y + 50 <= objet.getY() || this.y >= objet.getY() + objet.getHauteur()) { return false; } // 50 c'est largeur et hauteur du cube
			else { return true; }
		}
		
		public boolean contactDessous (GObjet objet) {
			
			if (250 > objet.getX() && 200 < objet.getX() + objet.getLargeur() && this.y + 50 == objet.getY())
			{ return true; } else { return false; }
		}
		
		public boolean contactDessus (GObjet objet) {
			
			if (250 > objet.getX() && 200 < objet.getX() + objet.getLargeur() && this.y == objet.getY() + objet.getHauteur() -5)
			{ return true; } else { return false; }
		}
		
		
		public boolean procheSpike (GObjet objet) {
			if (250 > objet.getX() - 5 && 200 < objet.getX() + objet.getLargeur() + 5 && this.y < objet.getY() + objet.getHauteur() + 5 && this.y + 50 > objet.getY() - 5)
			{ return true; }
			else { return false; }
		}
		
		public boolean contactAvantSpike (GObjet objet ) {
			
			if ( objet.getX() != 224 || // 200 c'est le x du cube
				this.y + 50 <= objet.getY() || this.y >= objet.getY() + objet.getHauteur()) { return false; } // 50 c'est largeur et hauteur du cube
			else { return true; }
		}
		
		public boolean contactDessousSpike (GObjet objet) {
			
			if (227 > objet.getX() && 200 < objet.getX() + objet.getLargeur() && this.y + 50 == objet.getY()) // 227 au lieu de 250 pour éviter les prblèmes de collision
			{ return true; } else { return false; }
		}
		
		public boolean contactDessusSpike (GObjet objet) {
			
			if (250 > objet.getX() && 200 < objet.getX() + objet.getLargeur() && this.y == objet.getY() + objet.getHauteur() -5)
			{ return true; } else { return false; }
		}
		
		public Image marche() { //état lorsque espace n'est pas pressé
			if (rotation == 0 || rotation == 50) { str = "1";} // 50 seulement au tout debut
			if (rotation == 100) { str = "2";}
			if (rotation == 200) { str = "3";}
			if (rotation == 300) { str = "4";}
			icoCube = new ImageIcon(getClass().getResource("/images/cube" + strSkin + "_" + str + ".png"));
			imgCube = icoCube.getImage(); 
			return imgCube;
		}
		
		
		public Image saute() {
			
			this.compteurSaut++;
			
			//montée du saut
			if (this.compteurSaut <= 120) {
				if (y > 0) { y = y - 2;
				rotation ++;
				if (rotation == 0) { str = "1";}
				if (rotation == 100) { str = "2";}
				if (rotation == 200) { str = "3";}
				if (rotation == 300) { str = "4";}
				icoCube = new ImageIcon(getClass().getResource("/images/cube" + strSkin + "_" + str + ".png"));
				imgCube = icoCube.getImage(); 
				if (rotation >= 400) { rotation = -1; }
				}
				
			//retombée du saut
			} else if (y + 50 < GMain.scene.getySol()) { 
			rotation ++;
			if (rotation == 0) { str = "1";}
			if (rotation == 100) { str = "2";}
			if (rotation == 200) { str = "3";}
			if (rotation == 300) { str = "4";}
			icoCube = new ImageIcon(getClass().getResource("/images/cube" + strSkin + "_" + str + ".png"));
			imgCube = icoCube.getImage(); 
			if (rotation >= 400) { rotation = -1; }
			//saut terminé
			} else {
				this.saut = false;
				this.compteurSaut = 0;
				imgCube = icoCube.getImage();
				if ( rotation >= 0 && rotation < 100 ) { rotation = 50; }
				if ( rotation >= 100 && rotation < 200 ) { rotation = 150; }
				if ( rotation >= 200 && rotation < 300 ) { rotation = 250; }
				if ( rotation >= 300 ) { rotation = 350; }
				
			}
			
			return imgCube;
		}
			

		
}
