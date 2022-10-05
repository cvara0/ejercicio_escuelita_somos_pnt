package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gondola{
    private List<Object> listaProducto=new ArrayList<>();
    private final List<NombreYPrecio> listaNombreYPrecio=new ArrayList<>();

    public Gondola() {
    }

    public Gondola(List<Object> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public List<Object> cargarGondola(){
        listaNombreYPrecio.add(new NombreYPrecio("Coca-Cola Zero", 20F));
        listaProducto.add(new BebidaSinAlcohol("Coca-Cola Zero", 20F, 1.5F));
        listaNombreYPrecio.add(new NombreYPrecio("Coca-Cola", 18F));
        listaProducto.add(new BebidaSinAlcohol("Coca-Cola", 18F, 1.5F));
        listaNombreYPrecio.add(new NombreYPrecio("Sedal", 19F));
        listaProducto.add(new Shampoo("Sedal", 19F, (short) 500));
        listaNombreYPrecio.add(new NombreYPrecio("Frutillas", 64.00F));
        listaProducto.add(new Fruta("Frutillas", 64.00F,"kilo"));
        return listaProducto;
    }

    public String gondolaAString(){
        StringBuilder lista= new StringBuilder();
        for(Object i:cargarGondola()){
            lista.append(i.toString()).append("\n");
        }
        lista.append("=============================\n");
        return lista.toString();
    }

    public String caroYBaratoAString(){
        return String.format("Producto más caro: %s\nProducto más barato: %s",Collections.max(listaNombreYPrecio).getNombre(),Collections.min(listaNombreYPrecio).getNombre());
   }

    @Override
    public String toString() {
        return gondolaAString()+caroYBaratoAString();
    }
}
/*
*
* Imaginemos un supermercado de barrio.

Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse,
se visualiza lo siguiente por consola y se termina la ejecución:

Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo

=============================

Producto más caro: Frutillas
Producto más barato: Coca-Cola

La solución debe cumplir con los siguientes requisitos:

Diseñar una solución orientada a objetos.
La salida es por consola y exactamente como se requiere.
Usar solamente las clases provistas por Java 8..
Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
Para mostrar el mayor / menor, utilizar la interfaz Comparable.
Para imprimir por pantalla, sobrescribir el método toString()
*
* */