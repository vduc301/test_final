package com.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptopshop.entities.HangSanXuat;
import org.springframework.stereotype.Repository;

@Repository
public interface HangSanXuatRepository extends JpaRepository<HangSanXuat, Long>{

}
