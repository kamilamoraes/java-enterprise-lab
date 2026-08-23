package app.model;

public class Cliente {

    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    public Cliente(int id, String nome, String sobrenome, String email, String telefone) {

       this.id = id;
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.email = email;
       this.telefone = telefone;
       
    }

    public Cliente() {
   
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
