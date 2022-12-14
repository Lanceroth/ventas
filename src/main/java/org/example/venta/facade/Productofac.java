package org.example.venta.facade;

import org.example.exception.FacadeException;
import org.example.venta.database.ManagerConexion;
import org.example.venta.dto.Producto;
import org.example.venta.mgr.Productomg;

import java.util.List;

public class Productofac implements ProductInterfaz {

    private Productomg pmg;

    public Productofac() {
        this.pmg = new Productomg();
    }


    public void save(Producto p)throws FacadeException {
        try {
            ManagerConexion.getInstance().open();
            pmg.save(p);
            ManagerConexion.getInstance().commit();
        }catch (Exception e){
            ManagerConexion.getInstance().rollback();
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().close();
        }

    }

    public  void delete(Producto p)throws FacadeException{

        try {
            pmg.delete(p);
        }catch (Exception e){
            throw new FacadeException(e);
        }
    }

    public List<Producto> selectAll() throws FacadeException{
        ManagerConexion.getInstance().open();
        try {
           return pmg.selectAll();
        }catch (Exception e){
            throw new FacadeException(e);

        }finally {
            ManagerConexion.getInstance().close();
        }

    }
}
