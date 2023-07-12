package com.koki.task9.service;

import com.koki.task9.entity.Pokemon;
import com.koki.task9.exception.ResourceNotFoundException;
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

    @Override
    public Pokemon findById(int id) {
        return this.pokemonMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found for id:" + id));
    }
}
