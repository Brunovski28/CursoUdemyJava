package exercicios._03avancado._02PostComComentarios;

import exercicios._03avancado._02PostComComentarios.entities.Comment;
import exercicios._03avancado._02PostComComentarios.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para nova zelândia", "Eu estou indo visitar esse maravilhoso país", 12);

        Comment comment1Post1 = new Comment("Tenha uma boa viagem");
        Comment comment2Post1 = new Comment("Uau, isso é incrível");

        post1.addComment(comment1Post1);
        post1.addComment(comment2Post1);

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite pessoal", "Vejo você amanhã", 5);

        Comment comment1Post2 = new Comment("Boa noite");
        Comment comment2Post2 = new Comment("que a força esteja com você");

        post2.addComment(comment1Post2);
        post2.addComment(comment2Post2);


        System.out.println(post1.toString());
        System.out.println("Comments: ");
        post1.printComments();

        System.out.println();
        System.out.println(post2.toString());
        System.out.println("Comments: ");
        post2.printComments();

    }

}
