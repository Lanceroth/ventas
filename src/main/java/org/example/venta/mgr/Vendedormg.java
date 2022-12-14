package org.example.venta.mgr;

import org.example.exception.ManagerException;
import org.example.venta.dao.VendedorDao;
import org.example.venta.dto.Vendedor;

public class Vendedormg {
    private VendedorDao d;

    public Vendedormg() {this.d = new VendedorDao();}

    public void save(Vendedor vd) throws ManagerException{
        try {
            Vendedor v= d.selectbyid(vd);
            if(v == null){
                d.insert(vd);
            }else {
                d.update(vd);
            }
        }catch (Exception e){
            throw new ManagerException(e);

        }
    }

    public void delete(Vendedor vd) throws ManagerException{
        try {
            Vendedor v= d.selectbyid(vd);
            if(v!=null){
                d.delete(vd);
            }
        }catch (Exception e){
            throw new ManagerException(e);
        }
    }

    public void selectAll() throws ManagerException{
        try {
            d.selectAll();
        }catch (Exception e){
            throw new ManagerException();
        }
    }
}
