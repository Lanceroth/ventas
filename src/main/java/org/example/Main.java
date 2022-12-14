package org.example;

import org.example.exception.ExceptionController;
import org.example.venta.controller.ProdControl;
import org.example.venta.controller.VenControl;
import org.example.venta.dto.Producto;
import org.example.venta.dto.Vendedor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProdControl pcon = new ProdControl();
        try{
            List<Producto> lista= pcon.selectAll();
            for (int id=0;id<lista.size();id++){
                System.out.println(lista.get(id).getDsproduct());
            }

        }catch (ExceptionController e){
            throw new RuntimeException(e);
        }

    }
/*
    public static void main(String[] args) {
        VenControl pcon = new VenControl();
        Vendedor vendedor = new Vendedor();
        vendedor.setNmvendedor(1);
        vendedor.setDocumento("200");
        vendedor.setDsnombres("Azul");
        vendedor.setDsapellido("Giraldaaaa");
        vendedor.setDsdireccion("Cr 8 #14-1");
        try{
            pcon.proceso(vendedor);
        }catch (ExceptionController e){
            throw new RuntimeException(e);
        }

    }*/
}