package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	// o private static é pra que eu não tenha uma cópia do objeto "sdf" pra cada post da minha aplicação// eu vou ter apenas uma cópia pra minha aplicação inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String tiltle;
	private String content;
	private Integer likes;
	//Aqui implementei minha assossiação// um post pode vários comentário e o nome de lista é "comments
	private List<Comment> comments = new ArrayList<>();
    //construtor vazio
	public Post() {

	}
     //construtor com argumenrto//***** a lista ñ coloca no construtor********
	public Post(Date moment, String tiltle, String content, Integer likes) {
		this.moment = moment;
		this.tiltle = tiltle;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    public Integer getLikes() {
    	return  likes;
    }
    public void setLikes(Integer likes) {
    	this.likes = likes;
    }
    public List <Comment> getComments(){
    	return comments;
    }//no caso do set pra Lista" eu não posso ter um set normal, recebendo uma outra lista, pra eu trocar minha lista
    //no lugar dele irei fazer o seguinte metodo, um public void addComment"ou seja pra add um comentário, recebendo uma cometário como argumento
    //esse método por sua vez ele vai na minha listinha de comentário que chama comments e vai chama o método add pra adcionar nessa lista o comentério
    //como argumento aqui no método
    public void addComment(Comment comment) {
    	comments.add(comment);                     // add ou remover Objetos relacionados
    }
    public void removeComment(Comment comment) {
    	comments.remove(comment);
    }
    // converter a toString para StringBuilder
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append(tiltle + "\n");
    	sb.append(likes);
    	sb.append(" likes- ");
    	sb.append(sdf.format(moment)+ "\n");
    	sb.append(content + "\n");
    	sb.append("Comments: \n");
    	for(Comment c : comments) {
    		sb.append(c.getText()+ "\n");
    	}// aqui retornando a StringBuilder para toString
    	return sb.toString();
    }
}