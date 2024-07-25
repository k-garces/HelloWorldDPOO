package helloworld;

import java.util.Arrays;
import java.util.HashSet;

public class TypeErrorExample {
	
	public static HashSet<Integer> g(int a)
	{
		Integer[] values = { a, a + 1, a + 2, a + 3 };
		return new HashSet<Integer>(Arrays.asList(values));
	}

	public static void main(String[] args) {		
		
		// lo tuve que reconvertir a arreglo para acceder a los elementos ya que HashSet no permite acceder a sus elementos con []
        System.out.println("The element in position 2: " +  g(5).toArray()[0].toString());

	}

}
