package enumeracoescomposicoes.exercicioresolvido2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post { //Postar

    //Para n�o ter uma c�pia do objeto a cada momento da aplica��o
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment; //Momento
    private String title; //Titulo
    private String content; //Cont�m
    private Integer likes; //Gosteis (curtidas)
    private List<Comment> comments = new ArrayList<>(); //Lista de coment�rios

    public Post() {

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() { // O objeto sb permite concatenar outras strings usando a fun��o append (Acrescentar no final
        StringBuilder sb = new StringBuilder(); //Utilizada ao ter que montar uma String muito grande, a partir de String pequenos
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for (Comment comment : comments) { //Para cada coment�rio na minha lista de coment�rios
            sb.append(comment.getText() + "\n");
        }
        return sb.toString();


    }
}
