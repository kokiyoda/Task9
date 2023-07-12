package com.koki.task9.controller;

import com.koki.task9.entity.Pokemon;
import com.koki.task9.response.PokemonResponse;
import com.koki.task9.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemons")
    public List<PokemonResponse> getPokemons() {
        return pokemonService.findAll().stream().map(PokemonResponse::new).toList();
    }

    @GetMapping("/pokemons/{id}")
    public Pokemon findPokemonById(@PathVariable("id") int id) throws Exception {
        return pokemonService.findById(id);
    }
}
