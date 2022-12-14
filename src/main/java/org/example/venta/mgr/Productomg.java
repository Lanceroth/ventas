package org.example.venta.mgr;

import org.example.exception.ManagerException;
import org.example.venta.dao.Productodao;
import org.example.venta.dto.Producto;

import java.util.List;

public class Productomg implements ProdutmgInterfaz {
    private Productodao p;

    public Productomg() {this.p = new Productodao();}

    public void save(Producto pa) throws ManagerException {

        try {
            Producto tp= p.selectbyid(pa);
            if(tp==null){
                p.insert(pa);
            }else{
                p.update(pa);
            }
        }catch (Exception e){
            throw new ManagerException(e);
        }
    }

    public void delete(Producto pa)throws ManagerException{
        try {
            Producto tp= p.selectbyid(pa);
            if(tp!=null){
                p.delete(pa);
            }
        }catch (Exception e){
            throw new ManagerException(e);
        }
    }

    public List<Producto> selectAll() throws ManagerException{
        try {
            return p.selectAll();
        }catch (Exception e){
            throw new ManagerException(e);

        }

    }


}
