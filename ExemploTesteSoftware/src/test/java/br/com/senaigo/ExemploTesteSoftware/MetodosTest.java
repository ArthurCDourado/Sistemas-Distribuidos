package br.com.senaigo.ExemploTesteSoftware;

import junit.framework.TestCase;

public class MetodosTest extends TestCase {

	public void testFatorial() {
		
		assertEquals(1,new Metodos().fatorial(1));
		
	}

	public void testDevolveNomeCaixaAlta() {
		assertTrue(new Metodos().devolveNomeCaixaAlta("luiz").equals("LUIZ"));
	}

}
