package bitcamp.java89.ems2.domain;

public class Student extends Member {
  private static final long serialVersionUID = 1L;
  
  protected boolean working;
  protected String lastSchool;
  protected String schoolName;
  protected String postNo;
  protected String basicAddress;
  protected String datailAddress;
  
  public boolean isWorking() {
    return working;
  }
  public void setWorking(boolean working) {
    this.working = working;
  }
  public String getLastSchool() {
    return lastSchool;
  }
  public void setLastSchool(String lastSchool) {
    this.lastSchool = lastSchool;
  }
  public String getSchoolName() {
    return schoolName;
  }
  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }
  public String getPostNo() {
    return postNo;
  }
  public void setPostNo(String postNo) {
    this.postNo = postNo;
  }
  public String getBasicAddress() {
    return basicAddress;
  }
  public void setBasicAddress(String basicAddress) {
    this.basicAddress = basicAddress;
  }
  public String getDatailAddress() {
    return datailAddress;
  }
  public void setDatailAddress(String datailAddress) {
    this.datailAddress = datailAddress;
  }
  
  
}
