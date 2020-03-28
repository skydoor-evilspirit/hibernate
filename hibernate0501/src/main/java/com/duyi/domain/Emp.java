package com.duyi.domain;

public class Emp {
    private Integer eno;
    private String ename;

    private Dept dept;

    public Emp() {
    }

    public Integer getEno() {
        return eno;
    }

    public void setEno(Integer eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Emp(Integer eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }
}
