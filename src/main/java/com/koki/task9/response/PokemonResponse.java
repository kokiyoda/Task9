package com.koki.task9.response;

import com.koki.task9.entity.Pokemon;
import lombok.Getter;

public class PokemonResponse {
    @Getter
    private int pokedexNo;
    @Getter
    private String name;
    @Getter
    private String nickname;

    public PokemonResponse(Pokemon pokemon) {
        this.pokedexNo = pokemon.getPokedexNo();
        this.name = pokemon.getName();
        this.nickname = pokemon.getNickname();
    }

}
