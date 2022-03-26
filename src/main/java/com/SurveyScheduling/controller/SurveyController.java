package com.SurveyScheduling.controller;

import com.SurveyScheduling.entity.Survey;
import com.SurveyScheduling.service.SurveyService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey")
public class SurveyController {

    @Autowired
    private SurveyService service;

    @PostMapping("/new")
    public Survey newSurvey(@RequestBody Survey survey) {
        return service.saveSurvey(survey);
    }

    @PostMapping("/echo")
    public Survey echoSurvey(@RequestBody Survey survey) {
        return survey;
    }

    @PostMapping("/loadSurveys")
    public List<Survey> addSurveys(@RequestBody List<Survey> Surveys) {
        return service.saveSurveys(Surveys);
    }

    @GetMapping("/getSurveys")
    public List<Survey> findAllSurveys() {
        return service.getSurveys();
    }

    @GetMapping("/getSurveyById/{id}")
    public Survey findSurveyById(@PathVariable int id) {
        return service.getSurveyById(id);
    }

    @GetMapping("/getSurveyByEmail/{email}")
    public Survey findSurveyByEmail(@PathVariable String email) {
        return service.getSurveyByEmail(email);
    }

    @GetMapping("/getSurveyDescription")
    public String getSurveyDescription() throws JSONException {
        return service.getSurveysDescription().toString(1);
    }

/*  @GetMapping("/Survey/{name}")
    public Survey findSurveyByName(@PathVariable String Q1) {
        return service.getSurveyByName(Q1);
    }*/

    @PutMapping("/update")
    public Survey updateSurvey(@RequestBody Survey survey) {
        return service.updateSurvey(survey);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSurvey(@PathVariable int id) {
        return service.deleteSurvey(id);
    }

}