package es.iesagora.pokedex_mvvm2.repository;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import java.util.ArrayList;
import java.util.List;

import es.iesagora.pokedex_mvvm2.R;
import es.iesagora.pokedex_mvvm2.adapter.PokemonAdapter;
import es.iesagora.pokedex_mvvm2.model.Pokemon;

public class PokemonRepository {

    private List<Pokemon> listaPokemons;

    public PokemonRepository() {
        listaPokemons = new ArrayList<>();

        //1 Generacion
        listaPokemons.add(new Pokemon(151,"Mew", R.drawable.mew,"Si se observa a través de un microscopio, puede distinguirse cuán corto, fino y delicado es el pelaje de este Pokémon.", 1, "Psíquico", null, false));

        listaPokemons.add(new Pokemon(150,"Mewtwo", R.drawable.mewtwo, "Su ADN es casi el mismo que el de Mew. Sin embargo, su tamaño y carácter son muy diferentes.", 1, "Psíquico", null, false));

        listaPokemons.add(new Pokemon(25,"Pikachu", R.drawable.pikachu,
                "Cuando se enfada, este Pokémon descarga la energía que almacena en el interior de las bolsas de las mejillas.",
                1, "Eléctrico", null, false));

        listaPokemons.add(new Pokemon(9,"Blastoise", R.drawable.blastoise,
                "Aumenta de peso deliberadamente para contrarrestar la fuerza de los chorros de agua que dispara.",
                1, "Agua", null, false));

        listaPokemons.add(new Pokemon(1,"Bulbasaur", R.drawable.bulbasaur,
                "Tras nacer, crece alimentándose durante un tiempo de los nutrientes que contiene el bulbo de su lomo.",
                1, "Planta", "Veneno", false));

        listaPokemons.add(new Pokemon(6,"Charizard", R.drawable.charizard,
                "Cuando se enfurece de verdad, la llama de la punta de su cola se vuelve de color azul claro.",
                1, "Fuego", "Volador", false));

        listaPokemons.add(new Pokemon(4,"Charmander", R.drawable.charmander,
                "La llama de su cola indica su fuerza vital. Si está débil, la llama arderá más tenue.",
                1, "Fuego", null, false));

        listaPokemons.add(new Pokemon(5,"Charmeleon", R.drawable.charmeleon,
                "Al agitar su ardiente cola, eleva poco a poco la temperatura a su alrededor para sofocar a sus rivales.",
                1, "Fuego", null, false));

        listaPokemons.add(new Pokemon(2,"Ivysaur", R.drawable.ivysaur,
                "Cuanta más luz solar recibe, más aumenta su fuerza y más se desarrolla el capullo que tiene en el lomo.",
                1, "Planta", "Veneno", false));

        listaPokemons.add(new Pokemon(26,"Raichu", R.drawable.raichu,
                "Su cola actúa como toma de tierra y descarga electricidad al suelo, lo que le protege de los calambrazos.",
                1, "Eléctrico", null, false));

        listaPokemons.add(new Pokemon(7,"Squirtle", R.drawable.squirtle,
                "Tras nacer, se le hincha el lomo y se le forma un caparazón. Escupe poderosa espuma por la boca.",
                1, "Agua", null, false));

        listaPokemons.add(new Pokemon(3,"Venusaur", R.drawable.venusaur,
                "Puede convertir la luz del sol en energía. Por esa razón, es más poderoso en verano.",
                1, "Planta", "Veneno", false));

        listaPokemons.add(new Pokemon(8,"Wartortle", R.drawable.wartortle,
                "Tiene una cola larga y peluda que simboliza la longevidad y lo hace popular entre los mayores.",
                1, "Agua", null, false));


        //2 Generacion
        listaPokemons.add(new Pokemon(155,"Cyndaquil", R.drawable.cyndaquil,
                "La llama que tiene en la espalda arde cuando está enfadado. Si está cansado, apenas echa fuego por la espalda.",
                2, "Fuego", null, false));

        listaPokemons.add(new Pokemon(156,"Quilava", R.drawable.quilava,
                "Su pelaje es a prueba de fuego...",
                2, "Fuego", null, false));

        listaPokemons.add(new Pokemon(157,"Typhlosion", R.drawable.typhlosion,
                "Se oculta tras un brillante resplandor cuando prepara su ataque.",
                2, "Fuego", null, false));

        listaPokemons.add(new Pokemon(158,"Totodile", R.drawable.totodile,
                "Es de naturaleza violenta...",
                2, "Agua", null, false));

        listaPokemons.add(new Pokemon(159,"Croconaw", R.drawable.croconaw,
                "Si se le rompen los colmillos, le vuelven a crecer rápidamente.",
                2, "Agua", null, false));

        listaPokemons.add(new Pokemon(160,"Feraligatr", R.drawable.feraligatr,
                "Aunque es grande, es muy rápido...",
                2, "Agua", null, false));

        listaPokemons.add(new Pokemon(152,"Chikorita", R.drawable.chikorita,
                "Al luchar, agita la hoja...",
                2, "Planta", null, false));

        listaPokemons.add(new Pokemon(153,"Bayleef", R.drawable.bayleef,
                "El collar que rodea su cuello desprende un aroma muy estimulante.",
                2, "Planta", null, false));

        listaPokemons.add(new Pokemon(154,"Meganium", R.drawable.meganium,
                "El aliento de Meganium tiene el poder de revivir plantas.",
                2, "Planta", null, false));

        listaPokemons.add(new Pokemon(162,"Furret", R.drawable.furret,
                "Es muy ágil y tiene un cuerpo delgado y flexible.",
                2, "Normal", null, false));

        listaPokemons.add(new Pokemon(249,"Lugia", R.drawable.lugia,
                "Duerme en el fondo del mar...",
                2, "Psíquico", "Volador", false));

        listaPokemons.add(new Pokemon(250,"Ho-Oh", R.drawable.ho_oh,
                "Se dice que sus plumas brillan con los siete colores.",
                2, "Fuego", "Volador", false));

        listaPokemons.add(new Pokemon(251,"Celebi", R.drawable.celebi,
                "Viaja a través del tiempo...",
                2, "Psíquico", "Planta", false));

        //3 Generacion

        listaPokemons.add(new Pokemon(252,"Treecko", R.drawable.treecko,
                "Tiene unas ventosas en los dedos...",
                3, "Planta", null, false));

        listaPokemons.add(new Pokemon(253,"Grovyle", R.drawable.grovyle,
                "Vive en lo alto de los árboles...",
                3, "Planta", null, false));

        listaPokemons.add(new Pokemon(254,"Sceptile", R.drawable.sceptile,
                "En la selva se mueve con agilidad...",
                3, "Planta", null, false));

        listaPokemons.add(new Pokemon(255,"Torchic", R.drawable.torchic,
                "Este Pokémon almacena el fuego...",
                3, "Fuego", null, false));

        listaPokemons.add(new Pokemon(256,"Combusken", R.drawable.combusken,
                "Su poderoso tren inferior le permite asestar patadas rápidas.",
                3, "Fuego", "Lucha", false));

        listaPokemons.add(new Pokemon(257,"Blaziken", R.drawable.blaziken,
                "Cuando combate, las llamas arden con más fuerza.",
                3, "Fuego", "Lucha", false));

        listaPokemons.add(new Pokemon(258,"Mudkip", R.drawable.mudkip,
                "La aleta de su cabeza actúa como radar.",
                3, "Agua", null, false));

        listaPokemons.add(new Pokemon(259,"Marshtomp", R.drawable.marshtomp,
                "Su cuerpo viscoso le permite vivir en agua y tierra.",
                3, "Agua", "Tierra", false));

        listaPokemons.add(new Pokemon(260,"Swampert", R.drawable.swampert,
                "Puede arrastrar rocas de más de una tonelada.",
                3, "Agua", "Tierra", false));

        listaPokemons.add(new Pokemon(280,"Ralts", R.drawable.ralts,
                "Siente las emociones de las personas.",
                3, "Psíquico", "Hada", false));

        listaPokemons.add(new Pokemon(281,"Kirlia", R.drawable.kirlia,
                "Usa poderes psíquicos para crear ilusiones.",
                3, "Psíquico", "Hada", false));

        listaPokemons.add(new Pokemon(282,"Gardevoir", R.drawable.gardevoir,
                "Es capaz de distorsionar dimensiones para proteger a su entrenador.",
                3, "Psíquico", "Hada", false));

        listaPokemons.add(new Pokemon(384,"Rayquaza", R.drawable.rayquaza,
                "Vive en la capa de ozono desde hace millones de años.",
                3, "Dragón", "Volador", false));

    }

    public List<Pokemon> getPokemons(){
        return listaPokemons;
    }




}
