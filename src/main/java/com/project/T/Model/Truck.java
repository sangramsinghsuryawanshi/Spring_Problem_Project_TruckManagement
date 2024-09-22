package com.project.T.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Truck {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String driverName;
	private long capacity;
	private long loadCapacity;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public long getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(long loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Truck [id=" + id + ", driverName=" + driverName + ", capacity=" + capacity + ", loadCapacity="
				+ loadCapacity + ", location=" + location + "]";
	}
	public Truck(int id, String driverName, long capacity, long loadCapacity, String location) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.capacity = capacity;
		this.loadCapacity = loadCapacity;
		this.location = location;
	}
	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
