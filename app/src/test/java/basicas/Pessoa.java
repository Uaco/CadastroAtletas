package basicas;

public abstract class Pessoa {


    public Pessoa(int cod,String nome, String rg, String email) {
        this.nome = nome;
        this.rg = rg;
        this.email = email;
    }

    private int cod;



    private String nome;
    private String rg;
    private String email;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
