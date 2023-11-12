package com.zohocrmapp.Service;

import java.util.List;

import com.zohocrmapp.entity.Contact;

public interface ContactService {
public void saveContact(Contact Contact);

public List<Contact> getAllContacts();

public Contact getContactById(long id);
}
