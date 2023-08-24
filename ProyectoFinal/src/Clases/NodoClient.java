package Clases;

public class NodoClient {

    boolean genero;
    int cod;
    int tel;
    String nom;
    String apellido;
    String direcc;
    NodoClient sig;

    public NodoClient() {
    }

    public NodoClient getSig() {
        return sig;
    }

    public void setSig(NodoClient sig) {
        this.sig = sig;
    }

    public NodoClient(boolean genero, int cod, int tel, String nom, String apellido, String direcc) {
        this.genero = genero;
        this.cod = cod;
        this.tel = tel;
        this.nom = nom;
        this.apellido = apellido;
        this.direcc = direcc;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

}
