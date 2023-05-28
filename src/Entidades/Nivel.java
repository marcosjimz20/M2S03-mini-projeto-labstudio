package Entidades;
// Ex 1 - Classe Enum Nível ( JUNIOR , PLENO, SENIOR )
public enum Nivel {
    JUNIOR(0, "Junior"),
    PLENO(1, "Pleno"),
    SENIOR(2, "Senior");

    private final Integer valor;
    private final String descricao;

// CONSTRUCTOR ENUM NIVEL
    Nivel(Integer valor, String descricao){
        this.valor = valor;
        this.descricao = descricao;
    }

// MÉTODO GET
    public Integer getValor(){
        return this.valor;
    }

    public String getDescricao() {
        return descricao;
    }

    /*fim de código*/
}
