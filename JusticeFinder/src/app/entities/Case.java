/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.entities;

import app.data.directories.interfaces.DirectoryEntry;
import app.data.org.Court;
import java.util.Date;

/**
 *
 * @author Saurabh Gujare (NUID : 001424874)
 */
public class Case implements DirectoryEntry<String>{
    private String caseName;
    private String caseNumber;
    private String caseDesc;
    private String caseDecision;
    private Boolean caseStatus;
    private String casetype;
    private Date casefileDate;
    private Court court;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getCaseDesc() {
        return caseDesc;
    }

    public void setCaseDesc(String caseDesc) {
        this.caseDesc = caseDesc;
    }

    public String getCaseDecision() {
        return caseDecision;
    }

    public void setCaseDecision(String caseDecision) {
        this.caseDecision = caseDecision;
    }

    public Boolean getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(Boolean caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCasetype() {
        return casetype;
    }

    public void setCasetype(String casetype) {
        this.casetype = casetype;
    }

    public Date getCasefileDate() {
        return casefileDate;
    }

    public void setCasefileDate(Date casefileDate) {
        this.casefileDate = casefileDate;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }
    
    @Override
    public String getKey(){
        return caseNumber;
    }
}
