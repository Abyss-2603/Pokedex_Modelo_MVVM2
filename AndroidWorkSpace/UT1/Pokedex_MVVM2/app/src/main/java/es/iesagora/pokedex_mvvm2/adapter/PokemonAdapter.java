package es.iesagora.pokedex_mvvm2.adapter;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import es.iesagora.pokedex_mvvm2.R;
import es.iesagora.pokedex_mvvm2.databinding.ViewholderPokemonBinding;
import es.iesagora.pokedex_mvvm2.model.Pokemon;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {

    private List<Pokemon> pokemons;
    private final LayoutInflater inflater;

    public PokemonAdapter(Context context, List<Pokemon> pokemons){
        this.pokemons = pokemons;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.viewholder_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return pokemons != null ? pokemons.size() : 0;
    }

    public void establecerLista(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        notifyDataSetChanged(); // Notifica al RecyclerView que los datos han cambiado
    }

    public static class PokemonViewHolder extends RecyclerView.ViewHolder {

        // Objeto de enlace al layout viewholder_animal.xml
        public ViewholderPokemonBinding binding;

        // El constructor recibe la vista del layout inflado
        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            // Asociamos el objeto binding con la vista
            binding = ViewholderPokemonBinding.bind(itemView);
        }
        
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemons.get(position);

        holder.binding.tvNombre.setText(pokemon.getNombre());
        holder.binding.ivPokemon.setImageResource(pokemon.getImage());

        holder.itemView.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("pokemon", pokemon);
            Navigation.findNavController(v)
                    .navigate(R.id.action_pokedexFragment_to_detallesFragment, bundle);
        });
    }



}


