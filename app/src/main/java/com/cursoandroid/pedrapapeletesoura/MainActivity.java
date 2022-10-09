package com.cursoandroid.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionada(0);
    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionada(1);
    }
    public void selecionadoPapel(View view){
        this.opcaoSelecionada(2);
    }

    public void opcaoSelecionada (int opUser){
        ImageView imageRes = findViewById(R.id.imageResultado);
        TextView textRes = findViewById(R.id.textResultado);
        int opApp = new Random().nextInt(3);
        switch (opApp){
            case 0:
                imageRes.setImageResource(R.drawable.pedra);
                break;
            case 1:
                imageRes.setImageResource(R.drawable.tesoura);
                break;
            case 2:
                imageRes.setImageResource(R.drawable.papel);
                break;
        }

        if ((opUser == 0 && opApp == 1) || (opUser == 1 && opApp == 2) || (opUser == 2 && opApp == 0))
            textRes.setText("Você ganhou!!");
        else if (opApp == opUser)
            textRes.setText("Você empatou!!");
        else
            textRes.setText("Você perdeu!!");

    }

}