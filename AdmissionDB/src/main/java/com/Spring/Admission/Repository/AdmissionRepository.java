package com.Spring.Admission.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Admission.Model.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, Long> {

}
