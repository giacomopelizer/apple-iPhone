package apps;

public class iPhone {
    private safari web;
    private phone phone;
    private music music;

    public iPhone(){
        this.web = new safari();
        this.phone = new phone();
        this.music = new music();
    }

    public void showPage(){
        this.web.exibirPagina();
    }
    public void addPage(){
        this.web.abrirNovaAba();
    }
    public void updatePage(){
        this.web.atualizarPagina();
    }
    public void call(){
        this.phone.fazerLigacao();
    }
    public void answer(){
        this.phone.atenderLigacao();
    }
    public void voiceMail(){
        this.phone.iniciarCorreioVoz();
    }
    public void play(){
        this.music.tocarMusica();
    }
    public void pause(){
        this.music.pausar();
    }
    public void select(){
        this.music.selecionarMusica();
    }
    
}
