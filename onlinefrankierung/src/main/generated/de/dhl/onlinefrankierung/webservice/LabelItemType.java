
package de.dhl.onlinefrankierung.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Ein Paket/Päckchen
 * 
 * <p>Java-Klasse für LabelItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LabelItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}ShipmentItemType">
 *       &lt;sequence>
 *         &lt;element name="CnDeclaration" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}Cn22Type" minOccurs="0"/>
 *         &lt;element name="DirectLabel" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popsc}DirectLabelType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="printedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="labelId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pdfDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="preAdviceType" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}PreAdviceType" />
 *       &lt;attribute name="recomandCode" type="{https://www.dhl.de/popweb/gw/ws/schema/1.0/popbase}RecomandCodeType" />
 *       &lt;attribute name="awtDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelItemType", propOrder = {
    "cnDeclaration",
    "directLabel"
})
public class LabelItemType
    extends ShipmentItemType
{

    @XmlElement(name = "CnDeclaration")
    protected Cn22Type cnDeclaration;
    @XmlElement(name = "DirectLabel")
    protected DirectLabelType directLabel;
    @XmlAttribute(name = "printedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar printedAt;
    @XmlAttribute(name = "labelId")
    protected String labelId;
    @XmlAttribute(name = "pdfDownloadUrl")
    protected String pdfDownloadUrl;
    @XmlAttribute(name = "preAdviceType")
    protected String preAdviceType;
    @XmlAttribute(name = "recomandCode")
    protected String recomandCode;
    @XmlAttribute(name = "awtDownloadUrl")
    protected String awtDownloadUrl;

    /**
     * Ruft den Wert der cnDeclaration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Cn22Type }
     *     
     */
    public Cn22Type getCnDeclaration() {
        return cnDeclaration;
    }

    /**
     * Legt den Wert der cnDeclaration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Cn22Type }
     *     
     */
    public void setCnDeclaration(Cn22Type value) {
        this.cnDeclaration = value;
    }

    /**
     * Ruft den Wert der directLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectLabelType }
     *     
     */
    public DirectLabelType getDirectLabel() {
        return directLabel;
    }

    /**
     * Legt den Wert der directLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectLabelType }
     *     
     */
    public void setDirectLabel(DirectLabelType value) {
        this.directLabel = value;
    }

    /**
     * Ruft den Wert der printedAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrintedAt() {
        return printedAt;
    }

    /**
     * Legt den Wert der printedAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrintedAt(XMLGregorianCalendar value) {
        this.printedAt = value;
    }

    /**
     * Ruft den Wert der labelId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * Legt den Wert der labelId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelId(String value) {
        this.labelId = value;
    }

    /**
     * Ruft den Wert der pdfDownloadUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfDownloadUrl() {
        return pdfDownloadUrl;
    }

    /**
     * Legt den Wert der pdfDownloadUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfDownloadUrl(String value) {
        this.pdfDownloadUrl = value;
    }

    /**
     * Ruft den Wert der preAdviceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreAdviceType() {
        return preAdviceType;
    }

    /**
     * Legt den Wert der preAdviceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreAdviceType(String value) {
        this.preAdviceType = value;
    }

    /**
     * Ruft den Wert der recomandCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecomandCode() {
        return recomandCode;
    }

    /**
     * Legt den Wert der recomandCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecomandCode(String value) {
        this.recomandCode = value;
    }

    /**
     * Ruft den Wert der awtDownloadUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwtDownloadUrl() {
        return awtDownloadUrl;
    }

    /**
     * Legt den Wert der awtDownloadUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwtDownloadUrl(String value) {
        this.awtDownloadUrl = value;
    }

}
