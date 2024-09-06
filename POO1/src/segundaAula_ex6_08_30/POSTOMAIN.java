package segundaAula_ex6_08_30;

import java.util.Scanner;

public class POSTOMAIN {
    public static void main(String[] args) {
        POSTO posto = new POSTO(POSTO.TipoComb.COMUM, 500);
        Scanner entrada = new Scanner(System.in);
        
        boolean sair = false;

        while (!sair) {
            System.out.println("\n------ Posto de Gasolina ------");
            System.out.println("1. Abastecer por valor");
            System.out.println("2. Abastecer por litros");
            System.out.println("3. Alterar o valor do litro do combustível");
            System.out.println("4. Alterar o tipo de combustível");
            System.out.println("5. Ver quantidade de combustível restante");
            System.out.println("6. Alterar a quantidade de combustível na bomba");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor em dinheiro: R$ ");
                    double valor = entrada.nextDouble();
                    posto.abastValor(valor);
                    break;

                case 2:
                    System.out.print("Digite a quantidade de litros para abastecer: ");
                    double litros = entrada.nextDouble();
                    posto.abastecerPorLitro(litros);
                    break;

                case 3:
                    System.out.print("Digite o novo valor do litro do combustível: R$ ");
                    double novoValor = entrada.nextDouble();
                    posto.alterarValor(novoValor);
                    break;

                case 4:
                    System.out.println("Escolha o novo tipo de combustível:");
                    System.out.println("1. Comum");
                    System.out.println("2. Aditivada");
                    System.out.println("3. Podium");
                    int tipoComb = entrada.nextInt();
                    switch (tipoComb) {
                        case 1:
                            posto.alterarComb(POSTO.TipoComb.COMUM);
                            break;
                        case 2:
                            posto.alterarComb(POSTO.TipoComb.ADITIVADA);
                            break;
                        case 3:
                            posto.alterarComb(POSTO.TipoComb.PODIUM);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de combustível restante na bomba: " + posto.getQuantiComb() + " litros");
                    break;

                case 6:
                    System.out.print("Digite a nova quantidade de combustível na bomba: ");
                    double novaQuant = entrada.nextDouble();
                    posto.alterarCombNaBomb(novaQuant);
                    break;

                case 7:
                    sair = true;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}