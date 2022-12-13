package org.example.venta.mgr;

import org.example.exception.ManagerException;
import org.example.venta.dao.Productodao;
import org.example.venta.dto.Producto;

public class Productomg {
    private Productodao p;

    public Productomg(Productodao p) {
        this.p = p;
    }

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
            if(p!=null){
                p.delete(pa);
            }
        }catch (Exception e){
            throw new ManagerException(e);
        }
    }


}
