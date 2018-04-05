package com.example.logonrm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText txtLogin;
    private EditText txtSenha;
    private Button btnEntrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtLogin = (EditText) (findViewById(R.id.txtLogin));
        txtSenha = (EditText) findViewById(R.id.txtSenha);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = txtLogin.getText().toString();
                String senha = txtSenha.getText().toString();

                if (usuario.equals("admin") && senha.equals("admin")) {
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Errou man", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}
