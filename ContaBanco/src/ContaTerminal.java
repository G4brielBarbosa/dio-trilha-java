import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nomeCliente = leitor.nextLine();
        System.out.println("Por favor, digite o numero da agência");
        agencia = leitor.nextLine();
        System.out.println("Por favor, digite o numero da conta");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o seu saldo");
        saldo = leitor.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

        leitor.close();

    }
}
