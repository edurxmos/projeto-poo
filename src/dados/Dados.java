package dados;

import classes.Administrador;
import classes.Estudante;
import classes.Evento;
import classes.Pessoa;
import enums.Tipo;

import java.util.ArrayList;
import java.util.List;

public class Dados implements IDados {

    private List<Pessoa[]> pessoas = null;
    private List<Evento> eventos = null;

    @Override
    public List<Evento> cadEventos() {

        List<Evento> eventos = new ArrayList<>();
        Pessoa[] pessoas1 = cadPessoas().get(0);
        Pessoa[] pessoas2 = cadPessoas().get(1);
        Pessoa[] admins = cadPessoas().get(2);

        eventos.add(new Evento("Cursinho POO", (Administrador) admins[0], (Estudante[]) pessoas1, Tipo.MINICURSO));
        eventos.add(new Evento("Hackathon", (Administrador) admins[1], (Estudante[]) pessoas2, Tipo.COMPETICAO));

        return eventos;
    }

    @Override
    public List<Pessoa[]> cadPessoas() {

        List<Pessoa[]> list = new ArrayList<>();

        Pessoa[] estudantes1 = new Estudante[10];
        estudantes1[0] = new Estudante(1, "Eduardo", 423, cadEventos().get(0));
        estudantes1[1] = new Estudante(2, "Adrian", 865, cadEventos().get(0));
        estudantes1[2] = new Estudante(3, "Celso", 164, cadEventos().get(0));
        estudantes1[3] = new Estudante(4, "Daniel", 976, cadEventos().get(0));
        estudantes1[4] = new Estudante(5, "Pedro", 342, cadEventos().get(0));
        estudantes1[5] = new Estudante(6, "Clara", 609, cadEventos().get(0));
        estudantes1[6] = new Estudante(7, "Osvaldo", 152, cadEventos().get(0));
        estudantes1[7] = new Estudante(8, "Zeca", 123, cadEventos().get(0));

        Pessoa[] estudantes2 = new Estudante[10];
        estudantes2[0] = new Estudante(9, "Antonio", 654, cadEventos().get(1));
        estudantes2[1] = new Estudante(10, "Maria", 478, cadEventos().get(1));
        estudantes2[2] = new Estudante(11, "Jose", 903, cadEventos().get(1));
        estudantes2[3] = new Estudante(12, "Amanda", 412, cadEventos().get(1));
        estudantes2[4] = new Estudante(13, "Isadora", 579, cadEventos().get(1));
        estudantes2[5] = new Estudante(14, "Lucas", 871, cadEventos().get(1));
        estudantes2[6] = new Estudante(15, "Gabriela", 157, cadEventos().get(1));
        estudantes2[7] = new Estudante(16, "Marcos", 889, cadEventos().get(1));

        Pessoa[] admins = new Administrador[10];
        admins[0] = new Administrador(1, "Fernando", cadEventos());
        admins[1] = new Administrador(2, "Osvaldo", cadEventos());

        list.add(estudantes1);
        list.add(estudantes2);
        list.add(admins);

        return list;

    }
}
