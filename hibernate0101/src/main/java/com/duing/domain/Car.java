package com.duing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@NoArgsConstructor@AllArgsConstructor
public class Car implements Serializable {
    private long id;
    private String name;
    private String color;
}
