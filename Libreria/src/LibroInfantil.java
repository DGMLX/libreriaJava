



public class LibroInfantil extends Libro{
    private int edadMinima,edadMaxima;

    public LibroInfantil(int edadMinima, int edadMaxima, String titulo, String autor, String editorial, String descripcion, int precioOferta, int precioInternet, int precioNormal) {
        super(titulo, autor, editorial, descripcion, precioOferta, precioInternet, precioNormal);
        this.edadMinima = edadMinima;
        this.edadMaxima = edadMaxima;
    }

    public LibroInfantil() {
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public int getEdadMaxima() {
        return edadMaxima;
    }

    public void setEdadMaxima(int edadMaxima) {
        this.edadMaxima = edadMaxima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(int precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getPrecioInternet() {
        return precioInternet;
    }

    public void setPrecioInternet(int precioInternet) {
        this.precioInternet = precioInternet;
    }

    public int getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(int precioNormal) {
        this.precioNormal = precioNormal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibroInfantil{");
        sb.append("edadMinima=").append(edadMinima);
        sb.append(", edadMaxima=").append(edadMaxima);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }


    
    
    
}
