
public class Avvio {

	public static void main(String[] args) {
		TestMetodi test = new TestMetodi();
		test.stampa();
		test.somma(3, 5);
		test.schedaUtente("lalal", "ulolo", 31);
		
		System.out.println(test.sommaRitornata(10,15));
		System.out.println(test.sommaStringata(10,15));
		//oppure
		//Integer sommaRit = test.sommaRitornata(10,15);
		//Integer sommaStr = test.sommaStringata(10,15);
        //System.out.println(sommaRit);
        //System.out.println(sommaStr);
		
		System.out.println(TestMetodi.dammiLunghezzaStr("palala"));
		
		System.out.println(TestMetodi.verificaUser("alalalala11")); //true
		System.out.println(TestMetodi.verificaUser("al")); //false

	}

}
