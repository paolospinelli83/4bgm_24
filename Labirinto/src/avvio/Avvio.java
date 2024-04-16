package avvio;

import java.util.ArrayList;

import giocatori.Giocatore;
import giocatori.Mostro;
import utility.Arma;
import utility.Difesa;
import utility.Equip;

public class Avvio {

	public static void main(String[] args) {
		
		Arma arma1 = new Arma("spadaLaser", 10, "spada");
		Arma arma2 = new Arma("Macete", 8, "spada");
		Difesa difesa1 = new Difesa("scudoBlu", "scudo", 10);
		Difesa difesa2 = new Difesa("scudoRosso", "scudo", 15);
		
		ArrayList<Arma> arrayArma1 = new ArrayList<Arma>();
		arrayArma1.add(arma1);
		
		ArrayList<Difesa> arrayDifesa1 = new ArrayList<Difesa>();
		arrayDifesa1.add(difesa1);
		
		ArrayList<Arma> arrayArma2 = new ArrayList<Arma>();
		arrayArma2.add(arma2);
		
		ArrayList<Difesa> arrayDifesa2 = new ArrayList<Difesa>();
		arrayDifesa2.add(difesa2);
		
		
		Equip equipGiocatore= new Equip(arrayArma1, arrayDifesa1, null);	
		Equip equipMostro= new Equip(arrayArma2, arrayDifesa2, null);
		
				
		Giocatore giocatore = new Giocatore("Player1", null, equipGiocatore);
		Mostro mostro = new Mostro("Hell", null, equipMostro, "cattivo", "nero", 250);
		
		int danno = giocatore.usaArma(0) - mostro.usaDifesa(0);
		if (danno>0) {
			// aggiorna statistiche mostro
		}
		
	}

}
