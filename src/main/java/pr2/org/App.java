package pr2.org;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.String;

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
	public static List<Integer> paresHastaNIter(int n){
		List<Integer> listaSalida = new ArrayList<>(); 
		for(int i = n; i>=2; i--){
			if(i % 2 == 0) 
				listaSalida.add(i);
		}
		return listaSalida; 
	}
	public static List<Integer> paresHastaNRecur(int n){
		return paresRecur(new ArrayList<Integer>(), n);
	}
	public static List<Integer> paresRecur(List<Integer> listaSalida, int i){
		if(i < 2) return listaSalida;
		else{
			if(i % 2 == 0){
				listaSalida.add(i);
			}
		}
		return paresRecur(listaSalida, i - 1);
	}
	public static int productoEscalarIter(List<Integer> listaA, List<Integer> listaB){
		int a = 0; 
		int b = 0; 
		int productoEscalar = 0; 
		for(int i = 0; i < listaA.size(); i++){
			productoEscalar = productoEscalar + (listaA.get(a) * listaB.get(b));
			a++;
			b++;
		}
		return productoEscalar;
	}
	public static int productoEscalarRecur(List<Integer> listaA, List<Integer> listaB){
		return  (listaA.size() == 0)? 0 : listaA.get(0) 
						* listaB.get(0) 
						+ productoEscalarRecur(listaA.subList(1, listaA.size()), listaB.subList(1, listaB.size()));    
	}
	public static List<Integer> listaCuadrados(List<Integer> lista){
		return lista.stream().map(x -> x * x).collect(Collectors.toList());	
	}
	public static int sumaLista(List<Integer> lista){
		return lista.stream().reduce(0, (x,y) -> x + y);
	}
	public static int sumaParesLista(List<Integer> lista){
		return lista.stream()
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList())
				.stream().reduce(0, (x,y) -> x + y);
	}
	public static List<Integer> listaPares(List<Integer> lista){
		return lista.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
	}
	public static int menorLista(List<Integer> lista){
		return lista.stream().min((x,y) -> x.compareTo(y)).get();
	}
	public static List<String> aMinusculas(List<String> lista){
		return lista.stream().map( x -> x.toLowerCase()).collect(Collectors.toList());
	}
	public static String concat(List<String> lista){
		return lista.stream().reduce("", (x,y) -> x.concat(y));
	}
	public static List<String> sinA(List<String> lista){
		String a = "a";
		return lista.stream()
			.filter(x -> x.charAt(0) != a.charAt(0))
			.collect(Collectors.toList());
	}
	public static List<Integer> mayoresQueSeis(List<Integer> lista){
		return lista.stream().map(x -> x * 2).filter(x -> x > 6).collect(Collectors.toList()); 
	}
}







