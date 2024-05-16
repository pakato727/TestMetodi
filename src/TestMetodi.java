import java.util.Scanner;

public class TestMetodi {
	void stampa() {
		System.out.println("Ciao Mondo!");
	}
	
	void somma(int n1, int n2) {
		int risultato = n1+n2;
		System.out.println("La somma �: " + risultato);
	}
	
	void schedaUtente(String nome, String cognome, int eta) {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Et�: " + eta);	
	}
	
	Integer sommaRitornata(int n1, int n2) {
		return n1+n2;
	}
	
	String sommaStringata(int n1, int n2) {
		return "la somma �: "+(n1+n2);
	}
	
	static Integer dammiLunghezzaStr(String nome) {
		return nome.length();
	}
	
	
	//verificare che lo username abbia una lunghezza compresa tra 3 e i 12 caratteri,
	//ritorna true se la verifica � andata a buon fine
	static Boolean verificaUser(String username) {
		if(username.length()>=3 && username.length()<=12) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	static int dammiContaDispari(int inizio, int fine) {
		int numDispari = 0;
		for(int i=inizio; i<=fine; i++) {
			if(i%2!=0) {
				System.out.println(i);
				numDispari++;
			}
		}
		return numDispari;  
	}
	
	static char recuperaLettera(int codiceAscii) {
		return (char)codiceAscii;
		//char � un cast(trattami il dato come se fosse un char)
	}
	
	void exArray1() {
		int[] numeri = {2,5,7,9,12};
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		System.out.println(numeri[3]);
		System.out.println(numeri[4]);
	}
	
	
	void exArray2() {
		int[] numeri = {2,5,7,9,12};
		for(int i=0; i<numeri.length; i++) {
			System.out.println(numeri[i]);
		}
	}
	
	void exArray3() {
		int[] numeri = new int[5];
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		System.out.println(numeri[3]);
		System.out.println(numeri[4]);
		
	}
	
	void exArray4() {
		int[] numeri = new int[5];
		numeri[0]=2;
		numeri[1]=5;
		numeri[2]=7;
		numeri[3]=9;
		numeri[4]=12;
		System.out.println(numeri[0]);
		System.out.println(numeri[1]);
		System.out.println(numeri[2]);
		System.out.println(numeri[3]);
		System.out.println(numeri[4]);
		
	}
	
	@SuppressWarnings("resource")
	void exArray5() {
		Scanner input = new Scanner(System.in);
		int[] numeri = new int[5];
		for(int i=0; i<numeri.length; i++) {
			System.out.println("Aggiungi un numero nell'array: ");
			Integer valoreScelto = Integer.parseInt(input.nextLine());
			numeri[i] = valoreScelto;
		}
		 
		for(int j=0; j<numeri.length; j++) {
			System.out.println(numeri[j]);
		}
		
	}
	
	
	void exArray6() {
		int[] numeri = {2,5,7,9,12};
		int somma=0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i]%2==0) {
				somma+=numeri[i];
			}
		}
		System.out.println("la somma dei numeri pari �: "+somma);
	}
	
	void exArray7() {
		int[] numeri = {2,5,7,9,12};
		int numDispari=0;
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i]%2!=0) {
				numDispari++;
			}
		}
		System.out.println("la somma dei numeri pari �: "+numDispari);
	}
	
	void exArray8() {
		
		int[] numeri = {2,5,7,9,12};
		int max = numeri[0];
		
		for(int i=0; i<numeri.length; i++) {
			if(numeri[i] > max) {
				max=numeri[i];
			}
		}
		System.out.println("il numero massimo �: "+max);
	}
}
