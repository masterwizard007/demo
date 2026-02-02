package com.example.demo;

//import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//As you are using Spring Boot web, Jackson dependency is implicit and we do not have to define explicitly.
//Jackson is used by default to serialize and to deserialize objects.
//However, it doesn't know how to serialize the JSONObject. If you want to create a dynamic JSON structure, you can use a Map
@RestController
public class NewsController {
 @Autowired
	private NewsService nService;
@GetMapping(value = "/api/news/topstories")
	public  NewsWrapper getNews() {
           
            System.out.println(nService.getTopStories()); //for console
        
                return nService.getTopStories();
	}

}
