package com.zohocrmapp.Service;

import com.zohocrmapp.entity.Lead;

import java.util.List;

public interface LeadService {
	public void saveOneLead(Lead lead);
	public Lead findLeadById(long id);
	public void deleteById(long id);
	public List<Lead> getAllLeads();
   

}
