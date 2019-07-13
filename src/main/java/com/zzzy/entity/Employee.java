package com.zzzy.entity;


public class Employee {

  private Integer eId;
  private String eName;
  private String eSex;
  private java.sql.Date eBirthday;
  private String eTelephone;
  private java.sql.Date eEntrytime;
  private Integer eEtId;
  private String ePassword;
  private Integer eStatus;


  public long getEId() {
    return eId;
  }

  public void setEId(Integer eId) {
    this.eId = eId;
  }


  public String getEName() {
    return eName;
  }

  public void setEName(String eName) {
    this.eName = eName;
  }


  public String getESex() {
    return eSex;
  }

  public void setESex(String eSex) {
    this.eSex = eSex;
  }


  public java.sql.Date getEBirthday() {
    return eBirthday;
  }

  public void setEBirthday(java.sql.Date eBirthday) {
    this.eBirthday = eBirthday;
  }


  public String getETelephone() {
    return eTelephone;
  }

  public void setETelephone(String eTelephone) {
    this.eTelephone = eTelephone;
  }


  public java.sql.Date getEEntrytime() {
    return eEntrytime;
  }

  public void setEEntrytime(java.sql.Date eEntrytime) {
    this.eEntrytime = eEntrytime;
  }


  public long getEEtId() {
    return eEtId;
  }

  public void setEEtId(Integer eEtId) {
    this.eEtId = eEtId;
  }


  public String getEPassword() {
    return ePassword;
  }

  public void setEPassword(String ePassword) {
    this.ePassword = ePassword;
  }


  public long getEStatus() {
    return eStatus;
  }

  public void setEStatus(Integer eStatus) {
    this.eStatus = eStatus;
  }

}
