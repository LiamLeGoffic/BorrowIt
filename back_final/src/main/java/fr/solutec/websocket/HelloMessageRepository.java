package fr.solutec.websocket;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HelloMessageRepository extends CrudRepository<HelloMessage, Long> {
	
	List<HelloMessage> findBySenderAndReceiver(String sender, String receiver);
}
