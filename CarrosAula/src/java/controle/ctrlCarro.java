
package controle;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.carro;

@ManagedBean
@ViewScoped
public class ctrlCarro {
    private carro carro;

    public ctrlCarro() {
        carro = new carro();
    }

    
    
    
    public carro getCarro() {
        return carro;
    }

    public void setCarro(carro carro) {
        this.carro = carro;
    }
    
    
    
}
