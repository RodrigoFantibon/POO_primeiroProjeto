public class atributosCarros {
    

    private int precoCarro;
    private String modeloCarro;


    public void setmodeloCarro (String s){
        modeloCarro = s;
    }
    public String getmodeloCarro(){
        return modeloCarro;
    }

    public void setprecoCarro (int x){
        precoCarro = x;
    }
    public int getprecoCarro(){
        return precoCarro;
    }


    public void ExibirMensagem(){
     System.out.printf("o modelo do carro é: %s, e o valor do carro é %d",getmodeloCarro(), getprecoCarro());
    }

}
