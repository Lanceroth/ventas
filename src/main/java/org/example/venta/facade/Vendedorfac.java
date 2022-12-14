package org.example.venta.facade;

import org.example.exception.FacadeException;
import org.example.venta.database.ManagerConexion;
import org.example.venta.dto.Vendedor;
import org.example.venta.mgr.Vendedormg;

public class Vendedorfac {

    private Vendedormg pmg;

    public  Vendedorfac() {
        this.pmg= new Vendedormg();
    }

    public void save(Vendedor v)throws FacadeException{
        try{
            ManagerConexion.getInstance().open();
            pmg.save(v);
            ManagerConexion.getInstance().commit();
        }catch (Exception e){
            ManagerConexion.getInstance().rollback();
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().close();
        }
    }

    public void delete(Vendedor v)throws FacadeException{

        try {
            pmg.delete(v);
        }catch (Exception e){
            throw new FacadeException(e);
        }
    }

    public void selectAll() throws FacadeException{
        try{
            pmg.selectAll();
        }catch (Exception e){
            throw new FacadeException(e);
        }
    }
}
