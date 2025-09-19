package model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Cliente;
import model.Veiculo;

public class VeiculoDAO {

    List<Veiculo> lista;

    public VeiculoDAO() {
        lista = new ArrayList<>();
    }

    public void addVeiculo(Veiculo obj) {
        lista.add(obj);
    }

    public void removerVeiculo(Veiculo obj) {
        lista.remove(obj);
    }

    public List<Veiculo> listaVeiculos() {
        return lista;
    }

    public Optional<Veiculo> buscarPorPlaca(String placa) {
        return lista.stream()
                .filter(p -> p.getPlaca().equals(placa))
                .findFirst();
    }
}
