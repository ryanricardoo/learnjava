package exerc_ia;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaHospital {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Paciente> database = new ArrayList();

        System.out.println("=======CADASTRO DO PACIENTE========");

        String nomeDigitado = "";
        while(nomeDigitado.length() < 3) {
            System.out.println("Digite um nome válido: ");
            nomeDigitado = leitor.nextLine();
        }

        String cpfDigitado = "";
        while (cpfDigitado.length() < 11 || cpfDigitado.length() > 11){
            System.out.println("Digite o CPF(11 dígitos): ");
            cpfDigitado = leitor.nextLine();
        }

        System.out.println("Digite o telefone: ");
        String telefoneDigitado = leitor.nextLine();

        Paciente novoPaciente =  new Paciente(nomeDigitado, cpfDigitado, telefoneDigitado);

        database.add(novoPaciente);

        System.out.println("Registro salvo com sucesso!");

        for (Paciente p : database){
            p.exibirficha();
        }
        leitor.close();
        }
    }
