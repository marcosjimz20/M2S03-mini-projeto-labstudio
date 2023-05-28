import Entidades.Cargo;
import Entidades.Colaborador;
import Entidades.Data;
import Entidades.Nivel;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
/*
Será necessário desenvolvimento da estrutura  abaixo:
 Ex 1 - Classe Enum Nível ( JUNIOR , PLENO, SENIOR )
 Ex 2 - Classe Cargo ( Descrição, Salário base , Nível (classe Enum)  )
 Ex 3 - Classe Colaborador ( Nome, data admissão, data desligamento, Cargo, Salário )
 Ex 4 - Fazer inclusão de novo colaborador em lista de Colaboradores
 Ex 5 - Listar colaboradores ativos ( que não possuem data desligamento )
 Ex 6 - Listar colaboradores por Cargo
 Ex 7 - Desenvolver um método que será responsável por admitir um colaborador ( incluir na lista de colaboradores )
 Ex 8 - Desenvolver um método que será responsável por desligar um colaborador ( alterar o objeto incluindo uma data de desligamento )
 Ex 9 - Desenvolver um método que será responsável por promover um colaborador de Cargo
 Ex 10 - Listar colaboradores ordenado por salário decrescente
 */
        static ArrayList<Colaborador> colaboradores = new ArrayList<>();
        static ArrayList<Cargo> cargos = new ArrayList<>();

    public static void main(String[] args) {
// Ex 4 - Fazer inclusão de novo colaborador em lista de Colaboradores

        cargos.add(new Cargo("Dev FullStack Junior", 3000.0, Nivel.JUNIOR));
        cargos.add(new Cargo("Dev FullStack Pleno", 5000.0, Nivel.PLENO));
        cargos.add(new Cargo("Dev FullStack Senior", 7000.0, Nivel.SENIOR));

        colaboradores.add(new Colaborador("Marcos", new Data(20,10,2023), cargos.get(0)));
        colaboradores.add(new Colaborador("Marcelys", new Data(12,11,2018), cargos.get(1)));
        colaboradores.add(new Colaborador("Humberto", new Data(10,12,2014), cargos.get(2)));
        colaboradores.add(new Colaborador("Diego", new Data(17,10,2021), cargos.get(0)));
        colaboradores.add(new Colaborador("Indira", new Data(22,11,2019), cargos.get(1)));
        colaboradores.add(new Colaborador("Edgar", new Data(15,12,2014), cargos.get(2)));

// Ex 5 - Listar colaboradores ativos ( que não possuem data desligamento )
/*       System.out.println("--- Listar colaboradores ativos ( que não possuem data desligamento ) ---");

       listarColaboradores(colaboradores);
        for (Colaborador idC : colaboradores) {
            if (idC.getDtDesligamento() == null) {
                System.out.println(idC);
            }
        }
*/

// Ex 6 - Listar colaboradores por Cargo
/*        System.out.println("--- Listar colaboradores por Cargo ---");

        listarColaboradoresPorCargo(cargos, colaboradores);
        for (Cargo idCargo : cargos) {
            System.out.println("Lista de colaboradores por Cargo - " + idCargo.getDescricao());
            for (Colaborador colaborador : colaboradores) {
                if (colaborador.getCargo() == idCargo) {
                    System.out.println(colaborador);
                }
            }
        }
 */

// Ex 7 - Desenvolver um método que será responsável por admitir um colaborador ( incluir na lista de colaboradores )
        Colaborador colaborador = novoColaborador();
        if (colaborador != null) {
            addColaborador(colaborador);
        }


        System.out.println("--- Listar colaboradores ativos ( que não possuem data desligamento ) ---");
        listarColaboradores();
        System.out.println("--- Listar colaboradores por Cargo ---");
        listarColaboradoresPorCargo();

// Ex 8
        desligarColaborador();
        System.out.println("--- Listar colaboradores ativos ( que não possuem data desligamento ) ---");
        listarColaboradores();
        System.out.println("--- Listar colaboradores por Cargo ---");
        listarColaboradoresPorCargo();

// Ex 9
        promoverColaborador();

        System.out.println("--- Listar colaboradores ativos ( que não possuem data desligamento ) ---");
        listarColaboradores();
        System.out.println("--- Listar colaboradores por Cargo ---");
        listarColaboradoresPorCargo();

// Ex 10
        System.out.println("--- Listar colaboradores ordenado por salário decrescente ---");
        listarColaboradoresSalarioDecrescente();


        System.out.println("_______F_I_M_______");

        /*Fim do código void main*/
    }

