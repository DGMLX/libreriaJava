
import java.util.ArrayList;




public class Registro implements Interface{
     ArrayList<Libro> listaLibros;
     
     public Registro() {
        listaLibros = new ArrayList<>();
    }
     
     public void agregar(Libro libro){
        if (buscarLibro(libro.getTitulo(),libro.getAutor())==true) {
            System.out.println("Libro ya registrado");  
        } else {
            listaLibros.add(libro);
            System.out.println("Libro registrado existosamente");  
        }
    }
    
    public boolean buscarLibro(String titulo,String autor){
        for (Libro i : listaLibros) {
            if (i.getTitulo().equalsIgnoreCase(titulo) || i.getAutor().equalsIgnoreCase(autor)) {
                return true; 
            } 
        }
        return false;
    }
    
    public void listar(){
        for (Libro i : listaLibros) {
            System.out.println(i.toString());
        }
    }
    
    public void obtenerLibrosPorCategoria(String categoria){
        if(categoria.equalsIgnoreCase("Infantil") || categoria.equalsIgnoreCase("Deporte")){
            if(categoria.equalsIgnoreCase("Infantil")){
                for (Libro i : listaLibros) {
                    
                    if(i.getClass().getName().equalsIgnoreCase("LibroInfantil")){
                        System.out.println(i.toString());
                    }
                }
            }else{
                for (Libro i : listaLibros) {
                        if(i.getClass().getName().equalsIgnoreCase("LibroDeporte")){
                            System.out.println(i.toString());
                        }
                    }
            }
            
        }else{
            System.out.println("Ingresa una categoria valida");
        }
        
    }
    
    public void cantLibrosPorCategoria(){
        int cantInfantil = 0;
        int cantDeporte = 0;
        for (Libro i : listaLibros) {
                    
            if(i.getClass().getName().equalsIgnoreCase("LibroInfantil")){
                cantInfantil = cantInfantil +1;
            }else{
                cantDeporte = cantDeporte +1 ;
            }
        }
        System.out.println("CANTIDAD DE LIBROS INFANTILES : " + cantInfantil);
        System.out.println("CANTIDAD DE LIBROS DEPORTIVOS: " + cantDeporte);
    }

    @Override
    public void totalAPagar() {
      int total = 0;
      int totalInfantil = 0;
      int totalDeporte = 0;
      int totalPagarInf = 0;
      int totalPagarDep = 0;
       for (Libro i : listaLibros) {
                    
            if(i.getClass().getName().equalsIgnoreCase("LibroInfantil")){
                totalInfantil = totalInfantil + i.precioNormal;
            }else{
                totalDeporte = totalDeporte + i.precioNormal;
            }
        }
       totalPagarInf = (int)(totalInfantil -(totalInfantil-totalInfantil*DESCUENTO_INFANTIL)*IVA);
       totalPagarDep = (int)(totalDeporte -(totalDeporte-totalDeporte*DESCUENTO_DEPORTE)*IVA);
        System.out.println("**************BOLETA**************");
        System.out.println("Total a pagar de libros infantiles sin descuento: $"+totalInfantil );
        System.out.println("Total a pagar de libros infantiles con descuento: $"+totalPagarInf);
        System.out.println("Total a pagar de libros Deportivos sin descuento: $"+totalDeporte );
        System.out.println("Total a pagar de libros Deporvitos con descuento: $"+totalPagarDep);
        System.out.println("TOTAL A PAGAR = $"+(totalPagarInf+totalPagarDep));
    }

    @Override
    public void calcularDescuento(String titulo) {
        int total = 0;
        for (Libro i : listaLibros) {
            if(i.getTitulo().equalsIgnoreCase(titulo)){
                total = total + i.getPrecioNormal();
            }
        }
        System.out.println("Por la compra del libro " + titulo + " tienes un descuento de " + total*DESCUENTO_INFANTIL);
    }
}
