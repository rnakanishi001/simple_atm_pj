package domain.entity;

public class Acount {
    private String sureName = "";
    private String name = "";
    private String pass = "";
    private String acountNumber = "";
    private double hasMoney;
    
    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }
    public void setHasMoney(double hasMoney) {
        this.hasMoney = hasMoney;
    }
    public String getSureName() {
        return sureName;
    }
    public String getName() {
        return name;
    }
    public String getPass() {
        return pass;
    }
    public String getAcountNumber() {
        return acountNumber;
    }
    public double getHasMoney() {
        return hasMoney;
    }
}
