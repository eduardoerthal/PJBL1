import java.util.ArrayList;
import java.util.List;

public class Produto{
    private String nome;
    private String tamanho;
    private String cor;
    private double preco;
    public Produto(String nome, String tamanho, String cor, double preco){
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor= cor;
        this.preco = preco;
    }
}
class Estoque extends Produto {
    private List<Produto> produtos;
    public Estoque() {
        produto = new ArrayList<>();

        public void adicionarProduto (Produto produtos){
            produtos.add(produtos);
        }

        public void removerProduto (Produto produtos){
            produtos.remove(produtos);
        }

        public List<Produto> listarProdutos () {
            return produtos
        }
    }
}
class Pedido {
    private Cliente cliente;
    private List<Produto> itens;
    private double valorTotal;

    public Pedido (Cliente cliente) {
        this.cliente = cliente ;
        this.items = new ArrayList<>();
    }

    public void AdicionarProduto (Produto produto){

    }
}
class Cliente {
    private String nome;
    private String rua;
    private int numero;
    public Cliente(String nome, String rua, int numero){
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
    }
    public void CriarConta(){

    }
}