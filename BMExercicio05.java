class BMExercicio05 { //aui seria: class Time
    private int jogadores;
    private int classificacao;
    private String esporte;
    private boolean jogando = false;
    
    public void participarCampeonato(){
        System.out.println("Voce esta participando do torneio.");
    }
    
    public void deixarCampeonato(){
        System.out.println("Voce deixou o torneio.");
    }
    public void jogarPartida(){
        this.setJogando(true);
    }



    
    //metodos get e set
    public int getJogadores(){
        return jogadores;
    }
    public void setJogadores(int jogadores){
        this.jogadores = jogadores;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getEsporte() {
        return esporte;
    }
    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public boolean isJogando() {
        return jogando;
    }
    public void setJogando(boolean jogando) {
        this.jogando = jogando;
    }
}