package org.example.venta.facade;

import org.example.exception.FacadeException;
import org.example.venta.dto.Producto;

import java.util.List;

public interface ProductInterfaz {
    public void save(Producto p)throws FacadeException;
    public  void delete(Producto p)throws FacadeException;
    public List<Producto> selectAll() throws FacadeException;
}
