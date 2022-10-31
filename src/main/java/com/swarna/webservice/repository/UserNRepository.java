package com.swarna.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swarna.webservice.model.UserN;

@Repository
public interface UserNRepository extends JpaRepository<UserN,Long> {

}
