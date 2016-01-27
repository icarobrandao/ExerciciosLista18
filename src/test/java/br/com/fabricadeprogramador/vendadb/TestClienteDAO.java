package br.com.fabricadeprogramador.vendadb;

public class TestClienteDAO {

	public static void main(String[] args) {
		//cadastrando
		Cliente cliente1 = new Cliente();
		cliente1.setNome("jao");
		cliente1.setCpf("999.999.999-99");
		cliente1.setEmail("jaosilva@hotmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("maria");
		cliente2.setCpf("888.888.888-88");
		cliente2.setEmail("mariavaicomasoutras@hotmail.com");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("josé");
		cliente3.setCpf("777.777.777-77");
		cliente3.setEmail("josepadastrodejesus@hotmail.com");
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.cadastrar(cliente1);
		clienteDAO.cadastrar(cliente2);
		clienteDAO.cadastrar(cliente3);
		
		System.out.println("cadastrado com sucesso!");
		
		//alterando
		Cliente cliente2Alterado = new Cliente();
		cliente2Alterado.setNome("maria vai com as outras");
		cliente2Alterado.setCpf("888.888.888-88");
		cliente2Alterado.setEmail("mariavaicomasoutras@hotmail.com");
		cliente2Alterado.setId(2);
		
		clienteDAO.alterar(cliente2Alterado);
		
		System.out.println("alterado com sucesso!");
		
		//excluindo
		Cliente cliente3Excluido = new Cliente();
		cliente3Excluido.setId(3);
		
		clienteDAO.excluir(cliente3Excluido);
		System.out.println("excluido com sucesso!");
		
		clienteDAO.excluir(cliente3Excluido);
	}

}
