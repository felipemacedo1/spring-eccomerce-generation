package suplementos.repository;

import ecommerce.model.Suplementos;

public interface SuplementosRepository {
	
	//CRUD da conta
	public void cadastrarProdutos();
	public void listarProdutos();
	public void procurarPorID();
	public void removerProduto();
	
	// Métodos estoque
	public void removerItem(int id, int valor);
	public void adicionarProdutos(int id, int quantidade);
	
	
	 
	
}
