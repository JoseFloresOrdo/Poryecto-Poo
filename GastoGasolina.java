public class GastoGasolina{
    private int tipocarro;
    private int kilometrosaldia;

    public float AsignacionesGastos(int tipocarro, int kilometrosaldia){
        // Int carro: Mediano (1) SUV (2) Electrico(3)
        int a = getTipocarro();
        if(a==1){
            float math= 85*getKilometrosaldia(); // Un carro mediano emite 85g de CO2 x kilometro 
            return math;    
        }

        if(a==2){
            float math= 140* getKilometrosaldia();// Un carro tipo SUV emite 140g de CO2 x kilometro 
            return math;
                
        }
        
        if(a==3){
            float math= 65* getKilometrosaldia(); // Un carro electrico emite 65g de CO2 x kilometro 
            return math;
        }

        else{
            float math= 1*getKilometrosaldia();
            return math;
        }

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