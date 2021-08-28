package com.example.cadastro;

public class Formulario {

    private String nomeCompleto;
    private String telefone;
    private String email;
    private boolean ingressarLista;
    private String sexo;
    private String cidade;
    private String uf;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIngressarLista() {
        return ingressarLista;
    }

    public void setIngressarLista(boolean ingressarLista) {
        this.ingressarLista = ingressarLista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome completo:");
        sb.append('\n');
        sb.append(this.getNomeCompleto());
        sb.append('\n');
        sb.append("Telefone:");
        sb.append('\n');
        sb.append(this.getTelefone());
        sb.append('\n');
        sb.append("Email:");
        sb.append('\n');
        sb.append(this.getEmail());
        sb.append('\n');
        sb.append("Ingressar lista de e-mails?");
        sb.append('\n');
        sb.append(this.isIngressarLista() ? "Sim" : "Não");
        sb.append('\n');
        sb.append("Sexo:");
        sb.append('\n');
        sb.append(this.getSexo());
        sb.append('\n');
        sb.append("Cidade:");
        sb.append('\n');
        sb.append(this.getCidade());
        sb.append('\n');
        sb.append("UF:");
        sb.append('\n');
        sb.append(this.getUf());
        sb.append('\n');

        return sb.toString();
    }
}
