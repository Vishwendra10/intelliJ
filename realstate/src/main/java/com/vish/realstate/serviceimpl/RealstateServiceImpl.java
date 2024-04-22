package com.vish.realstate.serviceimpl;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.vish.realstate.dao.RealstateDao;
import com.vish.realstate.model.Realstate;
import com.vish.realstate.service.RealstateService;

@Service
public class RealstateServiceImpl implements RealstateService{
	
	@Autowired
	private RealstateDao realstatedao;

	@Override
	public List<Realstate> getAllDetails() {
		List<Realstate> list1= this.realstatedao.findAll();
		return list1;
	}

	@Override
	public Realstate putDetails(Realstate data) {
		Realstate updateddata= this.realstatedao.save(data);
		return updateddata;
	}

	@Override
	public Realstate patchDetails(int id, Map<String, Object> data) {
		// TODO Auto-generated method stub
		Optional <Realstate> db= this.realstatedao.findById(id);
		
		if(db.isPresent()) {
		data.forEach((k,v)->{
			Field field = ReflectionUtils.findField(Realstate.class, k);
			field.setAccessible(true);
			ReflectionUtils.setField(field, db.get() , v);
			
		});
		return this.realstatedao.save(db.get());
	}
		return null;
	}

}
