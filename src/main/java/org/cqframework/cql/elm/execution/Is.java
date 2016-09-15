//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 02:28:55 PM MDT 
//


package org.cqframework.cql.elm.execution;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * The Is operator allows the type of a result to be tested. The language must support the ability to test against any type. If the run-time type of the argument is of the type being tested, the result of the operator is true; otherwise, the result is false.
 * 
 * <p>Java class for Is complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Is"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isTypeSpecifier" type="{urn:hl7-org:elm:r1}TypeSpecifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="isType" type="{http://www.w3.org/2001/XMLSchema}QName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Is", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "isTypeSpecifier"
})
public class Is
    extends UnaryExpression
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected TypeSpecifier isTypeSpecifier;
    @XmlAttribute(name = "isType")
    protected QName isType;

    /**
     * Gets the value of the isTypeSpecifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecifier }
     *     
     */
    public TypeSpecifier getIsTypeSpecifier() {
        return isTypeSpecifier;
    }

    /**
     * Sets the value of the isTypeSpecifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecifier }
     *     
     */
    public void setIsTypeSpecifier(TypeSpecifier value) {
        this.isTypeSpecifier = value;
    }

    /**
     * Gets the value of the isType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getIsType() {
        return isType;
    }

    /**
     * Sets the value of the isType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setIsType(QName value) {
        this.isType = value;
    }

    public Is withIsTypeSpecifier(TypeSpecifier value) {
        setIsTypeSpecifier(value);
        return this;
    }

    public Is withIsType(QName value) {
        setIsType(value);
        return this;
    }

    @Override
    public Is withOperand(Expression value) {
        setOperand(value);
        return this;
    }

    @Override
    public Is withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public Is withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public Is withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Is)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Is that = ((Is) object);
        {
            TypeSpecifier lhsIsTypeSpecifier;
            lhsIsTypeSpecifier = this.getIsTypeSpecifier();
            TypeSpecifier rhsIsTypeSpecifier;
            rhsIsTypeSpecifier = that.getIsTypeSpecifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isTypeSpecifier", lhsIsTypeSpecifier), LocatorUtils.property(thatLocator, "isTypeSpecifier", rhsIsTypeSpecifier), lhsIsTypeSpecifier, rhsIsTypeSpecifier)) {
                return false;
            }
        }
        {
            QName lhsIsType;
            lhsIsType = this.getIsType();
            QName rhsIsType;
            rhsIsType = that.getIsType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isType", lhsIsType), LocatorUtils.property(thatLocator, "isType", rhsIsType), lhsIsType, rhsIsType)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TypeSpecifier theIsTypeSpecifier;
            theIsTypeSpecifier = this.getIsTypeSpecifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isTypeSpecifier", theIsTypeSpecifier), currentHashCode, theIsTypeSpecifier);
        }
        {
            QName theIsType;
            theIsType = this.getIsType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isType", theIsType), currentHashCode, theIsType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            TypeSpecifier theIsTypeSpecifier;
            theIsTypeSpecifier = this.getIsTypeSpecifier();
            strategy.appendField(locator, this, "isTypeSpecifier", buffer, theIsTypeSpecifier);
        }
        {
            QName theIsType;
            theIsType = this.getIsType();
            strategy.appendField(locator, this, "isType", buffer, theIsType);
        }
        return buffer;
    }

}
