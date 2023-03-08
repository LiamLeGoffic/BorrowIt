package fr.solutec.websocket;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Greeting {
	
	@Id
	private Long id;
	private String content;


    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
    
}
