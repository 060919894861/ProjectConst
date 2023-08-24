package Clases;

public class NodoVend {
    int cod; 
    String nom; 
    NodoVend sig; 

    public NodoVend() {
    }

    public NodoVend(int cod, String nom) {
        this.cod = cod;
        this.nom = nom;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public NodoVend getSig() {
        return sig;
    }

    public void setSig(NodoVend sig) {
        this.sig = sig;
    }
    
}
