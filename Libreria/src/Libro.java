


public abstract class Libro  {
    protected String titulo,autor,editorial,descripcion;
    protected int precioOferta,precioInternet,precioNormal;

    public Libro(String titulo, String autor, String editorial, String descripcion, int precioOferta, int precioInternet, int precioNormal) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.descripcion = descripcion;
        this.precioOferta = precioOferta;
        this.precioInternet = precioInternet;
        this.precioNormal = precioNormal;
    }

    public Libro() {
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
        sb.append("Libro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", editorial=").append(editorial);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", precioOferta=").append(precioOferta);
        sb.append(", precioInternet=").append(precioInternet);
        sb.append(", precioNormal=").append(precioNormal);
        sb.append('}');
        return sb.toString();
    }
    
    
}
