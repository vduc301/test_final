package com.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopshop.entities.VaiTro;
import org.springframework.stereotype.Repository;

@Repository
public interface VaiTroRepository extends JpaRepository<VaiTro, Long> {

	VaiTro findByTenVaiTro(String tenVaiTro);
}
