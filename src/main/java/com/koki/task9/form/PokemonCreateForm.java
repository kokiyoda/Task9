package com.koki.task9.form;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class PokemonCreateForm {

    @Min(1)
    int pokedexNo;

    @NotNull
    @Size(min = 1, max = 6)
    String name;

    @Size(max = 6)
    String nickname;

    public PokemonCreateForm(int pokedexNo, @NotNull String name, String nickname) {
        this.pokedexNo = pokedexNo;
        this.name = name;
        this.nickname = nickname;
    }
}
