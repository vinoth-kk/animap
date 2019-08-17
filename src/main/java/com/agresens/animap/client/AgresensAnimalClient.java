package com.agresens.animap.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.agresens.animap.model.Animal;

@FeignClient(name = "${animap.rest.url}", url="${animap.rest.url}", fallback = AgresensAnimalClientClientFallback.class)
public interface AgresensAnimalClient {

	@PatchMapping("/")
	public Map<String, Animal> patchAnimals(@RequestBody Map<String, Animal> animalMap);
}

