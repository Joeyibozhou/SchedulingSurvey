package com.SurveyScheduling.repository;

import com.SurveyScheduling.entity.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey,Integer> {
    /*Survey findByName(String Q1);*/
    Survey findByEmail(String email);
}