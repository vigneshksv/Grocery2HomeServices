package com.startupprojects.grocery2home.messenger;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessengerService {
	
		@Autowired
		private MessengerRepository messengerRepository;

		public List<Messenger> getAllMessengers() {
			List<Messenger> messengers = new ArrayList<>();
			messengerRepository.findAll().forEach(messengers::add);
			return messengers;
		}
		
		public Optional<Messenger> getMessenger(int id) {
			return messengerRepository.findById(id);
			
		}
		public void addMessenger(Messenger messenger) {
			messengerRepository.save(messenger);
		}
		public void updateMessenger(Messenger messenger) {
			messengerRepository.save(messenger);
		}
		public void deleteMessenger(int id) {
			messengerRepository.deleteById(id);
		}

}
