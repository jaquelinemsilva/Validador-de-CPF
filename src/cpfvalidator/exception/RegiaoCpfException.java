package cpfvalidator.exception;

public class RegiaoCpfException extends Exception {
    public RegiaoCpfException(){
        super("O CPF não corresponde ao estado informado!");
    }
}
