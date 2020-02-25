package com.app.config.server.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.config.server.model.Member;
import com.app.config.server.repository.ConfigRepository;
import com.app.config.server.repository.ConfigRepositoryInterface;

@Service
public class ConfigService {
	@Autowired
	private ConfigRepository configRepository;
	
	@Autowired
	private ConfigRepositoryInterface configRepo;
	
	public List<Member> getMembers(){
		List<Member> members = new ArrayList<Member>();
		Iterator<Member> itr = configRepo.findAll().iterator();
		while(itr.hasNext()){
			members.add(itr.next());
		}
		return members;
	}
}
