package fuerzabruta;

public class TestFB {
	
	public static FuerzaBruta fb;	
	public static void main(String[] args) {
		
		System.out.println("Pruebas de la estrategia de Fuerza Bruta");
		System.out.println("****************************************");
		prueba1();
		prueba2();
		prueba3();
		prueba4();
		prueba5();
		prueba6();
		prueba7();

	}
	//	Prueba 1
	//	Input:
	//	12
	//	{1 , 2 , 5}
	//	Output:	
	//	3
	private static void prueba1() {
		int k=12;	
		int n[]= {1, 2, 5};	
		fb = new FuerzaBruta();
		int p1 = fb.fuerza(k,n);
		System.out.println("Prueba 1: "+p1);
	}
	
	//	Prueba 2
	//	Input:
	//	10
	//	{1 , 3 , 4}
	//	Output:
	//	3
	private static void prueba2() {
		int k=10;	
		int n[]= {1, 3, 4};	
		fb = new FuerzaBruta();
		int p2 = fb.fuerza(k,n);
		System.out.println("Prueba 2: "+p2);
	}
	
	//	Prueba 3
	//	Input:
	//	6
	//	{1 , 3 , 4}	
	//	Output:
	//	2
	private static void prueba3() {	
		int k=6;	
		int n[]= {1, 3, 4};	
		fb = new FuerzaBruta();
		int p3 = fb.fuerza(k,n);
		System.out.println("Prueba 3: "+p3);
	}
	
	//	Prueba 4
	//	Input:
	//	18
	//	{1 , 3 , 5 , 7}
	//	Output:
	//	4
	private static void prueba4() {	
		int k=18;	
		int n[]= {1, 3, 5, 7};	
		fb = new FuerzaBruta();
		int p4 = fb.fuerza(k,n);
		System.out.println("Prueba 4: "+p4);
	}
	
	//	Prueba 5
	//	Input:
	//	360
	//	{ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 }
	//	Output:
	//	40
	private static void prueba5() {	
		int k=360;	
		int n[]= { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };	
		fb = new FuerzaBruta();
		int p5 = fb.fuerza(k,n);
		System.out.println("Prueba 5: "+p5);
	}
	
	//	Prueba 6
	//	Input:
	//	360
	//	{1 , 2 , 5 , 7 , 11 , 13 }
	//	Output:
	//	28
	private static void prueba6() {	
		int k=360;	
		int n[]= {1 , 2 , 5 , 7 , 11 , 13 };	
		fb = new FuerzaBruta();
		int p6 = fb.fuerza(k,n);
		System.out.println("Prueba 6: "+p6);
	}

	//	Prueba 7
	//	Input:
	//	1360
	//	{1 , 2 , 5 , 7 , 1 1 , 1 3 }
	//	Output:
	//	106
	private static void prueba7() {	
		int k=1360;	
		int n[]= {1 , 2 , 5 , 7 , 11 , 13 };	
		fb = new FuerzaBruta();
		int p7 = fb.fuerza(k,n);
		System.out.println("Prueba 7: "+p7);
	}

}
