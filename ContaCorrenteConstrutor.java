public class ContaCorrenteConstrutor {
    // Iniciação dos contrutores
    int agencia;
    int conta;
    String cliente;
    /* Criação da classe de passagem dos construtores */
    public ContaCorrenteConstrutor(int agenciaCli, int contaCli, String clienteCli){
        agencia = agenciaCli;
        conta = contaCli;
        cliente = clienteCli;
        
    }

   
    public static void main(String[] args) {
        /* Instanciação dos objetos da classe ContaCorrenteConstrutor pelo objeto contaC */
        ContaCorrenteConstrutor contaC = new ContaCorrenteConstrutor(171,2217122,"Lucas");
        
        /* Saida com as classecontaC.agencia(construtor criado)  */
        System.out.print("\nAgencia: "+contaC.agencia+"\nConta: "+contaC.conta+"\nCliente: "+contaC.cliente+"\n");
    }
    
}
