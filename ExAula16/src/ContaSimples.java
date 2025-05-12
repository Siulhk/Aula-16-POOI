public class ContaSimples extends ContaBancaria{
    public ContaSimples(String nome, double saldo){
        super(nome, saldo);
    }
    public void retira(double valor){
        if (getSaldo()<valor){
            System.out.println("Limite excedido");
            System.out.println();
        }
        else {setSaldo(getSaldo()-valor);
            System.out.println("valor retirado: " + valor);
            System.out.println();
        }
    }
}
