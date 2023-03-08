package fr.solutec.websocket;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class HelloMessage {

	@Id @GeneratedValue
	private Long id;
	private String sender;
	private String receiver;
	private String timestamp;
	private String content;

    public HelloMessage(String sender) {
        this.sender = sender;
    }

    public String getName() {
        return sender;
    }

    public void setName(String name) {
        this.sender = name;
    }
    
}
