package com.dkey.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="v$fines")
public class Fine {
    @Id
    @Column(name="ID")
    private String id;
    @Column(name = "S_PROTOKOL")
    private String sProtokol;
    @Column(name = "N_PROTOKOL")
    private String nProtokol;
    @Column(name = "DEP")
    private String dep;
    @Column(name = "D_REG")
    private String dReg;
    @Column(name = "N_REG")
    private String nReg;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "FAIL_ADDRESS")
    private String failAddress;
    @Column(name = "D_FAIL")
    private String dFail;
    @Column(name = "KP_KUPAP_NAME")
    private String kupapName;
    @Column(name = "INTRUDER_NAME")
    private String intruderName;
    @Column(name = "ROAD_NAME")
    private String roadName;
    @Column(name = "ROAD_KM")
    private String roadKm;
    @Column(name = "ROAD_M")
    private String roadM;
    @Column(name = "S_DOC")
    private String sDoc;
    @Column(name = "N_DOC")
    private String nDoc;
    @Column(name = "IS_PAID")
    private String isPaid;
    @Column(name = "D_PAY_TERM")
    private String dTerm;
    @Column(name = "PENALTY")
    private String penalty;
    @Column(name = "INN")
    private String inn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsProtokol() {
        return sProtokol;
    }

    public void setsProtokol(String sProtokol) {
        this.sProtokol = sProtokol;
    }

    public String getnProtokol() {
        return nProtokol;
    }

    public void setnProtokol(String nProtokol) {
        this.nProtokol = nProtokol;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getdReg() {
        return dReg;
    }

    public void setdReg(String dReg) {
        this.dReg = dReg;
    }

    public String getnReg() {
        return nReg;
    }

    public void setnReg(String nReg) {
        this.nReg = nReg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFailAddress() {
        return failAddress;
    }

    public void setFailAddress(String failAddress) {
        this.failAddress = failAddress;
    }

    public String getdFail() {
        return dFail;
    }

    public void setdFail(String dFail) {
        this.dFail = dFail;
    }

    public String getKupapName() {
        return kupapName;
    }

    public void setKupapName(String kupapName) {
        this.kupapName = kupapName;
    }


    public String getIntruderName() {
        return intruderName;
    }

    public void setIntruderName(String intruderName) {
        this.intruderName = intruderName;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getRoadKm() {
        return roadKm;
    }

    public void setRoadKm(String roadKm) {
        this.roadKm = roadKm;
    }

    public String getRoadM() {
        return roadM;
    }

    public void setRoadM(String roadM) {
        this.roadM = roadM;
    }

    public String getsDoc() {
        return sDoc;
    }

    public void setsDoc(String sDoc) {
        this.sDoc = sDoc;
    }

    public String getnDoc() {
        return nDoc;
    }

    public void setnDoc(String nDoc) {
        this.nDoc = nDoc;
    }

    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid;
    }

    public String getdTerm() {
        return dTerm;
    }

    public void setdTerm(String dTerm) {
        this.dTerm = dTerm;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }
}
