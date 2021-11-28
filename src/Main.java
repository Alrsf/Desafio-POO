import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
            curso1.setTitulo("Java");
            curso1.setDescricao("curso básico de Java");
            curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
            curso2.setTitulo("JavaScript");
            curso2.setDescricao("curso básico de JavaScript");
            curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Java e JavaScript");
            mentoria.setDescricao("mentoria sobre Java e JavaScript");
            mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
