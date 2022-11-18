public class ConversionesGastos{

    public int ConversionEnergia(GastoEnergía energia, int personas){
        int kilowatts=0;
        kilowatts = ((energia.getCalefaccion()*1500/personas)+(energia.getAireacondicionado()*1500/personas)
        +(energia.getTelevisor()*225)+(energia.getMicroondas()*30)+(energia.getHornoelectrico()*1800)
        +(energia.getLavadora()*1800/personas)+(energia.getLavavajillas()*700)+(energia.getTostadora()*15)
        +(energia.getLicuadora()*10)+(energia.getRefrigerador()*28800/personas)+(energia.getVentilador()*200)
        +(energia.getSecadora()*2600/personas)+(energia.getPlancha()*1200)+(energia.getConsoladevideojuegos()*150)
        +(energia.getBombilla()*6*20/(2*personas)));
        return kilowatts;
    }
    
    

    public float AsignacionesGastos(GastoAgua agua,int inodoro, int regadera, int lavadora, int chorro){
        float math= (agua.getInodoro()*17)+(agua.getChorro()*1)+(agua.getRegadera()*20)+(agua.getLavadora()*50)+(agua.getLavavajillas()*10);
        //17L promedio x descarga de inodoro, 1L por minuto abierto de chorro, 20L por minuto de regadera, 50L por ciclo de Lavadora, 10L x uso de lavavajillas 
        return math;
    }

    public float AsignacionesGastos(Gastos Gasolina gasolina,int tipocarro, int kilometrosaldia){
        // Int carro: Mediano (1) SUV (2) Electrico(3)
        int a = getTipocarro();
        if(a==1){
            float math= 85*Gasolina.getKilometrosaldia(); // Un carro mediano emite 85g de CO2 x kilometro 
            return math;    
        }

        if(a==2){
            float math= 140* Gasolina.getKilometrosaldia();// Un carro tipo SUV emite 140g de CO2 x kilometro 
            return math;
                
        }
        
        if(a==3){
            float math= 65* Gasolina.getKilometrosaldia(); // Un carro electrico emite 65g de CO2 x kilometro 
            return math;
        }

        else{
            float math= 1*Gasolina.getKilometrosaldia();
            return math;
        }

    }
}