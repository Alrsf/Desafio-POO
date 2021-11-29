
import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
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


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Álan");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Dev " + dev1.getNome() + " está matriculado no bootcamp " + bootcamp.getNome());
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("Total XP: " + dev1.calcularTotalXP());

        System.out.println("------");

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Dev " + dev2.getNome() + " está matriculado no bootcamp " + bootcamp.getNome());
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Total XP: " + dev2.calcularTotalXP());
    }
}
