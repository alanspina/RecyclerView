package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.mainActivityRecyclerView);
        List<Personajes> personajesList = obtenerPersonajes();
        PersonajesAdapter personajesAdapter = new PersonajesAdapter(personajesList);
        recyclerView.setAdapter(personajesAdapter); //ACÁ ME TIRA ERROR DE QUE ESTA NULL EL ReciclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
    }

    public List<Personajes> obtenerPersonajes() {
        List<Personajes> personajesList = new ArrayList<>();
        //agrego los personajes
        personajesList.add(new Personajes("Fede Bettoli", "El Fefo", R.drawable.fede_betolli));
        personajesList.add(new Personajes("Facundo Reinero", "La Faquita", R.drawable.facu_reinero));
        personajesList.add(new Personajes("Agustina Blanco", "La Gusa", R.drawable.agus_blanco));
        personajesList.add(new Personajes("Fede Bettoli", "El Fefo", R.drawable.fede_betolli));
        personajesList.add(new Personajes("Facundo Reinero", "La Faquita", R.drawable.facu_reinero));
        personajesList.add(new Personajes("Agustina Blanco", "La Gusa", R.drawable.agus_blanco));
        //retorno los personajes
        return personajesList;
    }
}
