package contacorrenteconstrutor;

import java.util.Scanner;

/**
 *
 * @author lucas.monteiro
 */
public class ContaCorrenteConstrutor {
    // Iniciação dos contrutores
    int agencia;
    int conta;
    String cliente;
    double saldo;
    /* Criação da classe de passagem*/
    
    public ContaCorrenteConstrutor(int agenciaCli, int contaCli, String clienteCli,double saldoCli){
        agencia= agenciaCli;
        conta = contaCli;
        cliente = clienteCli;
        saldo = saldoCli;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Instanciação dos objetos da classe ContaCorrenteConstrutor pelo objeto contaC*/
        int qtd;
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja Cadstrar Quantos Clientes?");
        qtd = input.nextInt();
         
        // Criação do objeto como array 
        ContaCorrenteConstrutor[] contaC = new ContaCorrenteConstrutor[qtd];
        
        for(int i=0;i<qtd;i++){
            System.out.println("Digite a Agencia");
        int agenciaD = input.nextInt();
        
        System.out.println("Digite a Conta");
        int contaD = input.nextInt();
        
        System.out.println("Digite o Cliente");
        String clienteD = input.next();
        
        double saldoD = 0;
        // Passagem dos valores para o novo objeto como array    
        contaC[i] = new ContaCorrenteConstrutor(agenciaD,contaD,clienteD,saldoD);
        }
        /* Saida com as classecontaC.agencia(construtor criado)  */
        
        for(int i = 0; i < contaC.length; i++) {             
         System.out.printf("\n\nAgencia: %s", contaC[i].agencia);  
         System.out.printf("\n\nConta: %s", contaC[i].conta);  
         System.out.printf("\n\nCliente: %s", contaC[i].cliente.toUpperCase());  
         System.out.printf("\n\nCliente: %s", contaC[i].saldo+"\n"); 
      }  
    }
    
}
