package model.dao;

import model.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class VendedorDao {
    List<Vendedor> listaVendedores;
    
    public VendedorDao (){
        listaVendedores = new ArrayList<>();
    }
    public List<Vendedor> listaVendedores(){
        return listaVendedores;
    }
    
    public void addVendedor(Vendedor obj){
        listaVendedores.add(obj);
    }
    
    public void removerVendedor(Vendedor obj){
        listaVendedores.remove(obj);
    }
    
}
