public class GastoAgua{
    private int inodoro;
    private int regadera;
    private int lavadora;
    private int chorro;
    private int lavavajillas;



    public GastoAgua() {
        inodoro = 0;
        regadera=0;
        lavadora=0;
        chorro=0;
        lavavajillas=0;
    }

    public GastoAgua(int inodoro, int regadera, int lavadora, int chorro, int lavavajillas) {
        this.inodoro = inodoro;
        this.regadera = regadera;
        this.lavadora = lavadora;
        this.chorro = chorro;
        this.lavavajillas = lavavajillas;
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