package org.example.venta.controller;

import org.example.exception.ExceptionController;
import org.example.venta.dto.Producto;

import java.util.List;

public interface ControllerInterfaz {
    public void proceso(Producto dto) throws ExceptionController;
    public void delete(Producto dto) throws ExceptionController;
    public List<Producto> selectAll() throws ExceptionController;
}
