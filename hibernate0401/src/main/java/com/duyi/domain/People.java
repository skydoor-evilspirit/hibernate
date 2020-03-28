package com.duyi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@NoArgsConstructor
public class People implements Serializable {
    private Long pid;
    private String name;
    private Integer age;

    private Card card;

    public People(Long pid, String name, Integer age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

}
