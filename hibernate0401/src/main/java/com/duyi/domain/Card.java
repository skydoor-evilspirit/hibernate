package com.duyi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data@NoArgsConstructor@AllArgsConstructor
public class Card implements Serializable {
    private Long cid;
    private String address;
    private String roleNum;

    private People people;

    public Card(Long cid, String address, String roleNum) {
        this.cid = cid;
        this.address = address;
        this.roleNum = roleNum;
    }
}
