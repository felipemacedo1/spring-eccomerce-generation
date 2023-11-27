package ecommerce.model;

public class WheyProtein extends Suplementos {

    // Construtor
    public WheyProtein(int id , String nomeProduto, float produtopreco, float peso) {
        super(id, produtopreco, peso);
        this.getProdutoNome(); // Define o nome do  Whey Protein
    }

    // Implementação do método para exibir detalhes do Whey Protein
    @Override
    public void exibirDetalhesEspecificos() {
        System.out.println("Detalhes do Whey:");
        System.out.println("Contém proteína de alta qualidade.");
        System.out.println("Ideal para ficar maromba.");
    }
}