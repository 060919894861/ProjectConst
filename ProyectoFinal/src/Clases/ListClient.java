package Clases;

import javax.swing.JOptionPane;

public class ListClient {

    protected NodoClient CAB;
    private int cont = 0;

    public ListClient() {
        CAB = null;
    }

    private boolean Vacia() {
        return CAB == null;
    }

    public void IngresarClientes(int cod, int tel, String nom, String apellido, String direcc) {
        NodoClient nuevo = new NodoClient();
        nuevo.setCod(cod);
        nuevo.setTel(tel);
        nuevo.setNom(nom);
        nuevo.setApellido(apellido);
        nuevo.setDirecc(direcc);
        if (Vacia()) {
            CAB = nuevo;
            nuevo.setSig(CAB);
        } else {
            nuevo.setSig(CAB);
            CAB = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Se ha ingresado el nuevo cliente");
    }

    private boolean Existe(int RefCod) {
        NodoClient t = CAB;
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

    public void BuscarCliente(int RefCod) {
        if (Existe(RefCod)) {
            JOptionPane.showMessageDialog(null, "El cliente si existe");
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }

    public void ActualizarDatos(int RefCod, int NewCod, int NewTel, String NewNom, String NewApellido, String NewDirecc) {
        NodoClient t = CAB;
        if (Existe(RefCod)) {
            while (t.getCod() != RefCod) {
                t = t.getSig();
            }
            t.setCod(NewCod);
            t.setTel(NewTel);
            t.setNom(NewNom);
            t.setApellido(NewApellido);
            t.setDirecc(NewDirecc);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún cliente con el código: " + RefCod);
        }
    }

    public void Comprobar() {
        NodoClient t = CAB;
        while (t != null) {
            JOptionPane.showMessageDialog(null, t.getCod() + "\n" + t.getNom() + "\n" + t.getApellido() + "\n" + t.getDirecc() + "\n" + t.getTel());
            t = t.getSig();
        }

    }
}
