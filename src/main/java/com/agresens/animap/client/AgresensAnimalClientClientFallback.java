package com.agresens.animap.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.agresens.animap.model.Animal;

@Component
public class AgresensAnimalClientClientFallback implements AgresensAnimalClient {
	 private static final Logger logger = LoggerFactory.getLogger(AgresensAnimalClientClientFallback.class);
	 
	@Override
	public Map<String, Animal> patchAnimals(Map<String, Animal> animalMap) {
		logger.error("Not able to reach Agresens test cleint");
		return new HashMap<String, Animal>(0);
	}

}