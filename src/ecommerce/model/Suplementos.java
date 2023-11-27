package ecommerce.model;

public abstract class Suplementos {//Classe abstrata

	private int id;
	private int tipo;
	private float produtopreco, peso ;
	public String produtoNome;
	
	// Metodo Contrutor
	public Suplementos(int id, float produtopreco, float peso) {
		this.id = id;
		this.produtopreco = produtopreco;
		this.peso = peso;

	}
	// Getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getProdutopreco() {
		return produtopreco;
	}

	public void setProdutopreco(float produtopreco) {
		this.produtopreco = produtopreco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getProdutoNome() {
		return produtoNome;
	}

	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}
	
				//Metodos especificos
	// Calcula o preço total com base em uma quantidade
    public float calcularPrecoTotal(int quantidade) {
        return this.produtopreco * quantidade;
    }

    // Verifica se o produto está disponível em estoque
    public boolean verificarDisponibilidade(int quantidadeEmEstoque) {
        return quantidadeEmEstoque > 0;
    }

    // Exibe detalhes do produto
    public abstract void exibirDetalhesEspecificos();
	
	
	//Metodos vizualizar
    protected String getTipoString() {
        switch (this.tipo) {
            case 1:
                return "Whay";
            case 2:
                return "Creatina";
            default:
                return "Tipo desconhecido";
        }
    }

    public void visualizar() {
        System.out.println("ID do produto: " + this.getId());
        System.out.println("Nome do produto: " + this.getProdutoNome());
        System.out.println("Tipo do produto: " + this.getTipoString());
        System.out.println("Preço do produto: " + this.getProdutopreco());
    }
}
	

