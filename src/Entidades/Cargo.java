package Entidades;
// Ex 2 - Classe Cargo ( Descrição, Salário base , Nível (classe Enum)  )
public class Cargo {
    private String descricao;
    private Double salarioBase;
    private Nivel nivel;

// CONSTRUCTOR CLASS CARGO
    public Cargo() {
        super();
    }

    public Cargo(String descricao, Double salarioBase, Nivel nivel) {
        this.descricao = descricao;
        this.salarioBase = salarioBase;
        this.nivel = nivel;
    }


// MÉTODOS GET & SET
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Nivel getNivel() {
        return nivel;
    }
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }


// OUTROS MÉTODOS USADOS
    @Override
    public String toString() {
        return "{" +
                "descricao='" + descricao + '\'' +
                ", salarioBase= R$ " + salarioBase +
                ", nivel=" + nivel +
                '}';
    }

    /*fim de código*/
}


