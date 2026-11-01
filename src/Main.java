
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do Titular");
        String nomeTitular = sc.nextLine();

        double saldo = 2000; // Define o saldo inicial da conta como R$ 2.000,00.
        int opcao; // Variável que armazenará a opção escolhida no menu.
        double depositar; // Variável que armazenará o valor que o usuário deseja depositar.
        double saque; // Variável que armazenará o valor que o usuário deseja sacar.

        System.out.println("Titular " + nomeTitular); // Exibe o nome do titular da conta.
        System.out.println("R$ " + saldo); // Exibe o saldo inicial da conta.

        do { // Inicia o laço do-while, que mantém o menu funcionando até o usuário escolher sair.

            System.out.println("====== BANCO JAVA ======"); // Exibe o título do menu.
            System.out.println("1 - Consultar Saldo"); // Opção para consultar o saldo.
            System.out.println("2 - Depositar"); // Opção para realizar um depósito.
            System.out.println("3 - Sacar"); // Opção para realizar um saque.
            System.out.println("0 - sair"); // Opção para encerrar o programa.

            opcao = sc.nextInt(); // Lê a opção escolhida pelo usuário.

            if (opcao == 1) { // Verifica se o usuário escolheu consultar o saldo.

                System.out.println("Seu saldo é " + saldo); // Exibe o saldo atual da conta.

            } else if (opcao == 2) { // Verifica se o usuário escolheu realizar um depósito.

                System.out.println("Voce escolheu depositar"); // Informa que a opção de depósito foi selecionada.
                System.out.println("Quanto vc deseja depositar"); // Solicita o valor do depósito.

                depositar = sc.nextDouble(); // Lê o valor que será depositado.

                if (depositar <= 0) { // Verifica se o valor informado é menor ou igual a zero.

                    System.out.println("Valor de Deposito Invalido"); // Exibe uma mensagem caso o depósito seja inválido.

                } else { // Executa quando o valor do depósito é válido.

                    saldo = depositar + saldo; // Adiciona o valor depositado ao saldo atual.
                }

            } else if (opcao == 3) { // Verifica se o usuário escolheu realizar um saque.

                System.out.println("Voce escolheu sacar"); // Informa que a opção de saque foi selecionada.
                System.out.println("Quando vc quer sacar?"); // Solicita o valor que o usuário deseja sacar.

                saque = sc.nextDouble(); // Lê o valor solicitado para o saque.

                if (saque <= 0) { // Verifica se o valor do saque é menor ou igual a zero.

                    System.out.println("Valor de saque invalido"); // Exibe uma mensagem caso o saque seja inválido.

                } else if (saldo < saque) { // Verifica se o saldo atual é menor que o valor solicitado para saque.

                    System.out.println("Saldo insuficiente para saque"); // Informa que não há saldo suficiente.

                } else { // Executa quando o valor é válido e há saldo suficiente.

                    saldo = saldo - saque; // Subtrai o valor do saque do saldo atual.
                }

            } else if (opcao == 0) { // Verifica se o usuário escolheu encerrar o programa.

                System.out.println("Fechar o programa"); // Informa que o programa será encerrado.

            } else { // Executa quando o usuário digita uma opção que não existe no menu.

                System.out.println("Numero Invalido"); // Exibe uma mensagem informando que a opção é inválida.
            }

        } while (opcao != 0); // Repete o menu enquanto a opção escolhida for diferente de zero.

        sc.close(); // Fecha o Scanner após o término do programa.
    }
}
