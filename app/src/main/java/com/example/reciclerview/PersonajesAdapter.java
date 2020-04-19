package com.example.reciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajesAdapter extends RecyclerView.Adapter {

    // necesito el layout y necesito la lista de datos
    private List<Personajes> listaDePersonajes;

    public PersonajesAdapter(List<Personajes> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;
    }

    /**
     * Crea la celda del layout
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // pasar el xml a al de tipo view, es decir necesito inflarlo
        //
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View viewCelda = layoutInflater.inflate(R.layout.celda_personaje, parent, false);
        PersonajeViewHolder viewHolder = new PersonajeViewHolder(viewCelda);
        return viewHolder;
    }

    /**
     * Es el que le da a la celda creada los valores correspondientes.
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Personajes unPersonajeAMostrar = listaDePersonajes.get(position);
        PersonajeViewHolder personajeViewHolder = (PersonajeViewHolder) holder;
        personajeViewHolder.cargarPersonajes(unPersonajeAMostrar);
    }

    /**
     * Resorta la cantidad de elementos de la lista
     * @return
     */
    @Override
    public int getItemCount() {
        return this.listaDePersonajes.size();
    }

    private class PersonajeViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageViewPersonaje;
        private TextView textViewPersonajeNombre;
        private TextView textViewPersonajeSerieOrigen;

        public PersonajeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPersonaje = itemView.findViewById(R.id.celdaPersonajeImageViewPersonaje);
            textViewPersonajeNombre = itemView.findViewById(R.id.celdaPersonajeTextViewNombrePersonaje);
            textViewPersonajeSerieOrigen = itemView.findViewById(R.id.celdaPersonajeTextViewNombreSerie);
        }

        public void cargarPersonajes(Personajes personaje){
            imageViewPersonaje.setImageResource(personaje.getImagen());
            textViewPersonajeNombre.setText(personaje.getNombre());
            textViewPersonajeSerieOrigen.setText(personaje.getOrigenSerie());
        }
    }
}
