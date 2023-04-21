
package rpggame;

import java.util.List;

public abstract class Map {
    public String location; 
    
    public String clima;
    public String relevo;
    
    
    

    public Map(){}
    
    public Map(String clima, String relevo) {
        this.clima = clima;
        this.relevo = relevo;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getRelevo() {
        return relevo;
    }

    public void setRelevo(String relevo) {
        this.relevo = relevo;
    }
}




    
    
    
//    public abstract void Localizacao(Coordenadas coordenadas, Player Player);
//    
//}
