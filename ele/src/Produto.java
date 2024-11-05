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
    public Estoque(String nome, String tamanho, String cor, double preco){
        super(nome, tamanho, cor, preco);
    }
    public void EstocarPedido(){
        ArrayList<String> produtos = new ArrayList<String>();
        produtos.
    }
}
class Pedido {
    private Cliente cliente;
    private List<Produto> itens;
    private double valorTotal;

    public Pedido (Cliente cliente) {
        this.cliente = cliente ;
        this.itens = new ArrayList<>();
    }

    public void AdicionarProduto (Produto produto){

    }
}
class Cliente {
    private String nome;
    private String rua;
    private String email;
    private int numero;
    private int numerotelefone;

    private static List<Cliente> contas = new ArrayList<>();

    public Cliente(String nome, String rua, String email, int numero, int numerotelefone){
        this.nome = nome;
        this.rua = rua;
        this.email = email;
        this.numero = numero;
        this.numerotelefone = numerotelefone;
    }
    public void CriarConta(){
        contas.add(this);
        System.out.println("Conta criada para o usuario: "+ nome);
    }
    public static List<Cliente> getContas(){
        return contas;
    }
}
class Pagamento extends Exception {
    private String pedido;
    private String metodopagamento;
    private double dinheiropagamento;
    private double valorpedido;
    public Pagamento(String pedido, String metodopagamento, double dinheiropagamento, double valorpedido){
        this.pedido = pedido;
        this.metodopagamento = metodopagamento;
        this.dinheiropagamento = dinheiropagamento;
        this.valorpedido = valorpedido;
    }
    public void pagar(){
        System.out.println("Iiciando o processo de pagamento! ");
        System.out.println("Pedido do cliente: " + pedido);
        System.out.println("Método como gostaria de pagar: " + metodopagamento);

        if (validacaopagamento()){
            System.out.println("Seu pagamento foi concluido com sucesso! ");
        }else{
            System.out.println("Erro ao tentar validar o pagamento. Tente novamente!");
        }
    }
    private boolean validacaopagamento(){}
}
class Main{
    public static void main(String [] args){

    }
}
