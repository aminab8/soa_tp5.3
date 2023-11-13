
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour compte complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="compte">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="sode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compte", propOrder = {
    "code",
    "sode"
})
public class Compte {

    protected double code;
    protected double sode;

    /**
     * Obtient la valeur de la propriété code.
     * 
     */
    public double getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     */
    public void setCode(double value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété sode.
     * 
     */
    public double getSode() {
        return sode;
    }

    /**
     * Définit la valeur de la propriété sode.
     * 
     */
    public void setSode(double value) {
        this.sode = value;
    }

}
