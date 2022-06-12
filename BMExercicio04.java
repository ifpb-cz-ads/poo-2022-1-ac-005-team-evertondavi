class BMExercicio04 { //Aqui seria: class Lampada
    private int eficienciaLuminosa;
    private String tipo;
    private float potencia;
    private int iluminancia;
    private boolean ligada = false;
    

    public void trocarLampada(){
        System.out.println("Lampada trocada");
    }

    //metodos get e set:
    public int getEficienciaLuminosa() {
        return eficienciaLuminosa;
    }
    public void setEficienciaLuminosa(int eficienciaLuminosa) {
        this.eficienciaLuminosa = eficienciaLuminosa;
    }

    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    } 

    public int getIluminancia() {
        return iluminancia;
    }
    public void setIluminancia(int iluminancia) {
        this.iluminancia = iluminancia;
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
