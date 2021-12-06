package co.edu.unab.api_ref.repositories;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unab.api_ref.models.ClienteModel;

public interface ClienteRepository extends MongoRepository<ClienteModel, String> {
     
    ArrayList<ClienteModel> findByNombre (String nombre);
    ArrayList<ClienteModel> findByCategoria(String categoria);
    ArrayList<ClienteModel> findByPrecioLessThanEqual (int precio);
    
}
