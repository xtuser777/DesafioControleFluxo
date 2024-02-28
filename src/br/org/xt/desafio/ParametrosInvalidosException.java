package br.org.xt.desafio;

public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 1149241039409861914L;

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    // contrói um objeto ParametrosInvalidosException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public ParametrosInvalidosException(Throwable cause){
        super("O segundo parâmetro deve ser maior que o primeiro", cause);
    }
}
