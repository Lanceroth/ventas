package org.example.venta.controller;

import org.example.exception.ExceptionController;
import org.example.venta.dto.Producto;
import org.example.venta.facade.Productofac;

public class ProdControl {
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

    public Producto selectAll() throws ExceptionController{
        try {
            pf.selectAll();
        }catch (Exception E){
            throw new ExceptionController(E);

        }

        return null;
    }

}
