public class TestaContaBancaria {
    public static void main(String[] args){
        ContaEspecial contaEspecial = new ContaEspecial("Roberto",0,5000);
        ContaSimples contaSimples = new ContaSimples("Rafael",0);

        contaSimples.deposita(2000);
        contaEspecial.deposita(2000);

        contaSimples.retira(2001);
        contaSimples.retira(1600);
        contaEspecial.retira(2000);
        contaEspecial.retira(5000);
        contaEspecial.retira(1);
    }
}
