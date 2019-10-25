package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Programa{
	
	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip! ");
		Comment c2 = new Comment("How that´s awesome");
		//dessa forma eu faço a intanciação do meu post
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country", 12);
		//depois do meu post instanciado irei add os meus dois comentários
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}
}


	
