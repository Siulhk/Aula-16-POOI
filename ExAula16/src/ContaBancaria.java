public abstract class ContaBancaria {
    private String nome;
    private double saldo;

    public ContaBancaria(String nome, double saldo){
        this.nome=nome;
        this.saldo=0;
    }
    public abstract void retira(double valor);

    public void deposita(double valor){
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println();
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo1){
        saldo = saldo1;
    }
}
