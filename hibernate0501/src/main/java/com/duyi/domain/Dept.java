package com.duyi.domain;

import java.util.Set;

public class Dept {

    private Integer dno;
    private String dname;

    private Set<Emp> emps;

    public Dept(Integer dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public Dept() {
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }
}
