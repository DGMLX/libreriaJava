
public class Test {
    
    public static void main(String[] args) {
        Registro registro = new Registro();
        LibroInfantil libroInfantil = new LibroInfantil(5, 8, "Las aventuras de Jeldes", "Gonzalo Jeldes", "OMEGA", "djkdsaj jadksj djek dek jkadjekj kejdk ajekda kkdje", 0, 12000,12000 );
        LibroDeporte libroDeporte = new LibroDeporte("Ciclismo", "Trucos de BMX", "Garret Reynolds", "FIEND", "djk q ke jclc ejk cle kqjkjdl jqk qwl jqklw f", 15000, 20000, 20000);
        LibroDeporte libroDeporte2 = new LibroDeporte("Ciclismo2", "Trucos de BMX2", "Garret Reynolds2", "FIEND", "djk q ke jclc ejk cle kqjkjdl jqk qwl jqklw f", 15000, 20000, 20000);
        registro.agregar(libroDeporte);
        registro.agregar(libroDeporte2);
        registro.agregar(libroInfantil);
        registro.obtenerLibrosPorCategoria("deporte");
        registro.calcularDescuento("Las aventuras de Jeldes");
        registro.cantLibrosPorCategoria();
        registro.totalAPagar();
}
}