package pr2.org;
	
import java.util.*; 

public class Simulacro{
	public static int cambio(int cambio, List<Integer> lista){
		int acumulador = 0; 
		for(int i : lista){
			while(cambio >= i){
				cambio = cambio - i;
				acumulador++;
			}
		}
		return acumulador;
	}
	public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas){
		int[] resultado = new int[1];
		recursivo(cambio, sistemaMonedas, 0, resultado);
		return resultado[0];
        }
	public static void recursivo(int cambio, List<Integer> sistemaMonedas, int i, int[] resultado){
		if(cambio == 0){
		}else{ 
			if(cambio >= sistemaMonedas.get(i)){
				cambio = cambio - sistemaMonedas.get(i);
				resultado[0] = resultado[0] + 1;
				recursivo(cambio, sistemaMonedas, i, resultado);
			}else{
		recursivo(cambio,sistemaMonedas, i+1, resultado);}

		}
	}
}	
