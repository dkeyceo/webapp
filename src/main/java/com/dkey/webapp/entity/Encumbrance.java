package com.dkey.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="v$encumbraces")
public class Encumbrance {

    @Id
    @Column(name="doc_id")
    private String docId;
    @Column(name="inn")
    private String inn;
    @Column(name="OWNER_NAME")
    private String ownerName;
    @Column(name="brand")
    private String brand;
    @Column(name="MODEL_NAME")
    private String modelName;
    @Column(name="n_reg")
    private String nReg;
    @Column(name="doc_num")
    private String docNum;
    @Column(name="doc_date")
    private String docDate;
    @Column(name="HOLD_TYPE_NAME")
    private String holdTypeName;
    @Column(name="HOLD_NAME")
    private String holdName;
    @Column(name="CDATE")
    private String cDate;
    @Column(name="NOTE_HOLD")
    private String noteHold;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getnReg() {
        return nReg;
    }

    public void setnReg(String nReg) {
        this.nReg = nReg;
    }

    public String getDocNum() {
        return docNum;
    }

    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getHoldTypeName() {
        return holdTypeName;
    }

    public void setHoldTypeName(String holdTypeName) {
        this.holdTypeName = holdTypeName;
    }

    public String getHoldName() {
        return holdName;
    }

    public void setHoldName(String holdName) {
        this.holdName = holdName;
    }

    public String getcDate() {
        return cDate;
    }

    public void setcDate(String cDate) {
        this.cDate = cDate;
    }

    public String getNoteHold() {
        return noteHold;
    }

    public void setNoteHold(String noteHold) {
        this.noteHold = noteHold;
    }
}
