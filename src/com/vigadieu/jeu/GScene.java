package com.vigadieu.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.vigadieu.jeu.GChrono;
import com.vigadieu.jeu.GClavier;
import com.vigadieu.objets.GBloc10_1;
import com.vigadieu.objets.GBloc11_1;
import com.vigadieu.objets.GBloc14_2;
import com.vigadieu.objets.GBloc1_1;
import com.vigadieu.objets.GBloc1_2;
import com.vigadieu.objets.GBloc1_3;
import com.vigadieu.objets.GBloc22_2;
import com.vigadieu.objets.GBloc2_1;
import com.vigadieu.objets.GBloc5_2;
import com.vigadieu.objets.GBloc8_1;
import com.vigadieu.objets.GMiniBloc1;
import com.vigadieu.objets.GMiniBloc2;
import com.vigadieu.objets.GMiniBloc4;
import com.vigadieu.objets.GMiniSpike1;
import com.vigadieu.objets.GMiniSpike2;
import com.vigadieu.objets.GMiniSpike20;
import com.vigadieu.objets.GMiniSpike3;
import com.vigadieu.objets.GObjet;
import com.vigadieu.objets.GSpike1;
import com.vigadieu.objets.GSpike4;

@SuppressWarnings("serial") // pour enlever un message jaune
public class GScene extends JPanel implements ActionListener {

	// VARIABLES//
	
	private int etapes; // gere les étapes de la partie
	
	private boolean rejouer; // variable qui gère les boutons rejouer
	
	private JButton boutonMenu;
	private int valeurBoutonMenu;
	private JButton boutonRejouer;
	private int valeurBoutonRejouer;
	private JButton boutonMortVersSkin;
	private int valeurBoutonMortVersSkin;
	private JButton boutonMortVersMenu;
	private int valeurBoutonMortVersMenu;
	private JButton boutonRetour;
	private int valeurBoutonRetour;
	private JButton boutonQuitter;
	private int valeurBoutonQuitter;
	
	private ImageIcon icoBoutonMenu;
	private ImageIcon icoBoutonMortVersSkin;
	private ImageIcon icoBoutonMortVersMenu;
	private ImageIcon icoBoutonRetour;
	private ImageIcon icoBoutonQuitter;
	
	private ImageIcon icoTitre;
	private Image imgTitre;
	
	private JButton boutonSkin1;
	private int valeurBoutonSkin1;
	private ImageIcon icoSkin1;
	private JButton boutonSkin2;
	private int valeurBoutonSkin2;
	private ImageIcon icoSkin2;
	private JButton boutonSkin3;
	private int valeurBoutonSkin3;
	private ImageIcon icoSkin3;
	private JButton boutonSkin4;
	private int valeurBoutonSkin4;
	private ImageIcon icoSkin4;
	private JButton boutonSkin5;
	private int valeurBoutonSkin5;
	private ImageIcon icoSkin5;
	private JButton boutonSkin6;
	private int valeurBoutonSkin6;
	private ImageIcon icoSkin6;
	private JButton boutonSkin7;
	private int valeurBoutonSkin7;
	private ImageIcon icoSkin7;
	private JButton boutonSkin8;
	private int valeurBoutonSkin8;
	private ImageIcon icoSkin8;
	
	private ImageIcon icoFond;
	private Image imgFond1;
	
	private ImageIcon icoFondMort;
	private Image imgFondMort;
	
	private ImageIcon icoFondMenu;
	private Image imgFondMenu;

	private ImageIcon icoSol;
	private Image imgSol;
	private int i = 0;
	
	private int xFondInt;
	private double xFondCompteur;
	private int xSol;
	private int ySol; //hauteur courante du sol pour gérer les collisions
	
	
	public GCube cube;
	
	public GBloc1_1 bloc1_1_1;
	public GBloc1_1 bloc1_1_2;
	public GBloc1_1 bloc1_1_3;
	public GBloc1_1 bloc1_1_4;
	public GBloc1_1 bloc1_1_5;
	
	public GBloc1_2 bloc1_2_1;
	
	public GBloc1_3 bloc1_3_1;
	
	public GBloc2_1 bloc2_1_1;
	
	public GBloc5_2 bloc5_2_1;
	
	public GBloc8_1 bloc8_1_1;
	
	public GBloc10_1 bloc10_1_1;
	
