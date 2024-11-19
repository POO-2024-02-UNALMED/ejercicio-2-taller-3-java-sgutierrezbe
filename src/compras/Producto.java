package compras;

public class Producto {
    //se asignan los valores de privacidad de los atributos, de forma que el programa se ejecute de forma correcta
    private final int codigo;
    private String nombre;
    public String tipo;
    public  static int totalProductosPedidos;
//se asigna publico por ser metodo de la clase
    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }
//se asigna publico por ser metodo de la clase
    public void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        //codigo es un valor constante, entonces no se puede cambiar
    }
//se asigna int por devolver un valor entero
    public int getCodigo() {
        return codigo;
    }
//se asigna publico por ser metodo de la clase
    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }
}