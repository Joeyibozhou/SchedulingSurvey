package com.SurveyScheduling.service;

import com.SurveyScheduling.dao.SurveyDAO;
import com.SurveyScheduling.entity.Survey;
import com.SurveyScheduling.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {
    @Autowired
    private SurveyRepository repository;

    public Survey saveSurvey(Survey survey) {
        String tmp_email= survey.getEmail();
        Survey oldSurvey = repository.findByEmail(tmp_email);
        if(oldSurvey!= null){
            return updateSurvey(oldSurvey);
        }
        else{
            return repository.save(survey);
        }

    }

    public List<Survey> saveSurveys(List<Survey> Surveys) {
        return repository.saveAll(Surveys);
    }

    public List<Survey> getSurveys() {
        return repository.findAll();
    }

    public Survey getSurveyById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Survey getSurveyByEmail(String email) {
        return repository.findByEmail(email);
    }

    public org.json.JSONObject getSurveysDescription(){
        SurveyDAO surveyDAO = new SurveyDAO();
        surveyDAO.init();
        return surveyDAO.toObject();
    }

/*    public Survey getSurveyByName(String Q1) {
        return repository.findByName(Q1);
    }*/


    public String deleteSurvey(int id) {
        repository.deleteById(id);
        return "Survey removed !! " + id;
    }

    public Survey updateSurvey(Survey Survey) {
        Survey existingSurvey = repository.findById(Survey.getId()).orElse(null);

        String tmp_value = Survey.getQ1();
        if (tmp_value != null){
            existingSurvey.setQ1(Survey.getQ1());
        }

        tmp_value = Survey.getQ2();
        if (tmp_value != null){
            existingSurvey.setQ2(Survey.getQ2());
        }

        tmp_value = Survey.getQ3();
        if (tmp_value != null){
            existingSurvey.setQ3(Survey.getQ3());
        }
        tmp_value = Survey.getQ31();
        if (tmp_value != null){
            existingSurvey.setQ31(Survey.getQ31());
        }
        tmp_value = Survey.getQ32();
        if (tmp_value != null){
            existingSurvey.setQ32(Survey.getQ32());
        }
        tmp_value = Survey.getQ4();
        if (tmp_value != null){
            existingSurvey.setQ4(Survey.getQ4());
        }

        tmp_value = Survey.getQ5();
        if (tmp_value != null){
            existingSurvey.setQ5(Survey.getQ5());
        }

        tmp_value = Survey.getQ6();
        if (tmp_value != null){
            existingSurvey.setQ6(Survey.getQ6());
        }

        tmp_value = Survey.getQ7();
        if (tmp_value != null){
            existingSurvey.setQ7(Survey.getQ7());
        }

        tmp_value = Survey.getQ8();
        if (tmp_value != null){
            existingSurvey.setQ8(Survey.getQ8());
        }
        tmp_value = Survey.getQ9();
        if (tmp_value != null){
            existingSurvey.setQ9(Survey.getQ9());
        }
        tmp_value = Survey.getQ10();
        if (tmp_value != null){
            existingSurvey.setQ10(Survey.getQ10());
        }
        tmp_value = Survey.getQ11();
        if (tmp_value != null){
            existingSurvey.setQ11(Survey.getQ11());
        }
/*        existingSurvey.setLocked(Survey.getLocked());
        existingSurvey.setEnabled(Survey.getEnabled());*/
        return repository.save(existingSurvey);
    }


}
