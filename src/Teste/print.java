package Teste;

import model.Cliente;

public class print {

	public print () {
		super ();
	}
	
	public void printvalor (Controller.Fila <Cliente> Fila) throws Exception {
		
		while (!Fila.isEmpty()) {
		
		Cliente aux = new Cliente("",0,0);
		aux = Fila.remove();
		float ValorTotal= aux.ValorPecas * aux.QuantidadedePecas;
		System.out.println(aux.Nome + " - Valor Total: R$" + ValorTotal);
		
		}
}
}
