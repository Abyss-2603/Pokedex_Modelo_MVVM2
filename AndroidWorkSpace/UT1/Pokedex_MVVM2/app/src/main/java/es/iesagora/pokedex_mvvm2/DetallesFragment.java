package es.iesagora.pokedex_mvvm2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import es.iesagora.pokedex_mvvm2.databinding.FragmentDetallesBinding;
import es.iesagora.pokedex_mvvm2.model.Pokemon;


public class DetallesFragment extends Fragment {

    private Pokemon pokemon;
    private FragmentDetallesBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Recuperamos el argumento enviado desde el adapter (antes de crear la vista)
        if (getArguments() != null) {
            pokemon = (Pokemon) getArguments().getSerializable("pokemon");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetallesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view,
                              @Nullable Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);

        if (pokemon == null) return;

        binding.ivImagenPokemon.setImageResource(pokemon.getImage());

        binding.tvNumero.setText("Nº " + pokemon.getNumero());

        binding.tvNombrePokemon.setText(pokemon.getNombre());

        binding.tvDetalles.setText(pokemon.getDetalles());

        if (pokemon.getTipo1() != null) {
            mostrarTipo(pokemon.getTipo1());
        }

        if (pokemon.getTipo2() != null && !pokemon.getTipo2().isEmpty()) {
            mostrarTipo(pokemon.getTipo2());
        }

    }

    private void mostrarTipo(String tipo){
        TextView tv = new TextView(requireContext());
        tv.setText(tipo.toUpperCase());
        tv.setPadding(20, 10, 20, 10);
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(14);
        tv.setTypeface(null, Typeface.BOLD);

        tv.setBackgroundColor(getColorTipo(tipo));

        binding.Tipos.addView(tv);

    }

    private int getColorTipo(String tipo) {
        switch (tipo.toLowerCase()) {

            case "planta":
                return getResources().getColor(R.color.tipo_planta);

            case "veneno":
                return getResources().getColor(R.color.tipo_veneno);

            case "fuego":
                return getResources().getColor(R.color.tipo_fuego);

            case "agua":
                return getResources().getColor(R.color.tipo_agua);

            case "eléctrico":
            case "electrico":
                return getResources().getColor(R.color.tipo_electrico);

            case "psíquico":
            case "psiquico":
                return getResources().getColor(R.color.tipo_psiquico);

            case "dragón":
            case "dragon":
                return getResources().getColor(R.color.tipo_dragon);

            default:
                return Color.GRAY;
        }
    }
}