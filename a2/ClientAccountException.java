package a2;

public class ClientAccountException extends Exception {

    public static final String WRONG_DNI = "DNI incorrecte";

    public ClientAccountException(String msg) {
        super(msg);
    }
   /* public PersonNotBornException(String msg) {
        super(msg);
    }

    public PersonNotBornException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonNotBornException(Throwable cause) {
        super(cause);
    }*/

}
