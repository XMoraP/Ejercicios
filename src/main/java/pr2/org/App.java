package pr2.org;

import java.util.*;

public class App{
	public static int sumaIter(int n){
		int suma = 0; 
		for(int i = 0; i <= n; i++){
			suma += i;
		}
		return suma; 
	}

	public static int sumaRecur(int n){
		return (n==1)? 1 : n + sumaRecur(n-1);
	}
	public static int factorialIter(int n){
		int factorial = 1;
		while(factorial<=n){
			factorial = factorial * (factorial + 1);
		}
		return factorial;
	}
	public static int factorialRecur(int n){
		return (n == 0)? 1 : n * factorialRecur(n-1);
	}
	public static int potenciaIter(int n, int m){
		int potencia = n;
		for(int i = 1; i<m; i++){
			potencia = potencia * n;
		}
		return potencia;
	}
	public static int potenciaRecur(int n, int m){
		return (m == 0)? 1 :  n * potenciaRecur(n, m-1);	
	}
	public static int sumaListIter(List<Integer> lista){
		int acumulador = 0;
		for(int i = 0; i < lista.size(); i++){
			acumulador = acumulador + lista.get(i);
		}
		return acumulador;
	}
	public static int sumaListRecur(List<Integer> lista){
		return (lista.size() == 0)? 0 : lista.get(0) + sumaListRecur(lista.subList(1,(lista.size())));	
	}
	public static int sumaParesListIter(List<Integer> lista){
		int acumulador = 0; 
		for(int i = 0; i < lista.size(); i++){
			if(lista.get(i) % 2 == 0){
				acumulador = acumulador + lista.get(i);
			}
		}
		return acumulador;
	}
	public static int sumaParesListRecur(List<Integer> lista){
		lista = listaParesRecur(lista);
		return (lista.size() == 0)? 0 : lista.get(0) + sumaParesListRecur(lista.subList(1, lista.size()));
	}
	public static List<Integer> listaParesRecur(List<Integer> lista){
		return listaParesRecur(lista, new ArrayList<Integer>(), 0); 
	}
	public static List<Integer> listaParesRecur(List<Integer> listaEntrada,List<Integer> listaSalida, int i){
		if(i == listaEntrada.size()) return listaSalida; 
		else {
			if(listaEntrada.get(i) % 2 == 0){
				listaSalida.add(listaEntrada.get(i));
			}
			return listaParesRecur(listaEntrada, listaSalida, i + 1);
		}
	}	 
}