	public GBloc11_1 bloc11_1_1;
	
	public GBloc14_2 bloc14_2_1;
	
	public GBloc22_2 bloc22_2_1;
	
	public GMiniBloc1 miniBloc1_1; //miniBloc et miniSpike n'ont qu'un _ car ils font toujours 1 case de hauteur
	public GMiniBloc1 miniBloc1_2;
	public GMiniBloc1 miniBloc1_3;
	public GMiniBloc1 miniBloc1_4;
	
	public GMiniBloc2 miniBloc2_1;
	public GMiniBloc2 miniBloc2_2;
	
	public GMiniBloc4 miniBloc4_1;
	
	public GSpike1 spike1_1;
	public GSpike1 spike1_2;
	public GSpike1 spike1_3;
	public GSpike1 spike1_4;
	public GSpike1 spike1_5;
	public GSpike1 spike1_6;
	public GSpike1 spike1_7;
	public GSpike1 spike1_8;
	public GSpike1 spike1_9;
	public GSpike1 spike1_10;
	
	public GSpike4 spike4_1;
	public GSpike4 spike4_2;
	public GSpike4 spike4_3;
	
	public GMiniSpike1 miniSpike1_1;
	public GMiniSpike1 miniSpike1_2;
	
	public GMiniSpike2 miniSpike2_1;
	
	public GMiniSpike3 miniSpike3_1;
	public GMiniSpike3 miniSpike3_2;
	public GMiniSpike3 miniSpike3_3;
	public GMiniSpike3 miniSpike3_4;
	
	public GMiniSpike20 miniSpike20_1;
	
	private ArrayList<GObjet> tabObjets; // enregistre tous les objets du jeu
	private ArrayList<GObjet> tabSpikes;
	
