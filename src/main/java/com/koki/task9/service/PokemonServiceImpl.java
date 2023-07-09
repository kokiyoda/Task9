package com.koki.task9.service;

import com.koki.task9.entity.Pokemon;
import com.koki.task9.mapper.PokemonMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {
    private final PokemonMapper pokemonMapper;

    public PokemonServiceImpl(PokemonMapper pokemonMapper) {
        this.pokemonMapper = pokemonMapper;
    }

    @Override
    public List<Pokemon> findAll() {
        return pokemonMapper.findAll();
    }


}
