package pr2.org; 

import java.util.*;
import java.util.stream.Collectors; 

public class Interseccion<E>{
	public List<E> calcularInterseccionIter(List<E> lista1, List<E> lista2){
		List<E> interseccion = new ArrayList<>();
		for(E i : lista2){
			if(lista1.contains(i)){	
				interseccion.add(i);
			}
		}
		return interseccion;
	}
	public List<E> calcularInterseccionRecur(List<E> lista1, List<E> lista2){
		return calcularInterseccionRecur(lista1, lista2, new ArrayList<>(), 0);
	}
	private List<E> calcularInterseccionRecur(List<E> lista1, List<E> lista2, List<E> interseccion, int i){
		if(i == lista1.size()){
			return interseccion; 	
		}else{ 
			if(lista2.contains(lista1.get(i))){
				interseccion.add(lista1.get(i));
			}
		return calcularInterseccionRecur(lista1, lista2, interseccion, i + 1);
			}
	}
	public List<E> calcularInterseccionLambda(List<E> lista1, List<E> lista2){
		List<E> inter = new ArrayList<>();
		lista1.stream().forEach((e) -> { if(lista2.contains(e))inter.add(e);});
		return inter;
	}
}
