package Clases;

public class NodoAlq {
    String nom; 
    NodoAlq sig; 

    public NodoAlq() {
    }

    public NodoAlq(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public NodoAlq getSig() {
        return sig;
    }

    public void setSig(NodoAlq sig) {
        this.sig = sig;
    }
    
}
