package com.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopshop.entities.ChiTietDonHang;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long>{
}
