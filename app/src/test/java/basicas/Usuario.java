package basicas;

public class Usuario extends Pessoa{

    private String usuario;
    private String senha;

    private enum perfis {
        ADMINISTRADOR,DIRIGENTTE;
    }

    public Usuario(int cod,String nome, String rg, String email, String usuario, String senha) {
        super(cod, nome, rg, email);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



}
