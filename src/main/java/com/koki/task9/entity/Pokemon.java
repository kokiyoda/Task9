package com.koki.task9.entity;

import lombok.Getter;

@Getter
public class Pokemon {

    private int id;

    private int pokedexNo;

    private String name;

    private String nickname;

    public Pokemon(int id, int pokedexNo, String name, String nickname) {
        this.id = id;
        this.pokedexNo = pokedexNo;
        this.name = name;
        this.nickname = nickname;
    }
}
