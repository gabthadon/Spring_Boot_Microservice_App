package com.gibito.department_service.repository;

import com.gibito.department_service.model.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE department SET name=?1, address=?2, code=?3 WHERE id=?4 ", nativeQuery = true)
    void updateById( String name, String address, String code, Long id);
}
