import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Economia Linear");
        curso1.setDescricao("Menos linhas é sempre melhor!");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("Documentação Espartana");
        curso2.setDescricao("Comentários são para amadores!");
        curso2.setCargaHoraria(1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Onisciência Finita");
        mentoria.setDescricao("Não precisa fazer curso. Usa o que você já sabe.");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Dev POG - Programação Orientada a Ganbiarra #1");
        bootcamp.setDescricao("Uma viagem pelo mundo da POGramação");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        System.out.println(bootcamp);
        System.out.println("===============================================================");

        Dev devRobot = new Dev();
        devRobot.setNome("Mr Robot");
        devRobot.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Mr Robot:" + devRobot.getConteudosInscritos());
        devRobot.progredir();
        devRobot.progredir();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Mr Robot:" + devRobot.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mr Robot:" + devRobot.getConteudosConcluidos());
        System.out.println("XP:" + devRobot.calcularTotalXp());

        System.out.println("===============================================================");

        Dev devChuck = new Dev();
        devChuck.setNome("Chuck Norris");
        devChuck.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Chuck Norris:" + devChuck.getConteudosInscritos());
        devChuck.progredir();
        devChuck.progredir();
        devChuck.progredir();
        System.out.println("---------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Chuck Norris:" + devChuck.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Chuck Norris:" + devChuck.getConteudosConcluidos());
        System.out.println("XP:" + devChuck.calcularTotalXp());

    }

}
