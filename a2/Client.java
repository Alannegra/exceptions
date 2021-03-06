package a2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private String Nom;
    private String Cognoms;
    private String DNI;

    public Client(String nom, String cognoms, String DNI){

        Nom = nom;
        Cognoms = cognoms;
        this.DNI = DNI;

    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getCognoms() {
        return Cognoms;
    }

    public void setCognoms(String cognoms) {
        Cognoms = cognoms;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


    void comprobarDNI(String denei) throws  ClientAccountException{

        Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
        Matcher mat = patron.matcher(denei);

        while(!mat.matches()){
            throw new ClientAccountException(ClientAccountException.WRONG_DNI);
        }


    }

        }




