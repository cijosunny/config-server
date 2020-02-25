package com.app.config.server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.config.server.model.Member;

@Repository
public interface ConfigRepositoryInterface extends CrudRepository<Member, Integer>{

}
