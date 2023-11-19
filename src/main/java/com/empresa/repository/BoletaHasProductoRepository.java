package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entidades.BoletaHasProducto;

public interface BoletaHasProductoRepository extends JpaRepository<BoletaHasProducto, Integer> {

	
	
}
