import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Long id;
    private String nomeCliente;
    private List<Produto> produtos;

    // Getters e setters para os campos privados
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double valorTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getQtd() * produto.getValorUnitario();
        }
        return total;
    }
}