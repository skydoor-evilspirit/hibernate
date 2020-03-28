package com.duyi.domain;

import java.util.Set;

public class Man {
    private Long mid;
    private String mname;
    private Integer length;
    private Set<Wife> wifeSet;

    public Man() {
    }

    @Override
    public String toString() {
        return "Man{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", length=" + length +
                '}';
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Set<Wife> getWifeSet() {
        return wifeSet;
    }

    public void setWifeSet(Set<Wife> wifeSet) {
        this.wifeSet = wifeSet;
    }

    public Man(Long mid, String mname, Integer length) {
        this.mid = mid;
        this.mname = mname;
        this.length = length;
    }
}
