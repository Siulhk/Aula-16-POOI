public class ContaEspecial extends ContaBancaria{
    double adicional;
    public ContaEspecial(String nome, double saldo, double adicional){
        super(nome, saldo);
        this.adicional=adicional;
    }
    public void retira(double valor){
        if (adicional+getSaldo()< valor || getSaldo()==valor*(-1)){
            System.out.println("Limite excedido");
            System.out.println();
        }
        else{setSaldo(getSaldo()-valor);
            System.out.println("valor retirado: " + valor);
            System.out.println();
        }
    }
}
