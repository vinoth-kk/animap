package com.agresens.animap.model;

import javax.validation.constraints.NotNull;

public class Location {
	@NotNull
	private Double lat;

	@NotNull
	private Double lng;

	public Location() {
		super();
	}

	public Location(Double lat, Double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLng() {
		return lng;
	}

	public void setLng(Double lng) {
		this.lng = lng;
	}

}
