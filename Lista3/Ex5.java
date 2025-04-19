package Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Paciente> pacientes = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Médico");
            System.out.println("2 - Cadastrar Paciente");
            System.out.println("3 - Exibir Médicos");
            System.out.println("4 - Exibir Pacientes");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do médico: ");
                    String nomeMedico = scanner.nextLine();
                    System.out.print("Idade do médico: ");
                    int idadeMedico = scanner.nextInt();
                    scanner.nextLine();
                    medicos.add(new Medico(nomeMedico, idadeMedico));
                    System.out.println("Médico cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Idade do paciente: ");
                    int idadePaciente = scanner.nextInt();
                    scanner.nextLine();
                    pacientes.add(new Paciente(nomePaciente, idadePaciente));
                    System.out.println("Paciente cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- Lista de Médicos ---");
                    if (medicos.isEmpty()) {
                        System.out.println("Nenhum médico cadastrado.");
                    } else {
                        for (Medico m : medicos) {
                            System.out.println(m);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n--- Lista de Pacientes ---");
                    if (pacientes.isEmpty()) {
                        System.out.println("Nenhum paciente cadastrado.");
                    } else {
                        for (Paciente p : pacientes) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
