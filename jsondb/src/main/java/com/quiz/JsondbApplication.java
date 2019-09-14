package com.quiz;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quiz.model.Data;
import com.quiz.service.QuizService;


@SpringBootApplication
@ComponentScan
//@EntityScan("com.quiz.model")
public class JsondbApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsondbApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(QuizService quizService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			TypeReference<List<Data>> typeReference = new TypeReference<List<Data>>(){};
			//System.out.println(typeReference.toString());
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/quiz.json");
			//String json="{\"quiz\":{\"sport\":{\"q1\":{\"question\":\"Which one is correct team name in NBA?\",\"options\":[\"New York Bulls\",\"Los Angeles Kings\",\"Golden State Warriros\",\"Huston Rocket\"],\"answer\":\"Huston Rocket\"}},\"maths\":{\"q1\":{\"question\":\"5 + 7 = ?\",\"options\":[\"10\",\"11\",\"12\",\"13\"],\"answer\":\"12\"},\"q2\":{\"question\":\"12 - 8 = ?\",\"options\":[\"1\",\"2\",\"3\",\"4\"],\"answer\":\"4\"}}}}";
			try {
				List<Data> quiz = mapper.readValue(inputStream,typeReference);
				//ObjectMapper objectMapper = new ObjectMapper();
				//Data data = objectMapper.readValue(json, Data.class); 
				/*if(data!=null) {
					System.out.println("Json parssed successfully");
					System.out.println(data.getQuiz().getMaths().getQ2().getQuestion());
				}else {
					System.out.println("Wrong Json");
				}*/
				quizService.save(quiz);
				System.out.println(" Saved Successfully!");
			} catch (IOException e){
				System.out.println("Unable to save: " + e.getMessage());
			}
	    };
	}

}
