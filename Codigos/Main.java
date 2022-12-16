import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //var profissional = new Profissional();
        //Refeito o codigo
        Profissional profissional = new Profissional();
        System.out.println("Digite o nome do Profissional:");
        profissional.setNome(sc.nextLine());
        System.out.println("Digite o salario do Profissional:");
        profissional.setSalarioMensal(sc.nextDouble());
        clearBuffer(sc);
        ArrayList<ItemSistema> listas = new ArrayList<ItemSistema>();

        while (true) {
            //var tela = new ItemSistema();
            //Refeito o codigo
            ItemSistema tela = new ItemSistema();
            System.out.println("Digite o nome do Item:");
            tela.setNomeItem(sc.nextLine());

            System.out.println("Digite o tipo do Item:");
            tela.setTipoItem(sc.nextLine());

            System.out.println("Digite o numero da complexidade:");
            System.out.println("    [1] Feito em até 24 horas");
            System.out.println("    [2] Feito em até 48 horas");
            System.out.println("    [3] Feito em até 72 horas");
            System.out.println("    [*] Feito em até 96 horas");
            tela.setComplexidade(sc.nextInt());

            listas.add(tela);

            int totalHorasTelas = 0;
            int numeroTela = 1;

            System.out.println("Deseja Inserir mais uma tela ? [S] ou [N]: ");
            String resp = sc.next();
            for (ItemSistema itemSistema : listas) {
                totalHorasTelas = totalHorasTelas + itemSistema.CalculaQtdHoras();

                System.out.println("=====================================================");
                System.out.println("Item " + numeroTela + " do orçamento: ");
                System.out.println("Nome do Item: " + itemSistema.getNomeItem());
                System.out.println("Tipo do Item: " + itemSistema.getTipoItem());
                System.out.println("Complexidade do Item: " + itemSistema.getComplexidade());
                System.out.println("Quantidade de Horas Previstas: " + itemSistema.CalculaQtdHoras());

                numeroTela = numeroTela + 1;
            }

            double valorTotalSistema = profissional.CalculaValorHora() * totalHorasTelas;

            System.out.println("Valor Total do Orçamento: " + valorTotalSistema);
            if (resp.equalsIgnoreCase("N")) {
                break;
            }
            clearBuffer(sc);
        }
    }
    private static void clearBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
