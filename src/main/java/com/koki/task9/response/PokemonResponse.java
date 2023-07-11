package com.koki.task9.response;

import com.koki.task9.entity.Pokemon;
import lombok.Getter;

@Getter
public class PokemonResponse {

    private int id;

    private int pokedexNo;

    private String name;

    private String nickname;

    public PokemonResponse(Pokemon pokemon) {
        this.id = pokemon.getId();
        this.pokedexNo = pokemon.getPokedexNo();
        this.name = pokemon.getName();
        this.nickname = pokemon.getNickname();
    }

}
