package org.example.venta.mgr;

import org.example.exception.ManagerException;
import org.example.venta.dao.Productodao;
import org.example.venta.dto.Producto;

import java.util.List;

public interface ProdutmgInterfaz {
    public void save(Producto pa) throws ManagerException;
    public void delete(Producto pa)throws ManagerException;
    public List<Producto> selectAll() throws ManagerException;

}
