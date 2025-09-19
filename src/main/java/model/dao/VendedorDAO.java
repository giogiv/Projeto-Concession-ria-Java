package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.Vendedor;

public class VendedorDAO {
    List<Vendedor> listaVendedores;

    public VendedorDAO() {
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
