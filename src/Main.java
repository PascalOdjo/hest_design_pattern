
import src.projet.model.Compte;
import src.projet.model.EtatCompte;
import src.projet.model.TypeCompte;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pascal
 */



public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello my guys");
		
		Compte c1 = new Compte();
		
		c1.setId(1L);
		c1.setNumeroCompte(9876567);
		c1.setEtat(EtatCompte.COMPTE_ACTIF);
		c1.setSolde(50000000);
		c1.setTypeCompte(TypeCompte.COMPTE_EPARGNE);
		
		Compte c2 = new Compte(2L,65718765,7000000,TypeCompte.COMPTE_COURANT,EtatCompte.COMPTE_CREE);
                Compte c3 = Compte.builder()
                        .etat(EtatCompte.COMPTE_ACTIF)
                        .id(02)
                        .solde(10000)
                        .build();
		
		System.out.println(c1);
		System.out.println(c2);
                System.out.println(c3);
	}

}
