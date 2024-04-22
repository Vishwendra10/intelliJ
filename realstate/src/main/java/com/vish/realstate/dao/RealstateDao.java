package com.vish.realstate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vish.realstate.model.Realstate;


public interface RealstateDao extends JpaRepository<Realstate, Integer>{

}
