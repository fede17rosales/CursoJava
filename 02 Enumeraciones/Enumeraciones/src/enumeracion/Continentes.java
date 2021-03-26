
package enumeracion;

/**
 *
 * @author Federico
 */
public enum Continentes {
    AFRICA(53),
    EUROPA(20),
    ASIA(50),
    AMERICA(20),
    OCEANIA(15);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
