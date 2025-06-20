package cpfvalidator.main;

import cpfvalidator.exception.CpfInvalidoException;
import cpfvalidator.exception.RegiaoCpfException;
import cpfvalidator.validator.ValidadorDeCpf;
import cpfvalidator.validator.ValidadorDeEstado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cpfEInvalido = true;

        while(cpfEInvalido){

            try{
                String estado = " ";
                String cpf = " ";
                System.out.println("Digite o cpf: ");
                cpf = scanner.nextLine();
                ValidadorDeCpf.validarCpf(cpf);
                System.out.println("Digite o estado de emissão do documento: ");
                estado = scanner.nextLine().toLowerCase();
                ValidadorDeEstado.validarEstado(cpf, estado);
                cpfEInvalido = false;
            } catch (CpfInvalidoException e){
                System.out.println(e.getMessage());
            } catch (RegiaoCpfException e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Dados confirmados!");

    }

}
