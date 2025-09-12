package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

public class VeiculoDao {
    List<Veiculo> lista;
    
    public VeiculoDao(){
        lista = new ArrayList<>();
    }
    
    public void addVeiculo(Veiculo veiculo){
        lista.add(veiculo);
    }
    
    public void removerVeiculo(Veiculo veiculo){
        lista.remove(veiculo);
    }
    
    public List<Veiculo> listaVeiculos(){
        return lista;
    }
}
