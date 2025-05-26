package com.ecomarket.reabastecimiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.reabastecimiento.model.Producto;
import com.ecomarket.reabastecimiento.repository.ProductoRepository;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    public Producto findById(int id_producto) {
        return productoRepository.findById(id_producto);
    }

    public Producto crear_producto(Producto producto) {
        return productoRepository.save(producto);
    }
    
}
