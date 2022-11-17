public class GastoAgua{
    private int inodoro;
    private int regadera;
    private int lavadora;
    private int chorro;
    private int lavavajillas;


    public float AsignacionesGastos(int inodoro, int regadera, int lavadora, int chorro){
        float math= (getInodoro()*17)+(getChorro()*1)+(getRegadera()*20)+(getLavadora()*50)+(getLavavajillas()*10);
        //17L promedio x descarga de inodoro, 1L por minuto abierto de chorro, 20L por minuto de regadera, 50L por ciclo de Lavadora, 10L x uso de lavavajillas 
        return math;
    }

    public int getLavavajillas() {
        return this.lavavajillas;
    }

    public void setLavavajillas(int lavavajillas) {
        this.lavavajillas = lavavajillas;
    }

    public int getChorro() {
        return this.chorro;
    }

    public void setChorro(int chorro) {
        this.chorro = chorro;
    }

    /**
     * @return int return the inodoro
     */
    public int getInodoro() {
        return inodoro;
    }

    /**
     * @param inodoro the inodoro to set
     */
    public void setInodoro(int inodoro) {
        this.inodoro = inodoro;
    }

    /**
     * @return int return the regadera
     */
    public int getRegadera() {
        return regadera;
    }

    /**
     * @param regadera the regadera to set
     */
    public void setRegadera(int regadera) {
        this.regadera = regadera;
    }

    /**
     * @return int return the lavadora
     */
    public int getLavadora() {
        return lavadora;
    }

    /**
     * @param lavadora the lavadora to set
     */
    public void setLavadora(int lavadora) {
        this.lavadora = lavadora;
    }

}