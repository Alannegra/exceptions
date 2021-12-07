package a2;

public class MainTwo {
    public static void main(String[] args) {

        Client client  = new Client("Alan", "Rodriguez","123456789A");
        CompteEstalvi compteEstalvi = new CompteEstalvi("1");
        compteEstalvi.addUser(client);


        try {
            client.comprobarDNI(client.getDNI());
        } catch (ClientAccountException e) {
            e.printStackTrace();
        }

        try {
            compteEstalvi.removeUser(client.getDNI());
        } catch (BankAccountException e) {
            e.printStackTrace();
        }

        try {
            compteEstalvi.comprobarCompte(compteEstalvi.getSaldo());
        } catch (BankAccountException e) {
            e.printStackTrace();
        }

        //if(compteEstalvi.comprobarCompte(compteEstalvi.getSaldo())) System.out.println(BankAccountException.ACCOUNT_NEGATIVE);


        //compteEstalvi.removeUser(client.getDNI());


    }
}
