DROP TABLE IF EXISTS pokemons;

CREATE TABLE pokemons (
  id int unsigned AUTO_INCREMENT,
  pokedexNo int unsigned NOT NULL,
  name VARCHAR(6) NOT NULL,
  nickname VARCHAR(6),
  PRIMARY KEY(id)
);

INSERT INTO pokemons (pokedexNo, name, nickname) VALUES (1, "フシギダネ", "ふしぎ");
INSERT INTO pokemons (pokedexNo, name, nickname) VALUES (4, "ヒトカゲ", "ドン");
INSERT INTO pokemons (pokedexNo, name, nickname) VALUES (7, "ゼニガメ", "かめ");
INSERT INTO pokemons (pokedexNo,name) VALUES (16, "ポッポ");
