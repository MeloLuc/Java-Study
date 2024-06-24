package exceptions.exercise.goodSolution.model.exceptions;

//can extends Exception(obliged to treat)
//or extends RuntimeException (no obliged to treat)
public class DomainException extends Exception {

    //declarando versão de uma classe serializable - convertidos para bits
    private static final long serialVersionUID = 1L;

    public DomainException(String msg){
        super(msg);
    }
}
