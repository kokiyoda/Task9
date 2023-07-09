package com.koki.task9.entity;

import lombok.Getter;

public class Pokemon {
    @Getter
    private int id;
    @Getter
    private int pokedexNo;
    @Getter
    private String name;
    @Getter
    private String nickname;

    public Pokemon(int id, int pokedexNo, String name, String nickname) {
        this.id = id;
        this.pokedexNo = pokedexNo;
        this.name = name;
        this.nickname = nickname;
    }
}