	// CONSTRUCTEUR//
	public GScene() {

		super();

		this.etapes = 1;
		
		this.rejouer = false;
		
		this.valeurBoutonMenu = 0;
		this.valeurBoutonRejouer = 0;
		this.valeurBoutonMortVersSkin = 0;
		this.valeurBoutonMortVersMenu = 0;
		this.valeurBoutonRetour = 0;
		this.valeurBoutonQuitter = 0;
		
		this.valeurBoutonSkin1 = 0;
		this.valeurBoutonSkin2 = 0;
		this.valeurBoutonSkin3 = 0;
		this.valeurBoutonSkin4 = 0;
		this.valeurBoutonSkin5 = 0;
		this.valeurBoutonSkin6 = 0;
		this.valeurBoutonSkin7 = 0;
		this.valeurBoutonSkin8 = 0;
		
		this.xFondInt = 0;
		this.xFondCompteur = 0;
		this.ySol = 450;
		this.xSol = 0;
		
		icoSkin1 = new ImageIcon(getClass().getResource("/images/cube1_1.png"));
		icoSkin2 = new ImageIcon(getClass().getResource("/images/cube2_1.png"));
		icoSkin3 = new ImageIcon(getClass().getResource("/images/cube3_1.png"));
		icoSkin4 = new ImageIcon(getClass().getResource("/images/cube4_1.png"));
		icoSkin5 = new ImageIcon(getClass().getResource("/images/cube5_1.png"));
		icoSkin6 = new ImageIcon(getClass().getResource("/images/cube6_1.png"));
		icoSkin7 = new ImageIcon(getClass().getResource("/images/cube7_1.png"));
		icoSkin8 = new ImageIcon(getClass().getResource("/images/cube8_1.png"));
		
		icoTitre = new ImageIcon(getClass().getResource("/images/titre.png"));
		this.imgTitre = this.icoTitre.getImage();
		icoSol = new ImageIcon(getClass().getResource("/images/sol.png"));
		this.imgSol = this.icoSol.getImage();
		icoFond = new ImageIcon(getClass().getResource("/images/fond1.png"));
		this.imgFond1 = this.icoFond.getImage();
		icoFondMort = new ImageIcon(getClass().getResource("/images/fondMort.png"));
		this.imgFondMort = this.icoFondMort.getImage();
		icoFondMenu = new ImageIcon(getClass().getResource("/images/fondMenu.png"));
		this.imgFondMenu = this.icoFondMenu.getImage();
		
		icoBoutonMenu = new ImageIcon(getClass().getResource("/images/boutonMenu.png"));
		icoBoutonMortVersSkin = new ImageIcon(getClass().getResource("/images/boutonMortVersSkin.png"));
		icoBoutonMortVersMenu = new ImageIcon(getClass().getResource("/images/boutonMortVersMenu.png"));
		icoBoutonRetour = new ImageIcon(getClass().getResource("/images/boutonFlecheRetour.png"));
		icoBoutonQuitter = new ImageIcon(getClass().getResource("/images/boutonFlecheQuitter.png"));
		
		cube = new GCube(400);
		
		bloc1_1_1 = new GBloc1_1(2050,400); 
		bloc1_1_2 = new GBloc1_1(10000,350);
		bloc1_1_3 = new GBloc1_1(10000,300);
		bloc1_1_4 = new GBloc1_1(10000,325);
		bloc1_1_5 = new GBloc1_1(10000,300);
		
		bloc1_2_1 = new GBloc1_2(2250,350);
		
		bloc1_3_1 = new GBloc1_3(2450,300);
		
		bloc2_1_1 = new GBloc2_1(10000,275);
		
		bloc5_2_1 = new GBloc5_2(8250,350);
		
		bloc8_1_1 = new GBloc8_1(3700,400);
		
		bloc10_1_1 = new GBloc10_1(7750,400);
		
		bloc11_1_1 = new GBloc11_1(4250,400);
		
		bloc14_2_1 = new GBloc14_2(4950,350);
		
		bloc22_2_1 = new GBloc22_2(6650,350);
		
		miniBloc1_1 = new GMiniBloc1(5800,300);
		miniBloc1_2 = new GMiniBloc1(6000,250); 
		miniBloc1_3 = new GMiniBloc1(6200,200); 
		miniBloc1_4 = new GMiniBloc1(6400,150);
		
		miniBloc2_1 = new GMiniBloc2(7000,260); // 260 car sinon  ce saut trop complexe
		miniBloc2_2 = new GMiniBloc2(7400,260);
		
		miniBloc4_1 = new GMiniBloc4(7900,300);
		
		
		spike1_1 = new GSpike1(1000,400);
		spike1_2 = new GSpike1(1500,400);
		spike1_3 = new GSpike1(2000,400);
		spike1_4 = new GSpike1(1950,400);
		spike1_5 = new GSpike1(3200,400);
		spike1_6 = new GSpike1(3250,400);
		spike1_7 = new GSpike1(4500,350);
		spike1_8 = new GSpike1(5300,300);
		spike1_9 = new GSpike1(8450,300);
		spike1_10 = new GSpike1(8500,350);
		
		spike4_1 = new GSpike4(6950,300);
		spike4_2 = new GSpike4(7350,300);
		spike4_3 = new GSpike4(7900,250);
		
		miniSpike1_1 = new GMiniSpike1(1450, 430);
		miniSpike1_2 = new GMiniSpike1(10000, 430);
		
		miniSpike2_1 = new GMiniSpike2(10000, 430);
		
		miniSpike3_1 = new GMiniSpike3(2100, 430);
		miniSpike3_2 = new GMiniSpike3(2300, 430);
		miniSpike3_3 = new GMiniSpike3(4100, 430);
		miniSpike3_4 = new GMiniSpike3(4800, 430);
		
		miniSpike20_1 = new GMiniSpike20(5650, 430);
		
		tabObjets = new ArrayList<GObjet>();
		tabSpikes = new ArrayList<GObjet>();

		this.tabObjets.add(bloc1_1_1);
		this.tabObjets.add(bloc1_1_2);
		this.tabObjets.add(bloc1_1_3);
		this.tabObjets.add(bloc1_1_4);
		this.tabObjets.add(bloc1_1_5);
		
		this.tabObjets.add(bloc1_2_1);
		
		this.tabObjets.add(bloc1_3_1);
		
		this.tabObjets.add(bloc2_1_1);
		
		this.tabObjets.add(bloc5_2_1);
		
		this.tabObjets.add(bloc8_1_1);

		this.tabObjets.add(bloc10_1_1);
		
		this.tabObjets.add(bloc11_1_1);
		
		this.tabObjets.add(bloc14_2_1);
		
		this.tabObjets.add(bloc22_2_1);
		
		this.tabObjets.add(miniBloc1_1);
		this.tabObjets.add(miniBloc1_2);
		this.tabObjets.add(miniBloc1_3);
		this.tabObjets.add(miniBloc1_4);
		
		this.tabObjets.add(miniBloc2_1);
		this.tabObjets.add(miniBloc2_2);
		
		this.tabObjets.add(miniBloc4_1);
		
		
		this.tabSpikes.add(spike1_1);
		this.tabSpikes.add(spike1_2);
		this.tabSpikes.add(spike1_3);
		this.tabSpikes.add(spike1_4);
		this.tabSpikes.add(spike1_5);
		this.tabSpikes.add(spike1_6);
		this.tabSpikes.add(spike1_7);
		this.tabSpikes.add(spike1_8);
		this.tabSpikes.add(spike1_9);
		this.tabSpikes.add(spike1_10);
		
		this.tabSpikes.add(spike4_1);
		this.tabSpikes.add(spike4_2);
		this.tabSpikes.add(spike4_3);
		
		this.tabSpikes.add(miniSpike1_1);
		this.tabSpikes.add(miniSpike1_2);
		
		this.tabSpikes.add(miniSpike2_1);
		
		this.tabSpikes.add(miniSpike3_1);
		this.tabSpikes.add(miniSpike3_2);
		this.tabSpikes.add(miniSpike3_3);
		this.tabSpikes.add(miniSpike3_4);
		
		this.tabSpikes.add(miniSpike20_1);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new GClavier());

