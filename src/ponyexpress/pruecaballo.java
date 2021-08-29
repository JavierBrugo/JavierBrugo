package ponyexpress;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public  class pruecaballo extends Ruta {
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}

	@Test
	public void caballo() {
		assertEquals(1, caballos(new int[] { 18, 15 }));
		assertEquals(2, caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		assertEquals(3, caballos(new int[] { 51, 51, 51 }));
		assertEquals(4, caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}

}
