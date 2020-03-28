package com.duyi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter@Setter@NoArgsConstructor
public class Student {

    private Long sno;
    private String sname;
    private Set<Teacher> ts;

    public Student(Long sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }
}
