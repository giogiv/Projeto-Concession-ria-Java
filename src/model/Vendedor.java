package model;

public class Vendedor extends Pessoa{
    private double salario;
    private double comissao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public String exibirDados(){
        String aux = super.exibirDados()+"\n";
        aux += "Salário" + salario+"\n";
        aux += "Comissão:" + comissao + "\n";
    
        return aux;
    }
    
}
