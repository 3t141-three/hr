package com.szxs.entity;


import java.sql.Timestamp;

public class Cultivate {

  private Integer id;
  private String cultivateName;
  private String cultivateTeacher;
  private Timestamp beginTime;
  private Timestamp finish;
  private String purpose;
  private String participant;
  private String introduce;
  private String means;
  private String cultivateExamine;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCultivateName() {
    return cultivateName;
  }

  public void setCultivateName(String cultivateName) {
    this.cultivateName = cultivateName;
  }

  public String getCultivateTeacher() {
    return cultivateTeacher;
  }

  public void setCultivateTeacher(String cultivateTeacher) {
    this.cultivateTeacher = cultivateTeacher;
  }

  public Timestamp getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Timestamp beginTime) {
    this.beginTime = beginTime;
  }

  public Timestamp getFinish() {
    return finish;
  }

  public void setFinish(Timestamp finish) {
    this.finish = finish;
  }

  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public String getParticipant() {
    return participant;
  }

  public void setParticipant(String participant) {
    this.participant = participant;
  }

  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }

  public String getMeans() {
    return means;
  }

  public void setMeans(String means) {
    this.means = means;
  }

  public String getCultivateExamine() {
    return cultivateExamine;
  }

  public void setCultivateExamine(String cultivateExamine) {
    this.cultivateExamine = cultivateExamine;
  }
}
