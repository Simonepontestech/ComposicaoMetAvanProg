package TedComposicaoMetAvanProg;

public class Produto {
    
    private String nomeProduto;
    private float preco;
    private double precoComDesconto;


    public Produto(String nomeProduto, float preco, HoraDaCompra hora) throws Exception {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.precoComDesconto = preco - (preco*hora.verificarPromocao()) ;
    }


    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public float getPreco() {
        return this.preco;
    }

    public double getPrecoComDesconto() {
        return this.precoComDesconto;
    }

 
}
