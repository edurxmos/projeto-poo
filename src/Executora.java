import dados.Dados;
import dados.IDados;
import dados.Impressora;

public class Executora {
    public static void main(String[] args) {


        IDados dados = new Dados();
        Impressora impressora = new Impressora();

        impressora.imprimir(dados.cadEventos());

    }
}