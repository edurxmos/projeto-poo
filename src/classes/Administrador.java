package classes;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Pessoa {

    private List<Evento> eventos = new ArrayList<>();

    public Administrador(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Administrador(Integer id, String nome, List<Evento> eventos) {
        super(id, nome);
        this.eventos = eventos;
    }
}
