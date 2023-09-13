import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um único objeto Produto com valor unitário
        Produto produto1 = new Produto();
        produto1.setId(152L);
        produto1.setDescricao("Camisetas");
        produto1.setQtd(126);
        produto1.setValorUnitario(55.0); // Defina o valor unitário

        // Criando uma lista de produtos com o único produto
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);

        // Criando um objeto Venda
        Venda venda = new Venda();
        venda.setId(1568L);
        venda.setNomeCliente("Gabriel");
        venda.setProdutos(produtos);

        // Calculando o valor total da venda
        double valorTotal = venda.valorTotal();

        // Exibindo informações da venda
        System.out.println("Detalhes da venda:");
        System.out.println("ID da venda: " + venda.getId());
        System.out.println("Nome do cliente: " + venda.getNomeCliente());

        for (Produto produto : venda.getProdutos()) {
            System.out.println("Detalhes do Produto:");
            System.out.println("  - ID: " + produto.getId());
            System.out.println("  - Descrição: " + produto.getDescricao());
            System.out.println("  - Quantidade: " + produto.getQtd());
            System.out.println("  - Valor Unitário: " + produto.getValorUnitario());
            System.out.println("  - Valor Total: " + produto.getValor());
        }
        System.out.println("Valor total da venda: " + valorTotal);
    }
}