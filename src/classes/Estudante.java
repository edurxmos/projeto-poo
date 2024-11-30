package classes;

public class Estudante extends Pessoa {

    private Integer matricula;
    private Evento evento;

    public Estudante(Integer id, String nome, Integer matricula, Evento evento) {
        super(id, nome);
        this.matricula = matricula;
        this.evento = evento;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "matricula=" + matricula +
                ", evento=" + evento +
                '}';
    }
}
