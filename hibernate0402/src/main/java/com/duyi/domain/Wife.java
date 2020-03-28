package com.duyi.domain;

public class Wife {
    private Long wid;
    private String wname;
    private Integer wage;
    private Long mid;

    private Man man;

    @Override
    public String toString() {
        return "Wife{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                ", wage=" + wage +
                ", mid=" + mid +
                '}';
    }

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Integer getWage() {
        return wage;
    }

    public void setWage(Integer wage) {
        this.wage = wage;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Wife(Long wid, String wname, Integer wage, Long mid) {
        this.wid = wid;
        this.wname = wname;
        this.wage = wage;
        this.mid = mid;
    }

    public Wife() {
    }
}
