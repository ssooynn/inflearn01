package com.inflearn01.inflearn01.domain;

public class Member {

    private Long id; // 임의의 값
    private String name; // 이름

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
