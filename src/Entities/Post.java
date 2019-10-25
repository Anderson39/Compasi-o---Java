package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	// o private static � pra que eu n�o tenha uma c�pia do objeto "sdf" pra cada post da minha aplica��o// eu vou ter apenas uma c�pia pra minha aplica��o inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String tiltle;
	private String content;
	private Integer likes;
	//Aqui implementei minha assossia��o// um post pode v�rios coment�rio e o nome de lista � "comments
	private List<Comment> comments = new ArrayList<>();
    //construtor vazio
	public Post() {

	}
     //construtor com argumenrto//***** a lista � coloca no construtor********
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
    }//no caso do set pra Lista" eu n�o posso ter um set normal, recebendo uma outra lista, pra eu trocar minha lista
    //no lugar dele irei fazer o seguinte metodo, um public void addComment"ou seja pra add um coment�rio, recebendo uma comet�rio como argumento
    //esse m�todo por sua vez ele vai na minha listinha de coment�rio que chama comments e vai chama o m�todo add pra adcionar nessa lista o coment�rio
    //como argumento aqui no m�todo
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