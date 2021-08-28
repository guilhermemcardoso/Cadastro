package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nomeCompletoEt;
    EditText telefoneEt;
    EditText emailEt;
    CheckBox ingressarLista;
    RadioGroup sexoRg;
    EditText cidadeEt;
    Spinner ufSpinner;
    Button limparBtn;
    Button salvarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeCompletoEt = (EditText) findViewById(R.id.nomeCompletoEt);
        telefoneEt = (EditText) findViewById(R.id.telefoneEt);
        emailEt = (EditText) findViewById(R.id.emailEt);
        ingressarLista = (CheckBox) findViewById(R.id.ingressarListCb);
        sexoRg = (RadioGroup) findViewById(R.id.sexoRg);
        cidadeEt = (EditText) findViewById(R.id.cidadeEt);
        ufSpinner = (Spinner) findViewById(R.id.ufSpinner);
        limparBtn = (Button) findViewById(R.id.limparBtn);
        salvarBtn = (Button) findViewById(R.id.salvarBtn);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.uf_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ufSpinner.setAdapter(adapter);

        limparBtn.setOnClickListener(this);
        salvarBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.limparBtn) {
            limpar();
        } else {
            salvar();
        }
    }

    private void limpar() {
        nomeCompletoEt.setText("");
        telefoneEt.setText("");
        emailEt.setText("");
        ingressarLista.setChecked(false);
        sexoRg.check(R.id.masculinoRb);
        cidadeEt.setText("");
        ufSpinner.setSelection(0);
        nomeCompletoEt.requestFocus();
    }

    private void salvar() {
        Formulario formulario = new Formulario();
        formulario.setNomeCompleto(nomeCompletoEt.getText().toString());
        formulario.setTelefone(telefoneEt.getText().toString());
        formulario.setEmail(emailEt.getText().toString());
        formulario.setIngressarLista(ingressarLista.isChecked());
        formulario.setSexo(sexoRg.getCheckedRadioButtonId() == R.id.masculinoRb ? "Masculino" : "Feminino");
        formulario.setCidade(cidadeEt.getText().toString());
        formulario.setUf(ufSpinner.getSelectedItem().toString());

        Toast.makeText(this, formulario.toString(), Toast.LENGTH_SHORT).show();
    }
}