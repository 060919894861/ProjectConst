package Clases;

public class NodoArt {

    int cod;
    int cantAc;
    String nom;
    String cat;
    float Pventa;
    float Palquiler;
    NodoArt sig;

    public NodoArt(int cod, int cantAc, String nom, String cat, float Pventa, float Palquiler) {
        this.cod = cod;
        this.cantAc = cantAc;
        this.nom = nom;
        this.cat = cat;
        this.Pventa = Pventa;
        this.Palquiler = Palquiler;
    }

    public NodoArt() {
    }

    public NodoArt getSig() {
        return sig;
    }

    public void setSig(NodoArt sig) {
        this.sig = sig;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCantAc() {
        return cantAc;
    }

    public void setCantAc(int cantAc) {
        this.cantAc = cantAc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public float getPventa() {
        return Pventa;
    }

    public void setPventa(float Pventa) {
        this.Pventa = Pventa;
    }

    public float getPalquiler() {
        return Palquiler;
    }

    public void setPalquiler(float Palquiler) {
        this.Palquiler = Palquiler;
    }

}