// Ex 10 - Listar colaboradores ordenado por salário decrescente
      public static void listarColaboradoresSalarioDecrescente(){
        ArrayList<Colaborador> ordemSalarios = (ArrayList<Colaborador>) colaboradores.clone();

          ordemSalarios.sort((c1, c2) -> Double.compare(c2.getSalarioAtual(), c1.getSalarioAtual()));

          System.out.println("Lista de colaboradores por salários em ordem decrescente:");
          ordemSalarios.forEach(System.out::println);
          }


// Ex 9 - Desenvolver um método que será responsável por promover um colaborador de Cargo
  public static void promoverColaborador(){
      JOptionPane.showMessageDialog(null, "Promover colaborador");

      Colaborador colaborador = ( Colaborador ) JOptionPane.showInputDialog(
              null,
              "Selecione o colaborador",
              "Seleção de Colaborador",
              JOptionPane.PLAIN_MESSAGE,
              null,
              colaboradores.toArray(),
              colaboradores.get(0)
      );

      Cargo cargo = ( Cargo ) JOptionPane.showInputDialog(
              null,
              "Selecione um cargo",
              "Seleção de Cargo",
              JOptionPane.PLAIN_MESSAGE,
              null,
              cargos.toArray(),
              cargos.get(0)
      );

      colaborador.setCargo(cargo);
      colaborador.setSalarioAtual(cargo.getSalarioBase());
  }


// Ex 8 - Desenvolver um método que será responsável por desligar um colaborador ( alterar o objeto incluindo uma data de desligamento )
    public static void desligarColaborador(){
        JOptionPane.showMessageDialog(null, "Desligar colaborador");

        Colaborador colaborador = ( Colaborador ) JOptionPane.showInputDialog(
                null,
                "Selecione o colaborador",
                "Seleção de Colaborador",
                JOptionPane.PLAIN_MESSAGE,
                null,
                colaboradores.toArray(),
                colaboradores.get(0)
        );
        String diaString = JOptionPane.showInputDialog("Digite o dia:");
        int dia = Integer.parseInt(diaString);
        String mesString = JOptionPane.showInputDialog("Digite o mês:");
        int mes = Integer.parseInt(mesString);
        String anoString = JOptionPane.showInputDialog("Digite o ano:");
        int ano = Integer.parseInt(anoString);

        colaborador.setDtDesligamento(new Data(dia, mes, ano));

    }

// Ex 7 - Desenvolver um método que será responsável por admitir um colaborador ( incluir na lista de colaboradores )
    public static void addColaborador(Colaborador colaborador){
        colaboradores.add(colaborador);
    }
    public static Colaborador novoColaborador(){
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do novo colaborador");

        String diaString = JOptionPane.showInputDialog("Digite o dia:");
        int dia = Integer.parseInt(diaString);
        String mesString = JOptionPane.showInputDialog("Digite o mês:");
        int mes = Integer.parseInt(mesString);
        String anoString = JOptionPane.showInputDialog("Digite o ano:");
        int ano = Integer.parseInt(anoString);

        Data dtAdmissao = new Data(dia, mes, ano);

        Cargo cargo = ( Cargo ) JOptionPane.showInputDialog(
                null,
                "Selecione um cargo",
                "Seleção de Cargo",
                JOptionPane.PLAIN_MESSAGE,
                null,
                cargos.toArray(),
                cargos.get(0)
        );
        Colaborador colaborador = new Colaborador(nome, dtAdmissao, cargo);
        return colaborador;
    }


    public static void listarColaboradores(){
        for (Colaborador idC : colaboradores) {
            if (idC.getDtDesligamento() == null) {
                System.out.println(idC);
            }
        }
    }

    public static void listarColaboradoresPorCargo() {
        for (Cargo idCargo : cargos) {
            System.out.println("Lista de colaboradores por Cargo - " + idCargo.getDescricao());
            for (Colaborador colaborador : colaboradores) {
                if (colaborador.getCargo() == idCargo) {
                    System.out.println(colaborador);
                }
            }
        }
    }
    /*Fim do código*/
}