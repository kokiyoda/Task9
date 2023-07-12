package com.koki.task9.service;


import com.koki.task9.entity.Pokemon;
import com.koki.task9.exception.ResourceNotFoundException;

import java.util.List;

public interface PokemonService {
    List<Pokemon> findAll();

    Pokemon findById(int id) throws ResourceNotFoundException;
}
