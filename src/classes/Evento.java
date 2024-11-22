package classes;

import enums.Tipo;

public class Evento {

    private String nome;
    private Tipo tipo;
    private Estudante[] estudantes = new Estudante[10];
    private Administrador administrador;

    public Evento(String nome, Administrador administrador, Estudante[] estudantes, Tipo tipo) {
        this.nome = nome;
        this.administrador = administrador;
        this.estudantes = estudantes;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
