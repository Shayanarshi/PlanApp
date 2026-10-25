package com.example.plan.repository;

import com.example.plan.entity.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepository extends JpaRepository<PlanEntity , String> {

}
