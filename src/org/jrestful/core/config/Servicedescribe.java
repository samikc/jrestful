//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.12 at 08:36:13 PM IST 
//


package org.jrestful.core.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{}paramprocessor"/>
 *         &lt;element ref="{}pre"/>
 *         &lt;element ref="{}post"/>
 *         &lt;element ref="{}result"/>
 *         &lt;element ref="{}methodmap"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="provider" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "paramprocessor",
    "pre",
    "post",
    "result",
    "methodmap"
})
@XmlRootElement(name = "servicedescribe")
public class Servicedescribe {

    protected Paramprocessor paramprocessor;
    protected Pre pre;
    protected Post post;
    protected Result result;
    protected Methodmap methodmap;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String provider;

    /**
     * Gets the value of the paramprocessor property.
     * 
     * @return
     *     possible object is
     *     {@link Paramprocessor }
     *     
     */
    public Paramprocessor getParamprocessor() {
        return paramprocessor;
    }

    /**
     * Sets the value of the paramprocessor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paramprocessor }
     *     
     */
    public void setParamprocessor(Paramprocessor value) {
        this.paramprocessor = value;
    }

    /**
     * Gets the value of the pre property.
     * 
     * @return
     *     possible object is
     *     {@link Pre }
     *     
     */
    public Pre getPre() {
        return pre;
    }

    /**
     * Sets the value of the pre property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pre }
     *     
     */
    public void setPre(Pre value) {
        this.pre = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link Post }
     *     
     */
    public Post getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link Post }
     *     
     */
    public void setPost(Post value) {
        this.post = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the methodmap property.
     * 
     * @return
     *     possible object is
     *     {@link Methodmap }
     *     
     */
    public Methodmap getMethodmap() {
        return methodmap;
    }

    /**
     * Sets the value of the methodmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Methodmap }
     *     
     */
    public void setMethodmap(Methodmap value) {
        this.methodmap = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

}
