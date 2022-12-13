package org.example.venta.dao;

import org.example.exception.DaoException;
import org.example.venta.dto.Producto;

public class Productodao {
    public void insert(Producto producto) throws DaoException {
        try {

        }catch (Exception e){
            throw new DaoException(e);
        }

    }
    public void update(Producto producto)throws DaoException {
        try {

        }catch (Exception e){
            throw new DaoException(e);
        }
    }
    public void delete(Producto producto)throws DaoException {
        try {

        }catch (Exception e){
            throw new DaoException(e);
        }
    }
    public Producto selectbyid(Producto producto)throws DaoException {
        try {

        }catch (Exception e){
            throw new DaoException(e);
        }
        return producto;
    }

    public void selectall(Producto producto)throws DaoException{

    }
}
