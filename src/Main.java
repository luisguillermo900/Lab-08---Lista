import java.util.ArrayList;

import fuerzabruta.FuerzaBruta;

public class Main {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> listaP = new ArrayList<>();
		FuerzaBruta fuerzaB = new FuerzaBruta();	
		int k=12;	
		int n[]= {1 , 2 , 5};	
		listaP = fuerzaB.fuerza2(k,n);
		System.out.println();
		System.out.println("Input");
		System.out.println("12");
		System.out.println("{1, 2, 5}");
		System.out.println();
		
		for (int i = 0; i < listaP.size(); i++) {//HACE UN RECORRIDO A "listaP" PARA QUE DEVUELVA TODOS LOS CASOS
			System.out.print("Count "+(i+1)+"->");
			for (int j = 0; j < listaP.get(i).size(); j++) {
	            System.out.print(" " + listaP.get(i).get(j) );
	        }
			System.out.println();
		}
	}
}
