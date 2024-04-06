import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  // Configura o Scanner para usar o ponto como separador decimal

        int Numero;
           String Agencia;
           String NomeCliente;
           float Saldo;


           System.out.println("Ola! seja bem vindo");
        System.out.println("Por favor, digite sua conta:  ");
        Numero = scanner.nextInt();

        System.out.println("Por favor digite sua agencia:  ");
        Agencia = scanner.next();

        System.out.println("Por favor digite seu nome:  ");
        NomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo que ira utilizar para abertura de conta:");
        Saldo = scanner.nextFloat();
        System.out.println("#################################################################################################################################################");
        System.out.println("# Olá, "+NomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+ " já está disponível para saque #");
        System.out.println("#################################################################################################################################################");
    }
}
