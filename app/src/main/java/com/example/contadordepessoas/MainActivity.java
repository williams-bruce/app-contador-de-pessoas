package com.example.contadordepessoas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int qtdeHomem;
    private int qtdeMulher;
    private int qtdeTotal;
    private TextView textoContador;
    private Button btnHomem;
    private Button btnMulher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnHomem = findViewById(R.id.btnHomem);
        btnMulher = findViewById(R.id.btnMulher);
        textoContador = findViewById(R.id.textoContador);
        textoContador.setText("Total de pessoas: 0");
    }

    public void btnHomemClick(View v) {
        qtdeHomem++;
        qtdeTotal++;
        btnHomem.setText(Integer.toString(qtdeHomem));
        textoContador.setText("Total de pessoas: " + qtdeTotal);
    }

    public void btnMulherClick(View v) {
        qtdeMulher++;
        qtdeTotal++;
        btnMulher.setText(Integer.toString(qtdeMulher));
        textoContador.setText("Total de pessoas: " + qtdeTotal);
    }

    public void btnResetClick(View v) {
        qtdeHomem = 0;
        qtdeMulher = 0;
        qtdeTotal = 0;
        btnHomem.setText("Homem");
        btnMulher.setText("Mulher");
        textoContador.setText("Total de pessoas: " + qtdeTotal);
    }
}