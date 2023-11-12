package com.zohocrmapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.Repository.LeadRepository;
import com.zohocrmapp.entity.Lead;

@Service
public class LeadServiceimpl implements LeadService {

	@Autowired
	private LeadRepository leadrepo;

	@Override
	public void saveOneLead(Lead lead) {
		leadrepo.save(lead);
		
		
	}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteById(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
