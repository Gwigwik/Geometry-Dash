package com.vigadieu.jeu;

import javax.swing.JFrame;

import com.vigadieu.jeu.GScene;

public class GMain {

	public static GScene scene; // = variable accessible de partout

	public static void main(String[] args) {

		// création de la fenêtre de l'application
		JFrame fenetre = new JFrame("Geometry Dash"); // = titre de la fenetre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1000, 600);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);

		// instanciation de l'objet scene
		scene = new GScene();

		fenetre.setContentPane(scene); // on associe la scène à la fenetre de l'application
		fenetre.setVisible(true);
	}

}