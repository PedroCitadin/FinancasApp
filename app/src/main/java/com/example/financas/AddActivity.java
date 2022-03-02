package com.example.financas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.financas.bean.Gasto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddActivity extends AppCompatActivity {
    private EditText txtDesc, txtValo, txtData;
    private Button btnCadastrar;
    public Gasto gasto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        txtDesc = findViewById(R.id.editDesc);
        txtValo = findViewById(R.id.editValor);
        txtData = findViewById(R.id.editData);
        btnCadastrar = findViewById(R.id.btnSalvar);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date data = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    data = formato.parse(txtData.getText().toString());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                gasto = new Gasto(txtDesc.getText().toString(), Float.parseFloat(txtValo.getText().toString()),data);
                System.out.println(gasto.getData());

            }
        });
    }
}
