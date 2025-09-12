package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDao {
    List<Cliente> lista;
    
    public ClienteDao(){
        lista = new ArrayList<>();
    }
    
    public void addCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public void removerCliente(Cliente cliente){
        lista.remove(cliente);
    }
    
    public List<Cliente> listaClientes(){
        return lista;
    }
}
