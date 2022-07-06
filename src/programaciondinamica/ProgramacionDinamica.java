package programaciondinamica;

import java.util.Stack;	

public class ProgramacionDinamica {

	public int fuerzaPD(int peso, int[] paquetes) {  //FUNCION P˙BLICA DONDE EXTRAEMOS LA POSICIÛN
		//MAYOR QUE DEBERÌA SER LOS PAQUETES CON MAYOR CAPACIDAD
		Stack<Integer> paquete = new Stack<>();
		int pos =  paquetes.length-1;
		int resultado = 0;
		return minPaquetes(peso, paquetes,paquete,pos,resultado);	
	}

	private int minPaquetes(int peso,int[] paquetes, Stack<Integer> paquete, int posicion, int resultado){
																									//MARCA EL PAQUETE DE MAYOR CANTIDAD
		if(peso == 0) {
			return resultado;//SI EL PESO TIENE VALOR 0, ES POR QUE FUE VACIADO CON EL ITER
		}	
		else{	
			int iter=  paquetes[posicion];
			if(iter <=peso) {//AGARRA EL PAQUETE DE MAYOR VALOR Y REALIZA EL DESCUENTO AL PESO
				paquete.push(iter);
				resultado ++;
				return minPaquetes(peso-iter, paquetes,paquete,posicion,resultado);//BUSCAMOS EL MIN CON UN PESO-ITER
			}  
			else {//EL ESPACIO SOBRANTE ES MENOR AL PAQUETE DE MAYOR TAMA—O
				int iter2= paquetes[posicion-1];//SEGUNDO MAYOR
				if(iter2<=peso){//SI EL PAQUETE EST¡ CON ESPACIO SE AGREGA EL SEGUNDO MAYOR, SIEMPRE QUE ENTRE
					paquete.push(iter2);
					resultado ++;
					return minPaquetes(peso-iter2, paquetes,paquete,posicion-1,resultado);//BUSCAMOS EL MIN CON UN PESO-ITER2
				}
				else{//EL ESPACIO SOBRANTE ES MENOR A LA SEGUNDO PAQUETE DE MAYOR TAMA—O
					int top= paquete.pop();//SE RETIRA UN PAQUETE DEL TAMA—O MAYOR
					resultado--;
					return minPaquetes(peso+top, paquetes,paquete,posicion-1,resultado);//BUSCAMOS EL MIN CON UN PESO+TOP Y 
																						//DISMINUIMOS EL POS EN 1
				}
			}
		}
	}
}
