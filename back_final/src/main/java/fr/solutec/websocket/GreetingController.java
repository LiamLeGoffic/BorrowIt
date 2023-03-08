package fr.solutec.websocket;

import java.security.Principal;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	@Autowired
	private HelloMessageRepository hmRepo;
	@Autowired
	private GreetingRepository gRepo;
	
/*
	@MessageMapping("/chat/{to}") //to = nome canale
	public void sendMessage(@DestinationVariable String to , HelloMessage message) {
		System.out.println("handling send message: " + message + " to: " + to);
		message.setId(createAndOrGetChat(to));
		message.setTimestamp(generateTimeStamp());
		message = hmRepo.save(message);
		messagingTemplate.convertAndSend("/topic/messages/" + to, message);
	}

	@GetMapping("/chat/{recipient}")
	public List<HelloMessage> getChatHistory(@PathVariable String recipient, Principal principal) {
		String sender = principal.getName();
		return hmRepo.findBySenderAndReceiver(sender, recipient);
	}
	
	//returns an empty list if the chat doesn't exist
    @PostMapping("/getMessages")
	public List<HelloMessage> getMessages(@RequestBody String chat) {
    	Greeting ce = gRepo.findByContent(chat);
    	
    	if(ce != null) {
    		return hmRepo.findAllByChat(ce.getId());
    	}
    	else{
    		return new ArrayList<HelloMessage>();
    	}
    }
	
	private Long createAndOrGetChat(String content) {
    	Greeting ce = gRepo.findByContent(content);
    	
    	if (ce != null) {
    		return ce.getChat_id();
    	}
    	else {
    		ChatEntity newChat = new ChatEntity(name);
    		return chatDAO.save(newChat).getChat_id();
    	}
    }
	
	private String generateTimeStamp() {
		Instant i = Instant.now();
		String date = i.toString();
		System.out.println("Source: " + i.toString());
		int endRange = date.indexOf('T');
		date = date.substring(0, endRange);
		date = date.replace('-', '/');
		System.out.println("Date extracted: " + date);
		String time = Integer.toString(i.atZone(ZoneOffset.UTC).getHour() + 1);
		time += ":";

		int minutes = i.atZone(ZoneOffset.UTC).getMinute();
		if (minutes > 9) {
			time += Integer.toString(minutes);
		} else {
			time += "0" + Integer.toString(minutes);
		}

		System.out.println("Time extracted: " + time);
		String timeStamp = date + "-" + time;
		return timeStamp;
	}
	
	*/
	
	

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		System.out.println(message);
		Thread.sleep(1000); // simulated delay
		hmRepo.save(message);
		return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getSender()) + "!");
	}

}
