package org.example.venta.controller;

import org.example.exception.ExceptionController;
import org.example.venta.dto.Producto;
import org.example.venta.facade.Productofac;

import java.util.List;

public class ProdControl implements ControllerInterfaz {
    private Productofac pf;

    public ProdControl() {
        this.pf = new Productofac();
    }

    public void proceso(Producto dto) throws ExceptionController {

        try {
            pf.save(dto);
        }catch (Exception e){
            throw new ExceptionController(e);
        }
    }

    public void delete(Producto dto) throws ExceptionController{
        try {
            pf.delete(dto);
        }catch (Exception e){
            throw new ExceptionController(e);

        }

    }

    public List<Producto> selectAll() throws ExceptionController{
        try {
            return pf.selectAll();
        }catch (Exception E){
            throw new ExceptionController(E);

        }


    }

}
