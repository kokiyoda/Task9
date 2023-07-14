package com.koki.task9.service;


import com.koki.task9.entity.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonService {
    List<Pokemon> findAll();

    Optional<Pokemon> findById(int id);
}
