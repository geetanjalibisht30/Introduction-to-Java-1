package com.TTN.relationship.repository;

import com.TTN.relationship.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Author,Integer> {



}
