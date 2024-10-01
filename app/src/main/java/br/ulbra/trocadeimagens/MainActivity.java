package br.ulbra.trocadeimagens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button btnMostrar1, btnMostrar2;
    private boolean isShowingImage1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculando os componentes da interface
        imageView = findViewById(R.id.imageView);
        btnMostrar1 = findViewById(R.id.btnMostrar1);
        btnMostrar2 = findViewById(R.id.btnMostrar2);

        // Definindo o comportamento do botão "Mostrar" para a primeira imagem
        btnMostrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Alterar para a primeira imagem
                imageView.setImageResource(R.drawable.img1);
                isShowingImage1 = true;
            }
        });

        // Definindo o comportamento do botão "Mostrar" para a segunda imagem
        btnMostrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Alterar para a segunda imagem
                imageView.setImageResource(R.drawable.img2);
                isShowingImage1 = false;
            }
        });
    }
}
