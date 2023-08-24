package proyectofinal;

import Clases.*;
import javax.swing.JOptionPane;

public class ProyectoFinal {

    public static void main(String[] args) {

        int opc;
        int ref;
        ListArt list = new ListArt();
        NodoArt nod = new NodoArt();
        ListClient list1 = new ListClient();
        NodoClient nod1 = new NodoClient();
        do {
            JOptionPane.showMessageDialog(null, "Preste atención al siguiente menú de opciones."
                    + "\nAl final podrá elegir la opción que más le convenga. ");
            JOptionPane.showMessageDialog(null, "1. Ingresar un nuevo cliente"
                    + "\n2. Actualizar datos de un cliente"
                    + "\n3. Buscar un cliente"
                    + "\n4. borrar un cliente"
                    + "\n5. comprobar los clientes");
            JOptionPane.showMessageDialog(null, "6. Ingresar un nuevo artículo "
                    + "\n7. Actualizar datos de un artículo "
                    + "\n8. Buscar un artículo "
                    + "\n9. Eliminar un artículo "
                    + "\n10. Comprobar los artículos "
                    + "\n11. Vender algún Artículo "
                    + "\n12. Alquilar algún Artículo "
                    + "\n13. Mostrar Listado de Vendidos"
                    + "\n14. Mostrar Alquilados");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una de las opciones anteriores: "));

            switch (opc) {
                case 1:
                    nod1.setCod(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del nuevo cliente: ")));
                    nod1.setNom(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "));
                    nod1.setApellido(JOptionPane.showInputDialog("Ingrese el apellido del cliente: "));
                    nod1.setDirecc(JOptionPane.showInputDialog("Ingrese la dirección del cliente: "));
                    nod1.setTel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefóno del cliente: ")));
                    list1.IngresarClientes(nod1.getCod(), nod1.getTel(), nod1.getNom(), nod1.getApellido(), nod1.getDirecc());
                    break;
                case 2:
                    ref = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de referencia del cliente que desea actualizar o detitar:"));
                    list1.ActualizarDatos(ref, Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo código: ")),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo teléfono: ")),
                            JOptionPane.showInputDialog("Ingrese el nuevo nombre: "),
                            JOptionPane.showInputDialog("Ingrese el nuevo apellido: "), JOptionPane.showInputDialog("Ingrese la nueva dirección: "));
                    break;
                case 3:
                    list1.BuscarCliente(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del cliente a buscar: ")));
                    break;
                case 4:
                   
                    break;
                case 5:
                    list1.Comprobar();
                    break;
                case 6:
                    nod.setCod(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del producto: ")));
                    nod.setNom(JOptionPane.showInputDialog("Ingrese el nombre del producto: "));
                    nod.setCat(JOptionPane.showInputDialog("Ingrese la categoría del producto: "));
                    nod.setPventa(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de venta del producto: ")));
                    nod.setPalquiler(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio de alquiler del producto: ")));
                    nod.setCantAc(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad actual en existencia del producto: ")));
                    list.IngresarArticulos(nod.getCod(), nod.getCantAc(), nod.getNom(), nod.getCat(), nod.getPventa(), nod.getPalquiler());
                    break;
                case 7:
                    ref = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de referencia del producto a actualizar: "));
                    list.EditarArticulo(ref, Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo código del producto: ")),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad en existencia del producto: ")),
                            JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto(si sifue siendo el mismo, póngalo de nuevo): "),
                            JOptionPane.showInputDialog("Ingrese la nueva categoría del producto(Si sigue siendo la misma, póngala de nuevo):"),
                            Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio de venta del producto(Si sigue siendo el mismo, póngalo de nuevo):")),
                            Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio de alquiler del producto(Si es el mismo, póngalo de nuevo): ")));
                    break;
                case 8:
                    list.BuscarArticulo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo a buscar: ")));
                    break;
                case 9:

                    break;
                case 10:
                    list.Comprobar();
                    break;
                case 11:
                    list.Vender(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo que desea vender: ")));
                    break;
                case 12:
                    list.AlquilarArticulos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del artículo a alquilar")),
                            Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del cliente al cual se le va a alquilar.")));
                    break;
                case 13:
                    list.MostrarVendidos();
                    break;
                case 14:
                    list.MostrarAlquilados();
                    break;

            }
        } while (opc < 15);

    }
}
