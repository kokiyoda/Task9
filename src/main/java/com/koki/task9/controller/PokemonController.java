package com.koki.task9.controller;

import com.koki.task9.entity.Pokemon;
import com.koki.task9.form.PokemonCreateForm;
import com.koki.task9.response.PokemonResponse;
import com.koki.task9.service.PokemonService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

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
        return pokemonService.findById(id).orElseThrow();
    }

    @PostMapping("/pokemons")
    public ResponseEntity<Map<String, String>> createPokemon(@RequestBody @Valid PokemonCreateForm form, UriComponentsBuilder uriBuilder) {
        Pokemon pokemon = pokemonService.createPokemon(form.newPokemon());
        URI uri = uriBuilder
                .path("/pokemons/{id}")
                .buildAndExpand(pokemon.getId())
                .toUri();
        return ResponseEntity.created(uri).body(Map.of("massage", "pokemon successfully created"));
    }
}
