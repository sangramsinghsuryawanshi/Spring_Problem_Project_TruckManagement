package com.project.T.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.T.Model.Truck;

public interface TruckConn extends JpaRepository<Truck, Integer> {

}
