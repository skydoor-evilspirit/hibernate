package com.duyi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter@Setter@NoArgsConstructor
public class Teacher {
    private Long tno;
    private String tname;
    private Integer tsalary;

    private Set<Student> ss;

    public Teacher(Long tno, String tname, Integer tsalary) {
        this.tno = tno;
        this.tname = tname;
        this.tsalary = tsalary;
    }
}
