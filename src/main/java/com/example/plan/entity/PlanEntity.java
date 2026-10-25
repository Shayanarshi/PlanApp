package com.example.plan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PLAN_DETAILS")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PlanEntity {

    @Id
    @Column(name = "id")
    private  String planId;


    private String description;

    private String validity;

}
