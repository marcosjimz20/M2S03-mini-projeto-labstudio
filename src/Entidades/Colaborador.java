package Entidades;

import java.util.Date;

// Ex 3 - Classe Colaborador ( Nome, data admissão, data desligamento, Cargo, Salário )
public class Colaborador {
    private String nome;
    private Data dtAdmissao;
    private Data dtDesligamento;
    private Cargo cargo;
    private Double salarioAtual;

// CONSTRUCTOR CLASS CARGO
    public Colaborador() {
        super();
    }

    public Colaborador(String nome, Data dtAdmissao, Cargo cargo) {
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
        this.cargo = cargo;
        this.salarioAtual = cargo.getSalarioBase();
    }

    // MÉTODOS GET & SET
    public String getNome() {
    return nome;
}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDtAdmissao() {
        return dtAdmissao;
    }
    public void setDtAdmissao(Data dtAdmissao) {
        this.dtAdmissao = dtAdmissao;
    }

    public Data getDtDesligamento() {
        return dtDesligamento;
    }
    public void setDtDesligamento(Data dtDesligamento) {
        this.dtDesligamento = dtDesligamento;
    }

    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Double getSalarioAtual() {
        return salarioAtual;
    }
    public void setSalarioAtual(Double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }


// OUTROS MÉTODOS USADOS
    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                ", dtAdmissao=" + dtAdmissao +
                ", dtDesligamento=" + dtDesligamento +
                ", cargo=" + cargo +
                ", salarioAtual= R$ " + salarioAtual +
                '}';
    }

    /*fim de código*/
}
