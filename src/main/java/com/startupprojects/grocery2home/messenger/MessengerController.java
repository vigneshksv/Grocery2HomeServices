package com.startupprojects.grocery2home.messenger;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessengerController {
	
	@Autowired
	private MessengerService messengerService;
	
	@RequestMapping("/messengers")
	public List<Messenger> getAllMessengers() {
		return messengerService.getAllMessengers();
	}
	@RequestMapping("/messengers/{id}")
	public Optional<Messenger> getMessenger(@PathVariable int id) {
		return messengerService.getMessenger(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/messengers")
	public void addMessenger(@RequestBody Messenger messenger) {
		messengerService.addMessenger(messenger);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/messengers")
	public void updateMessenger(@RequestBody Messenger messenger) {
		messengerService.updateMessenger(messenger);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/messengers/{id}")
	public void deleteMessenger(@PathVariable int id) {
		messengerService.deleteMessenger(id);
	}

}
