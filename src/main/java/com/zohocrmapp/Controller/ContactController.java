package com.zohocrmapp.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrmapp.Service.ContactService;
import com.zohocrmapp.entity.Contact;
import com.zohocrmapp.entity.Lead;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}

	@RequestMapping("/listallcontacts")
	public String listAllLead(ModelMap model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list1_contacts";
		
	}
}

