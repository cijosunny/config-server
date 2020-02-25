package com.app.config.server.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.config.server.model.Member;

@Repository
public class ConfigRepository {
	public List<Member> getMembers(){
		Member member = new Member();
		member.setId(1);
		member.setFirstName("John");
		member.setLastName("Doe");
		member.setFamily("Anchery");
		member.setParent("Paul");
		member.setSpouse("Alice");
		
		List<Member> members = new ArrayList<Member>();
		members.add(member);
		
		return members;
	}
}
