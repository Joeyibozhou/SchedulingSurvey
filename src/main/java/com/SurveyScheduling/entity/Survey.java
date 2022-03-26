package com.SurveyScheduling.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SURVEY_TBL")
@Entity
public class Survey {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String Q1;
    private String Q2;
    private String Q3;
    private String Q31;
    private String Q32;
    private String Q4;
    private String Q5;
    private String Q6;
    private String Q7;
    private String Q8;
    private String Q9;
    private String Q10;
    private String Q11;

}
