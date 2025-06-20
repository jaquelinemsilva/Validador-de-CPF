package cpfvalidator.validator;

import cpfvalidator.exception.CpfInvalidoException;
import cpfvalidator.exception.RegiaoCpfException;

public class ValidadorDeCpf {
    public static void validarCpf(String cpf) throws CpfInvalidoException, RegiaoCpfException {
        if (cpf.length() != 11 || cpf == null) {
            throw new CpfInvalidoException();
        }

        for (int i = 0; i < cpf.length(); i++) {
            if (!Character.isDigit(cpf.charAt(i))) {
                throw new CpfInvalidoException();
            }
        }
    }
}
