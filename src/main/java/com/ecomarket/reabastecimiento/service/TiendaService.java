package com.ecomarket.reabastecimiento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomarket.reabastecimiento.model.Tienda;
import com.ecomarket.reabastecimiento.repository.TiendaRepository;

@Service
public class TiendaService {
    @Autowired
    private TiendaRepository tiendaRepository;
    

    public List<Tienda> findAll() {
        // TODO Auto-generated method stub
        return tiendaRepository.findAll();
    }

    public Tienda crear_tienda(Tienda tienda) {
        // TODO Auto-generated method stub
        return tiendaRepository.save(tienda);
    }
    
}
