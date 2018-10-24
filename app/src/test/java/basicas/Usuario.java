package basicas;

public class Usuario {

    private String usuario;
    private String Senha;

    private enum perfis {
        ADMINISTRADOR,DIRIGENTTE;
    }
    public Usuario(){

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }



}
