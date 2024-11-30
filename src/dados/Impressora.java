package dados;

import classes.Evento;

import java.util.List;

public class Impressora {

    public void imprimir(List<Evento> eventos) {

        for(Evento evento : eventos) {
            System.out.println(evento);
        }

    }

}
