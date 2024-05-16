
public class TestMetodi {
	void stampa() {
		System.out.println("Ciao Mondo!");
	}
	
	void somma(int n1, int n2) {
		int risultato = n1+n2;
		System.out.println("La somma è: " + risultato);
	}
	
	void schedaUtente(String nome, String cognome, int eta) {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Età: " + eta);	
	}
	
	Integer sommaRitornata(int n1, int n2) {
		return n1+n2;
	}
	
	String sommaStringata(int n1, int n2) {
		return "la somma è: "+(n1+n2);
	}
	
	static Integer dammiLunghezzaStr(String nome) {
		return nome.length();
	}
	
	
	//verificare che lo username abbia una lunghezza compresa tra 3 e i 12 caratteri,
	//ritorna true se la verifica è andata a buon fine
	static Boolean verificaUser(String username) {
		if(username.length()>=3 && username.length()<=12) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
