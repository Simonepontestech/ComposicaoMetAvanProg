package TedComposicaoMetAvanProg;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println();
        System.out.println("Lucas dos Santos Alves");
        System.out.println("Matricula: 2021111510028\n");
	System.out.println("Simone Martins De Pontes");
        System.out.println("Matricula: 2021111510013\n");
        
        System.out.println("Desconto de 10% por ter passado das 20h:");
        HoraDaCompra h1 = new HoraDaCompra(20, 60, "sexta");
        Produto p1 = new Produto("Celular", 500, h1);

        System.out.println("O preço com desconto do produto: "+p1.getNomeProduto()+" é: "+p1.getPrecoComDesconto()+"\n");

        System.out.println("Desconto de 10% por ser sábado ou domingo:");
        h1 = new HoraDaCompra(10, 60, "sabado");
        p1 = new Produto("Celular", 500, h1);
        System.out.println("O preço com desconto do produto: "+p1.getNomeProduto()+" é: "+p1.getPrecoComDesconto()+"\n");

        System.out.println("Sem desconto por não obedecer nenhuma das duas opções: ");
        h1 = new HoraDaCompra(10, 60, "quinta");
        p1 = new Produto("Celular", 500, h1);
        System.out.println("O preço com desconto do produto: "+p1.getNomeProduto()+" é: "+p1.getPrecoComDesconto()+"\n");

        //Lançamento de exceção por ter algum parametro inválido(Descomentar para rodar)!
        //  h1 = new HoraDaCompra(90, 60, "quinta");
        //  p1 = new Produto("Celular", 500, h1);
        //  System.out.println("O preço com desconto do produto: "+p1.getNomeProduto()+" é: "+p1.getPrecoComDesconto());
    }   
}
