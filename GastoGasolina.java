public class GastoGasolina{
    private int tipocarro;
    private int kilometrosaldia;


    public GastoGasolina() {
        tipocarro=0;
        kilometrosaldia=0;

    }

    public GastoGasolina(int tipocarro, int kilometrosaldia) {
        this.tipocarro = tipocarro;
        this.kilometrosaldia = kilometrosaldia;
    }
 

    /**
     * @return String return the tipocarro
     */
    public int getTipocarro() {
        return tipocarro;
    }

    /**
     * @param tipocarro the tipocarro to set
     */
    public void setTipocarro(int tipocarro) {
        this.tipocarro = tipocarro;
    }

    /**
     * @return int return the kilometrosaldia
     */
    public int getKilometrosaldia() {
        return kilometrosaldia;
    }

    /**
     * @param kilometrosaldia the kilometrosaldia to set
     */
    public void setKilometrosaldia(int kilometrosaldia) {
        this.kilometrosaldia = kilometrosaldia;
    }

}