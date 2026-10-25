package com.example.plan.service;

import com.example.plan.entity.PlanEntity;
import com.example.plan.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanService {

    @Autowired
    PlanRepository planRepo;

    public List<PlanEntity> fetchAll(){
        return  planRepo.findAll();
    }

    public PlanEntity fetchById(String planId) {
        Optional<PlanEntity> opt = planRepo.findById(planId);

        if (opt.isPresent())
            return opt.get();
        return  null;
    }
}
