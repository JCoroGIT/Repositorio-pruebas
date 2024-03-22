import java.util.Scanner;

public class AlmacenVelez {

    public static void main(String[] args) {
        // Declaración e inicialización estática de 3 productos
        Producto bocadilloj = new Producto("ID: 100010101", "        Bocadillo de jamón", 1, 1.5);
        Producto refresco = new Producto("ID: 101010101", "      Refresco", 2, 1.05);
        Producto cerveza = new Producto("ID: 100010101", "       Cerveza", 3, 0.75);

        // Captura de información del cliente
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el ID del cliente: ");
        int idCliente = scanner.nextInt();

        // Captura de unidades de cada producto
        System.out.print("\nIngrese las unidades de Bocadillo y jamon: ");
        int unidadesBocadilloJ = scanner.nextInt();

        System.out.print("\nIngrese las unidades del Refresco: ");
        int unidadesRefresco = scanner.nextInt();

        System.out.print("\nIngrese las unidades de la Cerveza: ");
        int unidadesCerveza = scanner.nextInt();

        // Cálculo del subtotal
        double subtotal = (unidadesBocadilloJ * bocadilloj.getValor()) +
                (unidadesRefresco * refresco.getValor()) +
                (unidadesCerveza * cerveza.getValor());

        // Cálculo del IVA (19% del subtotal)
        double iva = subtotal * 0.19;

        // Cálculo del total a pagar (subtotal + IVA)
        double totalPagar = subtotal + iva;

        // Impresión de la factura con IVA
        System.out.print("\n\n\n\n\n¡ ¡ ¡ BIENVENIDO A ALMACENES VELEZ ! ! !");

        System.out.println("\n\n\n\n\n      Factura para: " + nombreCliente + " (ID: " + idCliente + ")");
        System.out.println("\n      Detalles de la compra:");
        System.out.println("\n      Producto1:\n\n- Bocadillo y jamon (" + bocadilloj.getCodigo() + "): " + " \n- Unidades: " + unidadesBocadilloJ + " \n- Valor Unitario: "+ bocadilloj.getValor() + "\n\n\n\n-------------------------------------------------");
        System.out.println("\n      Producto2:\n\n- Refresco (" + refresco.getCodigo() + "): " + " \n- Unidades: " + unidadesRefresco + " \n- Valor Unitario: "+ refresco.getValor() + "\n\n\n\n-------------------------------------------------");
        System.out.println("\n      Producto3:\n\n- Cerveza (" + cerveza.getCodigo() + "): " + " \n- Unidades: " + unidadesCerveza + " \n- Valor Unitario: "+ cerveza.getValor() + "\n\n\n\n-------------------------------------------------");
        System.out.println("\n\nSubtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("\nTotal a pagar: $" + totalPagar);
    }
}

class Producto {
    private String codigo;
    private String nombre;
    private int id;
    private double valor;

    public Producto(String codigo, String nombre, int id, double valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.id = id;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }
}
