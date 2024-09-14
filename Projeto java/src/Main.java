import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float matricula = 1164f;
        Scanner scanner = new Scanner(System.in);

        // Criação de alguns objetos de hardware básico
        HardwareBasico[] hardware1 = {
                new HardwareBasico("Pentium Core i3", 2200),
                new HardwareBasico("Memória RAM", 8),
                new HardwareBasico("HD", 500)
        };

        HardwareBasico[] hardware2 = {
                new HardwareBasico("Pentium Core i5", 3370),
                new HardwareBasico("Memória RAM", 16),
                new HardwareBasico("HD", 1000)
        };

        HardwareBasico[] hardware3 = {
                new HardwareBasico("Pentium Core i7", 4500),
                new HardwareBasico("Memória RAM", 32),
                new HardwareBasico("HD", 2000)
        };

        // Criação de sistemas operacionais
        SistemaOperacional so1 = new SistemaOperacional("Windows 10", 64);
        SistemaOperacional so2 = new SistemaOperacional("Windows 11", 64);
        SistemaOperacional so3 = new SistemaOperacional("Linux Ubuntu", 32);

        // Criação de computadores
        Computador pc1 = new Computador("Positivo", matricula, so1, hardware1);
        Computador pc2 = new Computador("Acer", matricula + 1234f, so2, hardware2);
        Computador pc3 = new Computador("Vaio", matricula + 5678f, so3, hardware3);

        pc1.mostraPCConfigs();
        pc2.mostraPCConfigs();
        pc3.mostraPCConfigs();

        // Criação do array de computadores do cliente
        Computador[] computadoresClienteArray = new Computador[10]; // Ajuste o tamanho conforme necessário
        int count = 0;

        while (true) {
            System.out.println("Selecione um computador para adicionar à sua lista:");
            System.out.println("1 - Positivo");
            System.out.println("2 - Acer");
            System.out.println("3 - Vaio");
            System.out.println("0 - Finalizar seleção");
            System.out.print("Digite o código do computador: ");
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 0:
                    System.out.println("Seleção finalizada.");
                    break;
                case 1:
                    if (count < computadoresClienteArray.length) {
                        computadoresClienteArray[count++] = pc1;
                        System.out.println("Computador Positivo adicionado.");
                    } else {
                        System.out.println("Lista de computadores cheia.");
                    }
                    break;
                case 2:
                    if (count < computadoresClienteArray.length) {
                        computadoresClienteArray[count++] = pc2;
                        System.out.println("Computador Acer adicionado.");
                    } else {
                        System.out.println("Lista de computadores cheia.");
                    }
                    break;
                case 3:
                    if (count < computadoresClienteArray.length) {
                        computadoresClienteArray[count++] = pc3;
                        System.out.println("Computador Vaio adicionado.");
                    } else {
                        System.out.println("Lista de computadores cheia.");
                    }
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    break;
            }

            if (codigo == 0) {
                break;
            }
        }

        // Reduz o array ao tamanho real usado
        Computador[] computadoresCliente = new Computador[count];

        System.arraycopy(computadoresClienteArray, 0, computadoresCliente, 0, count);

        // Criação do cliente
        Cliente cliente = new Cliente("João Silva", 12345678, computadoresCliente);

        System.out.println("");
        System.out.println("Total: " + cliente.calculaTotalCompra());

        scanner.close();
    }
}
