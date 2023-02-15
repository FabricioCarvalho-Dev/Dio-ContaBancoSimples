
import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal{


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale locale = new Locale("US");


        //Atributos
        int numConta;
        String agencia;
        String titular; 
        double saldo;
        
        System.out.println("Conta Bancaria");
        System.out.println(">>>>>> Por favor digite os dados para abertura da conta: <<<<<<");

        System.out.println("Digite o numero da conta: ");
        numConta = scan.nextInt();

        System.out.println("Digite o numero da agencia:");
        agencia = scan.next();

        System.out.println("Digite o nome do titular:");
        titular = scan.next();

        System.out.println("Digite o saldo");
        saldo = scan.nextDouble();
        scan.close();

        System.out.println("Olá "+titular+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta"+  numConta+" e seu saldo R$:"+saldo+" já está disponível para saque"); 
    }
}