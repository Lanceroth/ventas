package org.example.venta.facade;

import org.example.exception.FacadeException;
import org.example.venta.dto.Producto;
import org.example.venta.mgr.Productomg;

public class Productofac {

    private Productomg pmg;

    public Productofac(Productomg pmg) {
        this.pmg = pmg;
    }

    public void save(Producto p)throws FacadeException {
        try {
            pmg.save(p);
        }catch (Exception e){
            throw new FacadeException(e);
        }

    }

    public  void delete(Producto p)throws FacadeException{

        try {
            pmg.delete(p);
        }catch (Exception e){
            throw new FacadeException(e);
        }
    }
}
