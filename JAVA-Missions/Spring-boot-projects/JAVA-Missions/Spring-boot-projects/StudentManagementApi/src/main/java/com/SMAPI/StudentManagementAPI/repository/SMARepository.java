package com.SMAPI.StudentManagementAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SMAPI.StudentManagementAPI.model.SMAModel;

@Repository
public interface SMARepository extends JpaRepository<SMAModel, Long> {
    SMAModel findStudentById(Long id);
}
