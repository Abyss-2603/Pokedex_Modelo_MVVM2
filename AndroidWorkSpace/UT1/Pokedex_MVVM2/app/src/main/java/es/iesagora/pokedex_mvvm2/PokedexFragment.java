package es.iesagora.pokedex_mvvm2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import es.iesagora.pokedex_mvvm2.adapter.PokemonAdapter;
import es.iesagora.pokedex_mvvm2.databinding.FragmentPokedexBinding;
import es.iesagora.pokedex_mvvm2.model.Pokemon;
import es.iesagora.pokedex_mvvm2.repository.PokemonRepository;

public class PokedexFragment extends Fragment {

    private FragmentPokedexBinding binding;
    private PokemonRepository repository;
    private PokemonAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPokedexBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Obtenemos la lista desde el Repository
        repository = new PokemonRepository();
        List<Pokemon> listaPokemons = repository.getPokemons();

        adapter = new PokemonAdapter(requireContext(), (ArrayList<Pokemon>) listaPokemons);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
    }


}