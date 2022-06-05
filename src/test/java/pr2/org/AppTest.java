package pr2.org;

import java.util.List;
import java.util.Arrays;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	List<Integer> lista = Arrays.asList(1,2,3,4,5);

	@Test
	public void sumaIter(){
	        assertEquals(15, App.sumaIter(5));
	}
	@Test
	public void sumaRecur(){
		assertEquals(15, App.sumaRecur(5));
	}
	@Test
	public void factorialIter(){
		assertEquals(6, App.factorialIter(3));
	}
	@Test
	public void factorialRecur(){
		assertEquals(6, App.factorialRecur(3));
	}
	@Test 
	public void potenciaIter(){
		assertEquals(128, App.potenciaIter(2,7));	
	}
	@Test
	public void potenciaRecur(){
		assertEquals(128, App.potenciaRecur(2,7));
	}
	@Test
	public void sumaListIter(){
		assertEquals(15, App.sumaListIter(lista));
	}
	@Test 
	public void sumaListRecur(){
		assertEquals(15, App.sumaListRecur(lista));
	}
	@Test
	public void sumaParesListIter(){
		assertEquals(6, App.sumaParesListIter(lista));
	}
	@Test
	public void sumaParesLisRecur(){
		assertEquals(6, App.sumaParesListRecur(lista));
	}
}








