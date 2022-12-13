package org.example;

import org.example.exception.ExceptionController;
import org.example.venta.controller.ProdControl;
import org.example.venta.dto.Producto;

public class Main {
    public static void main(String[] args) {
        ProdControl pcon = new ProdControl();
        Producto producto = new Producto();
        producto.setSku("2");
        producto.setDsproduct("atun");
        try{
            pcon.proceso(producto);
        }catch (ExceptionController e){
            throw new RuntimeException(e);
        }

    }
}