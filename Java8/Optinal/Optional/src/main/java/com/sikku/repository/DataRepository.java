package com.sikku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sikku.OptionalData;

public interface DataRepository extends JpaRepository<OptionalData, Integer> {

}
