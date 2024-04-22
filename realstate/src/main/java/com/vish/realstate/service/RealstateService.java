package com.vish.realstate.service;

import java.util.List;
import java.util.Map;

import com.vish.realstate.model.Realstate;

public interface RealstateService {
	
	public List<Realstate> getAllDetails();
	public Realstate putDetails(Realstate data);
	public Realstate patchDetails(int id, Map<String, Object> data);

}
