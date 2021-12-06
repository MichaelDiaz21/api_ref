package co.edu.unab.api_ref.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.api_ref.models.ClienteModel;
import co.edu.unab.api_ref.services.ClienteService;




@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ArrayList<ClienteModel>obtenerCliente(){
        return clienteService.obtenerClientes();
    }

    @PostMapping()
    public ClienteModel cargarCliente(@RequestBody ClienteModel cliente){
        return clienteService.guardarCliente(cliente);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarCliente(@PathVariable("id")String id){
        if(clienteService.eliminarCliente(id)){
            return "Se elimino el producto con el Id: "+id;
        }else{
            return "El producto con la id: "+id+" no se encuentra registrado";
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<ClienteModel> obtenerClientePorId(@PathVariable("id")String id){
        return clienteService.obtenerPorId(id);
    }

    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ClienteModel> obtenerClientePorNombre(@PathVariable("nombre")String nombre){
        return clienteService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/precio/{precio}")
    public ArrayList<ClienteModel> obtenerClientePorPrecio(@PathVariable("precio")int precio){
        return clienteService.obtenerPorPrecio(precio);
    }

    @GetMapping(path = "/categoria/{categoria}")
    public ArrayList<ClienteModel> obtenerClientePorCategoria(@PathVariable("categoria")String categoria){
        return clienteService.obtenerPorCategoria(categoria);
    }
}   

