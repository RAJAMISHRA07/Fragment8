package com.example.admin.fragment8;

/**
 * Created by Admin on 12/20/2016.
 */
public class Employee {
    private String eno,ename,esal;

    public Employee(String eno, String ename, String esal) {
        this.eno = eno;
        this.ename = ename;
        this.esal = esal;
    }

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsal() {
        return esal;
    }

    public void setEsal(String esal) {
        this.esal = esal;
    }
}

