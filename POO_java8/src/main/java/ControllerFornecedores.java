import java.util.List;
import java.util.Scanner;

public class ControllerFornecedores {
    public static void run(Estado estado) throws InterruptedException {
        boolean exit = false;
        while (!exit) {
            Menu.clearWindow();
            int opcao = -1;
            while (opcao < 0 || opcao > 8) {
                opcao = Menu.menuFornecedores();
            }
            Scanner scanner = new Scanner(System.in);
            if (opcao == 1) {
                Menu.clearWindow();
                int j = 1;
                List<Fornecedores> fornecedores = estado.getFornecedores();
                for (Fornecedores forn : fornecedores) {
                    StringBuilder sb = new StringBuilder("\n\u001B[1m \u001B[36m___________\u001B[0m");
                    sb.append("FORNECEDOR ").append(j).append("\u001B[1m \u001B[36m___________\u001B[0m\n");
                    sb.append("\nFornecedor: ").append(forn.Stringfornecedor(forn)).append(forn);
                    System.out.println(sb);
                    j++;
                }

                System.out.println("\nSelecione 0 para voltar atrás: ");
                int i = scanner.nextInt();
                while (i != 0) {
                    i = scanner.nextInt();
                }
            } else if (opcao == 2) {
                List<Fornecedores> fornecedores = estado.getFornecedores();
                Fornecedores forn = null;

                System.out.println("Insira o nome do fornecedor: ");
                Scanner scan = new Scanner(System.in);
                String nomeF = scan.next();
                System.out.println("Insira a formula: ");
                String formula = scan.next();

                if (formula.equals("formula1") || formula.equals("formula2") || formula.equals("formula3")) {
                    if (nomeF.equals("EDP")) {
                        forn = new FornecEDP();
                    } else if (nomeF.equals("Endesa")) {
                        forn = new FornecEndesa();
                    } else if (nomeF.equals("Jomar")) {
                        forn = new FornecJomar();
                    } else {
                        Menu.erros(7);
                        Thread.sleep(3000);
                    }
                } else {
                    Menu.erros(21);
                    Thread.sleep(3000);
                }
                if (forn != null) {
                    forn = fornecedores.get(fornecedores.indexOf(forn));
                    forn.setFormula(formula);
                    estado.updateFornecedor(forn);
                    estado.updateCasas(forn);
                }
            } else if (opcao == 3) {
                Menu.clearWindow();



                System.out.println("\nSelecione 0 para voltar atrás: ");
                int i = scanner.nextInt();
                while (i != 0) {
                    i = scanner.nextInt();
                }
            } else if (opcao == 0) {
                Menu.clearWindow();
                exit = true;
            }
        }
    }
}

