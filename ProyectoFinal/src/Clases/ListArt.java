package Clases;

import javax.swing.JOptionPane;

public class ListArt {

    protected NodoAlq FIN;
    protected NodoVend Ini;
    protected NodoArt CAB;
    private int cont = 0;

    public ListArt() {
        CAB = null;
    }

    private boolean Vacia() {
        return CAB == null;
    }

    private boolean Vacia1() {
        return Ini == null;
    }

    private boolean Vacia2() {
        return FIN == null;
    }

    public void IngresarArticulos(int cod, int cantAc, String nom, String cat, float Pventa, float Palquiler) {
        NodoArt nuevo = new NodoArt();
        nuevo.setCod(cod);
        nuevo.setCantAc(cantAc);
        nuevo.setNom(nom);
        nuevo.setCat(cat);
        nuevo.setPventa(Pventa);
        nuevo.setPalquiler(Palquiler);
        if (Vacia()) {
            CAB = nuevo;
            nuevo.setSig(CAB);
        } else {
            nuevo.setSig(CAB);
            CAB = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Se ha ingresado el nuevo artículo");
    }

    private boolean Existe(int RefCod) {
        NodoArt t = CAB;
        boolean encontro = false;
        while (t != null && !encontro) {
            if (t.getCod() == RefCod) {
                encontro = true;
                cont++;
            } else {
                t = t.getSig();
            }
        }
        return encontro;
    }

    public void BuscarArticulo(int RefCod) {
        if (Existe(RefCod)) {
            JOptionPane.showMessageDialog(null, "El artículo si existe.");
        } else {
            JOptionPane.showMessageDialog(null, "El artículo no existe.");
        }
    }

    public void EditarArticulo(int RefCod, int NewCod, int NewCant, String NewNom, String NewCat, float Pventa, float Palquiler) {
        NodoArt t = CAB;
        if (Existe(RefCod)) {
            while (t.getCod() != RefCod) {
                t = t.getSig();
            }
            t.setCod(NewCod);
            t.setCantAc(NewCant);
            t.setNom(NewNom);
            t.setCat(NewCat);
            t.setPventa(Pventa);
            t.setPalquiler(Palquiler);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ninguna referencia que corresponda al código: " + RefCod);
        }
    }

    public void Comprobar() {
        NodoArt t = CAB;
        while (t != null) {
            JOptionPane.showMessageDialog(null, t.getCod() + "\n" + t.getNom() + "\n" + t.getCat() + "\n" + t.getCantAc() + "\n" + t.getPventa() + "\n" + t.getPalquiler());
            t = t.getSig();
        }
    }

    public void Vender(int cod) {
        NodoVend aux = new NodoVend();
        String resp;
        NodoArt t = CAB;
        float Piva;
        float Pdcto;
        float Pentrega;
        float Pdev;
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de hoy: ");
        if (Existe(cod)) {

            this.BuscarArticulo(cod);
            while (t.getCod() != cod) {
                t = t.getSig();
            }
            aux.setNom(t.getNom());
            if (Vacia()) {
                Ini = aux;
                aux.setSig(Ini);
            } else {
                aux.setSig(Ini);
                Ini = aux;
            }
            JOptionPane.showMessageDialog(null, "El precio del artículo " + t.getNom() + " es de: " + t.getPventa());
            Piva = t.getPventa() + (t.getPventa() * 0.19f);
            resp = JOptionPane.showInputDialog("Cuenta con algún descuento Si/No");
            if (resp.equalsIgnoreCase("si")) {
                double dcto = Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese de cuánto es su descuento (Ingreselo como el ejemplo 0.19): "));
                Pdcto = (float) (Piva - (Piva * dcto));
                JOptionPane.showMessageDialog(null, "El precio con descuento a pagar por el cliente es de: " + Pdcto);
                Pentrega = Float.parseFloat("Por favor ingrese cuánto dinero entregó el cliente: ");
                Pdev = Pentrega - Pdcto;
                JOptionPane.showMessageDialog(null, "El monto de devolución es de: " + Pdev);
            } else {
                JOptionPane.showMessageDialog(null, "El precio a pagar por el cliente con iva incluido es de: " + Piva);
                Pentrega = Float.parseFloat("Por favor ingrese cuánto dinero entregó el cliente: ");
                Pdev = Pentrega - Piva;
                JOptionPane.showMessageDialog(null, "El monto de devolución es de: " + Pdev);
            }
            JOptionPane.showMessageDialog(null, "La venta del artículo " + t.getNom() + " ha sido realizada con éxito el día " + fecha);

        }
    }

    public void AlquilarArticulos(int codArt, int codClient) {
        NodoAlq now = new NodoAlq();
        NodoArt t = CAB;
        String resp1;
        float Pent1;
        float Pdev1;
        String Fdev;
        String resp2;
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha del día de hoy: ");
        if (Existe(codArt)) {
            this.BuscarArticulo(codArt);
            while (t.getCod() != codArt) {
                t = t.getSig();
            }
            now.setNom(t.getNom());
            if (Vacia2()) {
                FIN = now;
                now.setSig(FIN);
            } else {
                now.setSig(FIN);
                FIN = now;
            }
            resp2 = JOptionPane.showInputDialog("Va a alquilar un artículo o a devolver uno: ");
            if (resp2.equalsIgnoreCase("alquilar")) {
                JOptionPane.showMessageDialog(null, "El precio de alquiler del artículo " + t.getNom() + " es de " + t.getPalquiler());
                float Valoriva = t.getPalquiler() + (t.getPalquiler() * 0.19f);
                resp1 = JOptionPane.showInputDialog("¿El cliente cuenta con algún descuento? :");
                if (resp1.equalsIgnoreCase("si")) {
                    double dect1 = Double.parseDouble(JOptionPane.showInputDialog("¿De cuanto es el descuento del cliente?: "));
                    float ValorDct = (float) (Valoriva - (Valoriva * dect1));
                    JOptionPane.showMessageDialog(null, "El valor a pagar por el cliente con descuento es de: " + ValorDct);
                    Pent1 = Float.parseFloat("Por favor ingrese cuánto dinero entregó el cliente: ");
                    Pdev1 = Pent1 - ValorDct;
                    JOptionPane.showMessageDialog(null, "El monto de devolución es de: " + Pdev1);
                } else {
                    JOptionPane.showMessageDialog(null, "El valor a pagar por el cliente con iva incluido es de: " + Valoriva);
                    Pent1 = Float.parseFloat("Por favor ingrese cuánto dinero entregó el cliente: ");
                    Pdev1 = Pent1 - Valoriva;
                    JOptionPane.showMessageDialog(null, "El monto de devolución es de: " + Pdev1);
                }

                JOptionPane.showMessageDialog(null, "El artículo " + t.getNom() + " fue alquilado con éxito el día: " + fecha);

            } else if (resp2.equalsIgnoreCase("devolver")) {

            }

        }
    }

    public void MostrarVendidos() {
        NodoVend aux = Ini;
        while (aux != null) {
            JOptionPane.showMessageDialog(null, aux.getNom() + "\n");
            aux = aux.getSig();
        }
    }

    public void MostrarAlquilados() {
        NodoAlq now = FIN;
        while (now != null) {
            JOptionPane.showMessageDialog(null, now.getNom() + "\n");
            now = now.getSig();
        }
    }

}
