
package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioDecoderConfigurationOptions;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Options" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfigurationOptions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "options"
})
@XmlRootElement(name = "GetAudioDecoderConfigurationOptionsResponse")
public class GetAudioDecoderConfigurationOptionsResponse {

    @XmlElement(name = "Options", required = true)
    protected AudioDecoderConfigurationOptions options;

    /**
     * Recupera il valore della proprietà options.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfigurationOptions }
     *     
     */
    public AudioDecoderConfigurationOptions getOptions() {
        return options;
    }

    /**
     * Imposta il valore della proprietà options.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfigurationOptions }
     *     
     */
    public void setOptions(AudioDecoderConfigurationOptions value) {
        this.options = value;
    }

}
