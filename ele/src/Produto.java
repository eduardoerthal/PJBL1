import java.util.ArrayList;
import java.util.List;

public abstract class Produto {
    protected String nome;
    protected String tamanho;
    protected String cor;
    protected double preco;

    public Produto(String nome, String tamanho, String cor, double preco) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.preco = preco;
    }

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }
}

class Camisa{
    protected String tamanho;
    protected String cor;
    protected String modelagem;
    protected String tecido;
    protected double preco;

    public Camisa(String tamanho, String cor, String modelagem, String tecido, double preco){
        this.tamanho = tamanho;
        this.cor = cor;
        this.modelagem = modelagem;
        this.tecido = tecido;
        this.preco = preco;
    }
}
class Calça{
    protected String tamanho;
    protected String cor;
    protected String modelagem;
    protected String tecido;
    protected double preco;

    public Calça(String tamanho, String cor, String modelagem, String tecido, double preco){
        this.tamanho = tamanho;
        this.cor = cor;
        this.modelagem = modelagem;
        this.tecido = tecido;
        this.preco = preco;
    }
}
class Tenis{
    protected String tamanho;
    protected String cor;
    protected String material;
    protected double preco;

    public Tenis(String tamanho, String cor, String material, double preco){
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
        this.preco = preco;
    }
}

class Pedido {
    protected Cliente cliente;
    protected List<Produto> itens;
    protected double valorTotal;

    public Pedido (Cliente cliente) {
        this.cliente = cliente ;
        this.itens = new ArrayList<>();
    }

    public void AdicionarProduto (Produto produto){

    }
}
class Cliente {
    protected String nome;
    protected String rua;
    protected String email;
    protected int numero;
    protected int numerotelefone;

    protected static List<Cliente> contas = new ArrayList<>();

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
    protected String pedido;
    protected String metodopagamento;
    protected double dinheiropagamento;
    protected double valorpedido;
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
    protected boolean validacaopagamento(){}
}
class Main{
    public static void main(String [] args){
    new Screen();
    }
}
