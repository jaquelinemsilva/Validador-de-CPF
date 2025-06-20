package cpfvalidator.exception;

public class CpfInvalidoException extends Exception{
    public CpfInvalidoException(){
        super("Digite um CPF válido!");
    }
}
