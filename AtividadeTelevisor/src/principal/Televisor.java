package principal;

import java.util.Scanner;

import entities.TelevisorClasse;

public class Televisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	TelevisorClasse televisorClasse = new TelevisorClasse();
	
	televisorClasse.mostrarStatus();
	televisorClasse.ligarTelevisor();
	televisorClasse.mostrarStatus();
	
	
	
	
	
	
	
	
	
	
	sc.close();
}
}