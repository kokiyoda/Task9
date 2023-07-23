package com.koki.task9.mapper;

import com.koki.task9.entity.Pokemon;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PokemonMapper {
    @Select("SELECT * FROM pokemons")
    List<Pokemon> findAll();

    @Select("SELECT * FROM pokemons WHERE id = #{id}")
    Optional<Pokemon> findById(int id);

    @Insert("INSERT INTO pokemons (pokedexNo, name, nickname) VALUES (#{pokedexNo}, #{name}, #{nickname})")
    public void createPokemon(Pokemon pokemon);
}
