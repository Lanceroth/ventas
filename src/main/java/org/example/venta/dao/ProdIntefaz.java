package org.example.venta.dao;

import org.example.exception.DaoException;
import org.example.venta.dto.Producto;

import java.util.List;

public interface ProdIntefaz {
    public void insert(Producto producto) throws DaoException;

    public void update(Producto producto) throws DaoException;

    public void delete(Producto producto) throws DaoException;

    public List<Producto> selectAll() throws DaoException;
}
