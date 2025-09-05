package model;

import java.time.LocalDateTime;

public class Venda {
    private LocalDateTime dataVenda;
    private double valorVenda;
    private FormaContrato contrato;
    private FormaPgto pagamento;
    private Cliente cliente;
    private Vendedor vendedor;
    private Veiculo veiculo;

    public LocalDateTime getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDateTime dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public FormaContrato getContrato() {
        return contrato;
    }

    public void setContrato(FormaContrato contrato) {
        this.contrato = contrato;
    }

    public FormaPgto getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaPgto pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Venda{" + "dataVenda=" + dataVenda + ", valorVenda=" + valorVenda + ", contrato=" + contrato + ", pagamento=" + pagamento + ", cliente=" + cliente + ", vendedor=" + vendedor + ", veiculo=" + veiculo + '}';
    }
    
}
