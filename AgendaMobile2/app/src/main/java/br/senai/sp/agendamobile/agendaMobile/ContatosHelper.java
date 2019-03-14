package br.senai.sp.agendamobile.agendaMobile;

import android.app.Activity;
import android.support.design.widget.TextInputLayout;
import android.widget.EditText;
import android.widget.Toast;

import br.senai.sp.agendamobile.R;
import br.senai.sp.agendamobile.modelo.Contato;

public class ContatosHelper {

    private EditText txtNome;
    private EditText txtEndereco;
    private EditText txtTelefone;
    private EditText txtEmail;
    private EditText txtLinkedin;
    private TextInputLayout layoutNome;
    private TextInputLayout layoutEndereco;
    private TextInputLayout layoutTelefone;
    private TextInputLayout layoutEmail;
    private TextInputLayout layoutEmailLinkedin;

    private Contato contato;

    public ContatosHelper (CadastroActivity activity){
        txtNome = activity.findViewById(R.id.txt_nome);
        txtEndereco = activity.findViewById(R.id.txt_endereco);
        txtTelefone = activity.findViewById(R.id.txt_telefone);
        txtEmail = activity.findViewById(R.id.txt_email);
        txtLinkedin = activity.findViewById(R.id.txt_linkedin);
        layoutNome = activity.findViewById(R.id.layoutNome);
        layoutEndereco = activity.findViewById(R.id.layoutEndereco);
        layoutTelefone = activity.findViewById(R.id.layoutTelefone);
        layoutEmail = activity.findViewById(R.id.layoutEmail);
        layoutEmailLinkedin = activity.findViewById(R.id.layoutEmailLinkedin);


        contato =  new Contato();
    }



    public Contato getContato(){
        contato.setNome(txtNome.getText().toString());
        contato.setEndereco(txtEndereco.getText().toString());
        contato.setTelefone(txtTelefone.getText().toString());
        contato.setEmail(txtEmail.getText().toString());
        contato.setLinkedin(txtLinkedin.getText().toString());

        return contato;
    }

    public void PreencherFormulario(Contato contato){
        txtNome.setText(contato.getNome());
        txtEndereco.setText(contato.getEndereco());
        txtTelefone.setText(contato.getTelefone());
        txtEmail.setText(contato.getEmail());
        txtLinkedin.setText(contato.getLinkedin());

        this.contato = contato;
    }

    public boolean validarCampos (){


        boolean validar = false;
        if (txtNome.getText().toString().equals("")){
            txtNome.setError("preencha o campo nome");
            validar = true;
        }

        if (txtEndereco.getText().toString().equals("")){
            txtEndereco.setError("preencha o campo endereço");
            validar = true;
        }

        if (txtTelefone.getText().toString().equals("")){
            txtTelefone.setError("preencha o campo Telefone");
            validar = true;
        }

        if (txtEmail.getText().toString().equals("")){
            txtEmail.setError("preencha o campo Email");
            validar = true;
        }

        if (txtLinkedin.getText().toString().equals("")){
            txtLinkedin.setError("preencha o campo Email do linkedin");
            validar = true;
        }

        return validar;

    }



}
