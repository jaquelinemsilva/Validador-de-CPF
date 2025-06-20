package cpfvalidator.validator;

import cpfvalidator.exception.CpfInvalidoException;
import cpfvalidator.exception.RegiaoCpfException;

public class ValidadorDeEstado {
    public static void validarEstado(String cpf, String estado) throws CpfInvalidoException, RegiaoCpfException {

        char digitoDaRegiao = cpf.charAt(8);

        if (digitoDaRegiao == '0') {
            if (!(estado.equals("rio grande do sul") || estado.equals("rs"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '1') {
            if (!(estado.equals("distrito federal") || estado.equals("df") || estado.equals("goiás") || estado.equals("go") || estado.equals("mato grosso do sul") || estado.equals("ms") || estado.equals("mato grosso") || estado.equals("mt") || estado.equals("tocantins") || estado.equals("to"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '2') {
            if (!(estado.equals("acre") || estado.equals("ac") || estado.equals("amazonas") || estado.equals("am") || estado.equals("amapá") || estado.equals("ap") || estado.equals("pará") || estado.equals("pa") || estado.equals("rondônia") || estado.equals("ro") || estado.equals("roraima") || estado.equals("rr"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '3') {
            if (!(estado.equals("ceará") || estado.equals("ce") || estado.equals("maranhão") || estado.equals("ma") || estado.equals("piauí") || estado.equals("pi"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '4') {
            if (!(estado.equals("alagoas") || estado.equals("al") || estado.equals("paraíba") || estado.equals("pb") || estado.equals("pernambuco") || estado.equals("pe") || estado.equals("rio grande do norte") || estado.equals("rn"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '5') {
            if (!(estado.equals("bahia") || estado.equals("ba") || estado.equals("sergipe") || estado.equals("se"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '6') {
            if (!(estado.equals("minas gerais") || estado.equals("mg"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '7') {
            if (!(estado.equals("rio de janeiro") || estado.equals("rj") || estado.equals("espírito santo") || estado.equals("es"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '8') {
            if (!(estado.equals("são paulo") || estado.equals("sp"))) {
                throw new RegiaoCpfException();
            }
        } else if (digitoDaRegiao == '9') {
            if (!(estado.equals("paraná") || estado.equals("pr") || estado.equals("santa catarina") || estado.equals("sc"))) {
                throw new RegiaoCpfException();
            }
        }
    }
}
