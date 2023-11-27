package suplementos.model;

public class Creatina extends Suplementos {

    // Construtor
    public Creatina(int id, float produtopreco, float peso) {
        super(id, produtopreco, peso);
        this.getProdutoNome(); // define o nome da creatina Creatina
    }

    // Implementação do método para exibir detalhes da Creatina
    @Override
    public void exibirDetalhesEspecificos() {
        System.out.println("Detalhes da Creatina:");
        System.out.println("Aumenta a força e a potência muscular.");
        System.out.println("Auxilia na recuperação após o exercício.");
    }
}
