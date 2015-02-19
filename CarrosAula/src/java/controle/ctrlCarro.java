
package controle;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import modelo.carro;

@ManagedBean(name ="ctrlCarro" )
@ViewScoped
//@SessionScoped
public class ctrlCarro {
    private carro carro;
    private ArrayList<carro> carros;
    
   
    

    public ctrlCarro() {
        carro = new carro();
        carros=new ArrayList<carro>();
        carros.add(new carro("ford","focus",2010,40000));
        carros.add(new carro("fiat","siena",2010,30850));
        carros.add(new carro("hyldai","hb20",2012,240000));
        carros.add(new carro("ferrari","ferrari",2012,40000));
         carros.add(new carro("ford","focus",203,40000));
        carros.add(new carro("fiat","siena",2010,40000));
        carros.add(new carro("hyldai","hb20",2010,40000));
        carros.add(new carro("ferrari","ferrari",2010,40000));
         carros.add(new carro("ford","focus",2010,40000));
        carros.add(new carro("fiat","siena",2010,40000));
        carros.add(new carro("hyldai","hb20",2010,40000));
        carros.add(new carro("ferrari","ferrari",2010,40000));
        
    }

    public ArrayList<carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<carro> carros) {
        this.carros = carros;
    }

    public void inserirCarro(){
        carros.add(carro);
        carro=new carro();
    }
    
     public void removerCarro(carro carro){
        carros.remove(carro);
        carro=new carro();
    }
    
    
    
    
    
    
    
    public carro getCarro() {
        return carro;
    }

    public void setCarro(carro carro) {
        this.carro = carro;
    }
    
    
    
}
