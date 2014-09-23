package tarefa4;

import java.util.ArrayList;
import java.util.Map;

public class Funcionario  extends Pessoa {

	public void realizarReserva(Quarto quarto, Cliente cliente) {

		Reserva reserva = new Reserva(quarto, cliente);
		
		//persiste no banco de dados
	}

	public void realizarReserva(ArrayList<Quarto> quartos, Cliente cliente) {

		Reserva reserva = new Reserva(quartos, cliente);
		
		//persiste no banco de dados
	}
	
	public boolean quartoEstaOcupado(Quarto quarto){
		
		return quarto.estaOcupado();
	}
	
	public void alterarDadosCliente(Cliente cliente, Map<String, String> novosDados){
		
		cliente.atualizarDados(novosDados.get("telefone"), novosDados.get("cartão de credito"));
	}
	
	

}
