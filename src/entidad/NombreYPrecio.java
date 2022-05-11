package entidad;

public class NombreYPrecio implements Comparable<NombreYPrecio>{
    private String nombre;
    private Float precio;

    public NombreYPrecio() {
    }

    public NombreYPrecio(String nombre, Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(NombreYPrecio p) {
        return precio.compareTo(p.precio);
    }

}
