package Tarefa.Bibli;


import Teste.print;
import model.Cliente;

public class Fila {

	public static void main (String[] args) throws Exception {
		
		Controller.Fila <Cliente> Fila = new Controller.Fila<>();
		print p = new print();
		for (int i=0;i<20;i++) {
			Cliente cliente = new Cliente("",0,0);
			cliente.Nome="Cliente "+(i+1);
			cliente.QuantidadedePecas= (int) (Math.random()*30) + 20;
			cliente.ValorPecas = (float) ((Math.random()*95) +5);
			Fila.insert(cliente);
		}
			p.printvalor(Fila);
	}
}
