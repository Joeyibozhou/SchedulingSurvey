package com.SurveyScheduling.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SURVEY_TBL")
@Entity
public class SurveyDAO {
    @Id
    @GeneratedValue
    private int id;
    private String email="email";
    private String Q1;
    private String Q2="q2";
    private String Q3="q3";
    private String Q31="q31";
    private String Q32="q32";
    private String Q4="q4";
    private String Q5="q5";
    private String Q6="q6";
    private String Q7="q7";
    private String Q8="q8";
    private String Q9="q9";
    private String Q10="q10";
    private String Q11="q11";
    public HashMap< String, String> columnDescriptions;


    public org.json.JSONObject toObject (){
        org.json.JSONObject jsonObject = new org.json.JSONObject(columnDescriptions);

        return jsonObject;
    }

    public void init() {
        columnDescriptions= new HashMap<>();
        columnDescriptions.put(email,"Email Address");
        columnDescriptions.put(Q1,"Name");
        columnDescriptions.put(Q2,"Special Notes");
        columnDescriptions.put(Q3,"Expected University-level committee meetings");
        columnDescriptions.put(Q31,"Expected University-level committee meetings");
        columnDescriptions.put(Q32,"Expected University-level committee meetings");
        columnDescriptions.put(Q4,"Four-credit courses: do you like or dislike meeting four days in a row?");
        columnDescriptions.put(Q5,"Two sections of same course: how strongly do you want them on the same days of the week?");
        columnDescriptions.put(Q6,"Your available point");
        columnDescriptions.put(Q7,"Penalty for back-to-back classes");
        columnDescriptions.put(Q8,"Reward for back-to-back classes");
        columnDescriptions.put(Q8,"prefer to have an open day");
        columnDescriptions.put(Q10,"What are the acceptable days?");
        columnDescriptions.put(Q11,"I prefer not to teach during the following times.");
    }

}
