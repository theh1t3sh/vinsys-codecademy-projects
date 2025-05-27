// package com.SMAPI.StudentManagementAPI.repository;

// public interface SMARepository {

// }

package com.SMAPI.StudentManagementAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SMAPI.StudentManagementAPI.model.SMAModel;

@Repository
public interface SMARepository extends JpaRepository<SMAModel, Long> {
    // Custom query methods can be added here if needed
}
