package co.edu.unab.api_ref.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unab.api_ref.models.ClienteModel;
import co.edu.unab.api_ref.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienterRepository;

    public ArrayList<ClienteModel> obtenerClientes() {
        return (ArrayList<ClienteModel>) clienterRepository.findAll();
    }

    public ClienteModel guardarCliente(ClienteModel cliente) {
        return clienterRepository.save(cliente);
    }

    public boolean eliminarCliente(String id) {
        if (clienterRepository.existsById(id)) {
            clienterRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Optional<ClienteModel> obtenerPorId(String id){
        return clienterRepository.findById(id);
    }

    public ArrayList<ClienteModel> obtenerPorNombre(String nombre){
        return clienterRepository.findByNombre(nombre);
    }
    
    public ArrayList<ClienteModel> obtenerPorCategoria(String categoria){
        return clienterRepository.findByCategoria(categoria);
    }

    public ArrayList<ClienteModel> obtenerPorPrecio(int precio){
        return clienterRepository.findByPrecioLessThanEqual(precio);
    }
}