		Thread chronoEcran = new Thread(new GChrono());// creation d'un programme indé qui va tourner en fond
		chronoEcran.start();
		
	
	}
	
	
	// GETTERS//

	public int getySol() { return ySol; }

	public int getEtapes() { return etapes; }
	
	// SETTERS//

	public void setySol(int ySol) { this.ySol = ySol; }
	
	public void setEtapes(int etapes) { this.etapes = etapes; }

	// METHODES//
	
	private void rejouer() {
		bloc1_1_1.setX(2050);
		bloc1_1_2.setX(10000);
		bloc1_1_3.setX(10000);
		bloc1_1_4.setX(10000);
		bloc1_1_5.setX(10000);
		
		bloc1_2_1.setX(2250);
		
		bloc1_3_1.setX(2450);
		
		bloc2_1_1.setX(10000);
		
		bloc5_2_1.setX(8250);
		
		bloc8_1_1.setX(3700);
		
		bloc10_1_1.setX(7750);
		
		bloc11_1_1.setX(4250);
		
		bloc14_2_1.setX(4950);
		
		bloc22_2_1.setX(6650);
		
		miniBloc1_1.setX(5800);
		miniBloc1_2.setX(6000);
		miniBloc1_3.setX(6200);
		miniBloc1_4.setX(6400);
		
		miniBloc2_1.setX(7000);
		miniBloc2_2.setX(7400);
		
		miniBloc4_1.setX(7900);
		
		spike1_1.setX(1000);
		spike1_2.setX(1500);
		spike1_3.setX(2000);
		spike1_4.setX(1950);
		spike1_5.setX(3200);
		spike1_6.setX(3250);
		spike1_7.setX(4500);
		spike1_8.setX(5300);
		spike1_9.setX(8450);
		spike1_10.setX(8500);
		
		spike4_1.setX(6950);
		spike4_2.setX(7350);
		spike4_3.setX(7900);
		
		miniSpike1_1.setX(1450);
		miniSpike1_2.setX(10000);
		
		miniSpike2_1.setX(10000);
		
		miniSpike3_1.setX(2100);
		miniSpike3_2.setX(2300);
		miniSpike3_3.setX(4100);
		miniSpike3_4.setX(4800);
		
		miniSpike20_1.setX(5650);
		
		xFondInt = 0;
		xFondCompteur = 0;
		xSol = 0;
		ySol = 450;
		
		cube.setY(400);
		cube.setCompteurSaut(0);
		cube.setRotation(50);
		
		this.valeurBoutonMenu = 0;
		this.valeurBoutonRejouer = 0;
		
		GMain.scene.cube.setSaut(false);
		rejouer = false;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.boutonMenu) { //= si l'evenement vient du bouton
			etapes = 2;
		}
		if(e.getSource() == this.boutonQuitter) { //= si l'evenement vient du bouton
			System.exit(0);
		}
		
		if (e.getSource() == this.boutonRetour) {
			etapes = 1;
			valeurBoutonSkin1 = 0;
			valeurBoutonSkin2 = 0;
			valeurBoutonSkin3 = 0;
			valeurBoutonSkin4 = 0;
			valeurBoutonSkin5 = 0;
			valeurBoutonSkin6 = 0;
			valeurBoutonSkin7 = 0;
			valeurBoutonSkin8 = 0;
			remove(boutonRetour);
			remove(boutonSkin1);
			remove(boutonSkin2);
			remove(boutonSkin3);
			remove(boutonSkin4);
			remove(boutonSkin5);
			remove(boutonSkin6);
			remove(boutonSkin7);
			remove(boutonSkin8);
			valeurBoutonMenu = 0;
			valeurBoutonQuitter = 0;
		}
		
		if(e.getSource() == this.boutonMortVersSkin) {
			etapes = 2;
			rejouer = true;
			repaint();
			valeurBoutonSkin1 = 0;
			valeurBoutonSkin2 = 0;
			valeurBoutonSkin3 = 0;
			valeurBoutonSkin4 = 0;
			valeurBoutonSkin5 = 0;
			valeurBoutonSkin6 = 0;
			valeurBoutonSkin7 = 0;
			valeurBoutonSkin8 = 0;
			remove(boutonRejouer);
			remove(boutonMortVersSkin);
			remove(boutonMortVersMenu);
			valeurBoutonMortVersSkin = 0;
			valeurBoutonMortVersMenu = 0;
			valeurBoutonQuitter = 0;
			valeurBoutonRetour = 0;
		}
		
		if(e.getSource() == this.boutonRejouer) {
			etapes = 3;
			rejouer = true;
			remove(boutonRejouer);
			remove(boutonMortVersSkin);
			remove(boutonMortVersMenu);
			valeurBoutonMortVersSkin = 0;
			valeurBoutonMortVersMenu = 0;
			repaint();
		}
		
		if(e.getSource() == this.boutonMortVersMenu ) {
			etapes = 1;
			rejouer = true;
			repaint();
			valeurBoutonSkin1 = 0;
			valeurBoutonSkin2 = 0;
			valeurBoutonSkin3 = 0;
			valeurBoutonSkin4 = 0;
			valeurBoutonSkin5 = 0;
			valeurBoutonSkin6 = 0;
			valeurBoutonSkin7 = 0;
			valeurBoutonSkin8 = 0;
			remove(boutonRejouer);
			remove(boutonMortVersSkin);
			remove(boutonMortVersMenu);
			valeurBoutonMortVersSkin = 0;
			valeurBoutonMortVersMenu = 0;
			valeurBoutonMenu = 0;
			valeurBoutonQuitter = 0;
		}
		
		
		
		if(e.getSource() == this.boutonSkin1) { cube.setStrSkin("1"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin2) { cube.setStrSkin("2"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin3) { cube.setStrSkin("3"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin4) { cube.setStrSkin("4"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin5) { cube.setStrSkin("5"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin6) { cube.setStrSkin("6"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin7) { cube.setStrSkin("7"); etapes = 3; GMain.scene.cube.setSaut(false);}
		if(e.getSource() == this.boutonSkin8) { cube.setStrSkin("8"); etapes = 3; GMain.scene.cube.setSaut(false);}
		
	}
	
	private void propBoutonMenu() {
		if (valeurBoutonMenu == 0) {
			boutonMenu = new JButton();
			this.boutonMenu.setIcon(icoBoutonMenu);
			this.add(boutonMenu);
			this.boutonMenu.addActionListener(this);
			boutonMenu.setContentAreaFilled(false);
			boutonMenu.setBorderPainted(false);
		}
	}
	
	private void propBoutonQuitter() {
		if (valeurBoutonQuitter == 0) {
			boutonQuitter = new JButton();
			this.boutonQuitter.setIcon(icoBoutonQuitter);
			this.add(boutonQuitter);
			this.boutonQuitter.addActionListener(this);
			boutonQuitter.setContentAreaFilled(false);
			boutonQuitter.setBorderPainted(false);
		}
	}
	
	private void propBoutonRetour() {
		if (valeurBoutonRetour == 0) {
			boutonRetour = new JButton();
			this.boutonRetour.setIcon(icoBoutonRetour);
			this.add(boutonRetour);
			this.boutonRetour.addActionListener(this);
			boutonRetour.setContentAreaFilled(false);
			boutonRetour.setBorderPainted(false);
		}
	}
	
	private void propBoutonRejouer() {
		if (valeurBoutonRejouer == 0) {
			boutonRejouer = new JButton();
			this.boutonRejouer.setIcon(icoBoutonMenu);
			this.add(boutonRejouer);
			this.boutonRejouer.addActionListener(this);
			boutonRejouer.setContentAreaFilled(false);
			boutonRejouer.setBorderPainted(false);
		}
	}
	
	private void propBoutonMortVersSkin() {
		if (valeurBoutonMortVersSkin == 0) {
			boutonMortVersSkin = new JButton();
			this.boutonMortVersSkin.setIcon(icoBoutonMortVersSkin);
			this.add(boutonMortVersSkin);
			this.boutonMortVersSkin.addActionListener(this);
			boutonMortVersSkin.setContentAreaFilled(false);
			boutonMortVersSkin.setBorderPainted(false);
		}
	}
	
	private void propBoutonMortVersMenu() {
		if (valeurBoutonMortVersMenu == 0) {
			boutonMortVersMenu = new JButton();
			this.boutonMortVersMenu.setIcon(icoBoutonMortVersMenu);
			this.add(boutonMortVersMenu);
			this.boutonMortVersMenu.addActionListener(this);
			boutonMortVersMenu.setContentAreaFilled(false);
			boutonMortVersMenu.setBorderPainted(false);
		}
	}
	
	private void propBoutonSkin1() {
		if (valeurBoutonSkin1 == 0) {
			boutonSkin1 = new JButton();
			this.boutonSkin1.setIcon(icoSkin1);
			this.add(boutonSkin1);
			this.boutonSkin1.addActionListener(this);
			boutonSkin1.setContentAreaFilled(false);
			boutonSkin1.setBorderPainted(false);
		}
	}
	
	private void propBoutonSkin2() {
		if (valeurBoutonSkin2 == 0) {
			boutonSkin2 = new JButton();
			this.boutonSkin2.setIcon(icoSkin2);
			this.add(boutonSkin2);
			this.boutonSkin2.addActionListener(this);
			boutonSkin2.setContentAreaFilled(false);
			boutonSkin2.setBorderPainted(false);
		}
	}
	
	private void propBoutonSkin3() {
		if (valeurBoutonSkin3 == 0) {
			boutonSkin3 = new JButton();
			this.boutonSkin3.setIcon(icoSkin3);
			this.add(boutonSkin3);
			this.boutonSkin3.addActionListener(this);
			boutonSkin3.setContentAreaFilled(false);
			boutonSkin3.setBorderPainted(false);
		}
	}
	private void propBoutonSkin4() {
		if (valeurBoutonSkin4 == 0) {
			boutonSkin4 = new JButton();
			this.boutonSkin4.setIcon(icoSkin4);
			this.add(boutonSkin4);
			this.boutonSkin4.addActionListener(this);
			boutonSkin4.setContentAreaFilled(false);
			boutonSkin4.setBorderPainted(false);
		}
	}
	private void propBoutonSkin5() {
		if (valeurBoutonSkin5 == 0) {
			boutonSkin5 = new JButton();
			this.boutonSkin5.setIcon(icoSkin5);
			this.add(boutonSkin5);
			this.boutonSkin5.addActionListener(this);
			boutonSkin5.setContentAreaFilled(false);
			boutonSkin5.setBorderPainted(false);
		}
	}
	private void propBoutonSkin6() {
		if (valeurBoutonSkin6 == 0) {
			boutonSkin6 = new JButton();
			this.boutonSkin6.setIcon(icoSkin6);
			this.add(boutonSkin6);
			this.boutonSkin6.addActionListener(this);
			boutonSkin6.setContentAreaFilled(false);
			boutonSkin6.setBorderPainted(false);
		}
	}
	private void propBoutonSkin7() {
		if (valeurBoutonSkin7 == 0) {
			boutonSkin7 = new JButton();
			this.boutonSkin7.setIcon(icoSkin7);
			this.add(boutonSkin7);
			this.boutonSkin7.addActionListener(this);
			boutonSkin7.setContentAreaFilled(false);
			boutonSkin7.setBorderPainted(false);
		}
	}
	private void propBoutonSkin8() {
		if (valeurBoutonSkin8 == 0) {
			boutonSkin8 = new JButton();
			this.boutonSkin8.setIcon(icoSkin8);
			this.add(boutonSkin8);
			this.boutonSkin8.addActionListener(this);
			boutonSkin8.setContentAreaFilled(false);
			boutonSkin8.setBorderPainted(false);
		}
	}
	
	public void rejouerEspace() {
		etapes = 3;
		rejouer = true;
		remove(boutonRejouer);
		remove(boutonMortVersSkin);
		remove(boutonMortVersMenu);
		valeurBoutonMortVersSkin = 0;
		valeurBoutonMortVersMenu = 0;
	}
	
	
	public void deplacementSolEtObjets() {

		this.xSol --;
		xFondCompteur ++;
		if (xFondCompteur == 8) {  // permet de faire deplacer le fond moins vite
			xFondInt --; 
			xFondCompteur = 0; }
		
		for (int i = 0; i < this.tabObjets.size(); i++) {this.tabObjets.get(i).setX(this.tabObjets.get(i).getX() - 1);}
		for (int i = 0; i < this.tabSpikes.size(); i++) {this.tabSpikes.get(i).setX(this.tabSpikes.get(i).getX() - 1);}
	}
	
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		
		if (etapes == 1) { // étape de menu
			g2.drawImage(this.imgFondMenu, -160 , 0, null); 
			g2.drawImage(this.imgFondMenu, 864 , 0, null);
			g2.drawImage(this.imgTitre, 40, 100, null);
			propBoutonMenu(); valeurBoutonMenu++;
			this.boutonMenu.setBounds(405,330,175,179);
			propBoutonQuitter(); valeurBoutonQuitter++;
			this.boutonQuitter.setBounds(5,5,75,75);
			valeurBoutonRetour = 0;
		}
		
		if (etapes == 2) { // étape de choix du skin
			remove(boutonMenu);
			remove(boutonQuitter);
			g2.drawImage(this.imgFondMenu, -160 , 0, null); 
			g2.drawImage(this.imgFondMenu, 864 , 0, null);
			propBoutonSkin1(); valeurBoutonSkin1++;
			this.boutonSkin1.setBounds(192,250,50,50);
			propBoutonSkin2(); valeurBoutonSkin2++;
			this.boutonSkin2.setBounds(374,250,50,50);
			propBoutonSkin3(); valeurBoutonSkin3++;
			this.boutonSkin3.setBounds(560,250,50,50);
			propBoutonSkin4(); valeurBoutonSkin4++;
			this.boutonSkin4.setBounds(742,250,50,50);
			propBoutonSkin5(); valeurBoutonSkin5++;
			this.boutonSkin5.setBounds(192,400,50,50);
			propBoutonSkin6(); valeurBoutonSkin6++;
			this.boutonSkin6.setBounds(374,400,50,50);
			propBoutonSkin7(); valeurBoutonSkin7++;
			this.boutonSkin7.setBounds(560,400,50,50);
			propBoutonSkin8(); valeurBoutonSkin8++;
			this.boutonSkin8.setBounds(742,400,50,50);
			propBoutonRetour(); valeurBoutonRetour++;
			this.boutonRetour.setBounds(5,5,75,75);
		}
		

		if (etapes == 3) { // étape de jeu

			if (rejouer == true) {
				rejouer();
			}
			
			remove(boutonSkin1);
			remove(boutonSkin2);
			remove(boutonSkin3);
			remove(boutonSkin4);
			remove(boutonSkin5);
			remove(boutonSkin6);
			remove(boutonSkin7);
			remove(boutonSkin8);
			remove(boutonRetour);
			this.requestFocusInWindow(); // le focus était perdu apres avoir choisi le skin
			
			
			//*
			for (int i = 0; i < this.tabSpikes.size(); i++) { // détection contact avec spikes
				if (this.cube.procheSpike(this.tabSpikes.get(i))) {
					if (this.cube.contactAvantSpike(this.tabSpikes.get(i)) || this.cube.contactDessusSpike(this.tabSpikes.get(i)) || this.cube.contactDessousSpike(this.tabSpikes.get(i))) {
						etapes = 4;
					}
				}
			}
			
			for (int i = 0; i < this.tabObjets.size(); i++) { // détection contact avec blocs
				if (this.cube.proche(this.tabObjets.get(i))) {
					if (this.cube.contactAvant(this.tabObjets.get(i)) || this.cube.contactDessus(this.tabObjets.get(i))) {
						etapes = 4;
					}
					if (this.cube.contactDessous(this.tabObjets.get(i))) {
						ySol = this.tabObjets.get(i).getY();
					} else { ySol = 450; } 
				}
			}
			//*/
			
			
			if (cube.getY() + 50 < ySol) { 
				GMain.scene.cube.setY(GMain.scene.cube.getY() + 1);  // car cube en constante chute donc pour le stopper quand touche le sol
				if (cube.isSaut()) {}
				else { 
					if (cube.getY() + 51 < ySol) {
							cube.setRotation(cube.getRotation() + 1); // car sinon changeait de skin au moment du contact avec le sol dans certains cas
						if (cube.getRotation() >= 400) { cube.setRotation(0); }
					}
				}
			}
			
			this.deplacementSolEtObjets();
			
			for (i = 0; i <= 5; i++) { g2.drawImage(this.imgFond1, xFondInt + 1024*i, 0, null); } // dessin image de fond
			for (i = 0; i <= 10; i++) { g2.drawImage(this.imgSol, this.xSol + 3072*i, 450, null); } // dessin sol en continu
			
			for (i = 0; i < this.tabObjets.size(); i++) {
				if (this.tabObjets.get(i).getX() < 1000 && this.tabObjets.get(i).getX() + this.tabObjets.get(i).getLargeur() > -50 ) { // seulement si les objets sont présents à l'écran
				g2.drawImage(this.tabObjets.get(i).getImgObjet(), this.tabObjets.get(i).getX(), this.tabObjets.get(i).getY(), null); // dessin de tous les objets
				}
			}
			
			for (i = 0; i < this.tabSpikes.size(); i++) {
				if (this.tabSpikes.get(i).getX() < 1000 && this.tabSpikes.get(i).getX() + this.tabSpikes.get(i).getLargeur() > -50 ) { // seulement si les objets sont présents à l'écran
				g2.drawImage(this.tabSpikes.get(i).getImgObjet(), this.tabSpikes.get(i).getX(), this.tabSpikes.get(i).getY(), null); // dessin de tous les objets
				}
			}
			
			if (this.cube.isSaut()) { g2.drawImage(this.cube.saute(), 200, cube.getY(), null); }
			else { g2.drawImage(this.cube.marche(), 200, cube.getY(), null); }
		}
		
		if (etapes == 4) { // étape de mort
			for (i = 0; i <= 5; i++) { g2.drawImage(this.imgFond1, xFondInt + 1024*i, 0, null); }
			for (i = 0; i <= 10; i++) { g2.drawImage(this.imgSol, this.xSol + 3072*i, 450, null); }
			
			for (i = 0; i < this.tabObjets.size(); i++) {
				if (this.tabObjets.get(i).getX() < 1000 && this.tabObjets.get(i).getX() > 0 - this.tabObjets.get(i).getLargeur()) {
				g2.drawImage(this.tabObjets.get(i).getImgObjet(), this.tabObjets.get(i).getX(), this.tabObjets.get(i).getY(), null);
				}
			}
			for (i = 0; i < this.tabSpikes.size(); i++) {
				if (this.tabSpikes.get(i).getX() < 1000 && this.tabSpikes.get(i).getX() + this.tabSpikes.get(i).getLargeur() > -50 ) { // seulement si les objets sont présents à l'écran
				g2.drawImage(this.tabSpikes.get(i).getImgObjet(), this.tabSpikes.get(i).getX(), this.tabSpikes.get(i).getY(), null); // dessin de tous les objets
				}
			}
			
		}
		if (etapes == 5) { // étape du menu post mortem
			g2.drawImage(this.imgFondMort, 0, 0, null);
			propBoutonMortVersSkin(); valeurBoutonMortVersSkin++;
			this.boutonMortVersSkin.setBounds(150,330,175,179);
			propBoutonRejouer(); valeurBoutonRejouer++;
			this.boutonRejouer.setBounds(405,330,175,179);
			propBoutonMortVersMenu(); valeurBoutonMortVersMenu++;
			this.boutonMortVersMenu.setBounds(660,330,175,179);
		}
	}
}
