package org.example.venta.controller;

import org.example.exception.ExceptionController;
import org.example.venta.dto.Vendedor;
import org.example.venta.facade.Vendedorfac;

public class VenControl {
    private Vendedorfac vf;

    public VenControl(){
        this.vf = new Vendedorfac();
    }

    public void proceso(Vendedor dto) throws ExceptionController{
        try {
            vf.save(dto);
        }catch (Exception e){
            throw new ExceptionController(e);
        }
    }

    public void  delete(Vendedor dto) throws ExceptionController{
        try {
            vf.delete(dto);
        }catch (Exception e) {
            throw new ExceptionController(e);
        }
    }

    public Vendedor selectAll() throws ExceptionController{
        try {
            vf.selectAll();
        }catch (Exception e){
            throw new ExceptionController(e);
        }
        return null;
    }

}
