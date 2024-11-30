package dados;

import classes.Evento;
import classes.Pessoa;

import java.util.List;

public interface IDados {

    public List<Evento> cadEventos();

    public List<Pessoa[]> cadPessoas();

}
