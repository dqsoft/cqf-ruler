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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for CaseItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="when" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *         &lt;element name="then" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseItem", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "when",
    "then"
})
public class CaseItem
    extends Element
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression when;
    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression then;

    /**
     * Gets the value of the when property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getWhen() {
        return when;
    }

    /**
     * Sets the value of the when property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setWhen(Expression value) {
        this.when = value;
    }

    /**
     * Gets the value of the then property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getThen() {
        return then;
    }

    /**
     * Sets the value of the then property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setThen(Expression value) {
        this.then = value;
    }

    public CaseItem withWhen(Expression value) {
        setWhen(value);
        return this;
    }

    public CaseItem withThen(Expression value) {
        setThen(value);
        return this;
    }

    @Override
    public CaseItem withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public CaseItem withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public CaseItem withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CaseItem)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CaseItem that = ((CaseItem) object);
        {
            Expression lhsWhen;
            lhsWhen = this.getWhen();
            Expression rhsWhen;
            rhsWhen = that.getWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "when", lhsWhen), LocatorUtils.property(thatLocator, "when", rhsWhen), lhsWhen, rhsWhen)) {
                return false;
            }
        }
        {
            Expression lhsThen;
            lhsThen = this.getThen();
            Expression rhsThen;
            rhsThen = that.getThen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "then", lhsThen), LocatorUtils.property(thatLocator, "then", rhsThen), lhsThen, rhsThen)) {
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
            Expression theWhen;
            theWhen = this.getWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "when", theWhen), currentHashCode, theWhen);
        }
        {
            Expression theThen;
            theThen = this.getThen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "then", theThen), currentHashCode, theThen);
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
            Expression theWhen;
            theWhen = this.getWhen();
            strategy.appendField(locator, this, "when", buffer, theWhen);
        }
        {
            Expression theThen;
            theThen = this.getThen();
            strategy.appendField(locator, this, "then", buffer, theThen);
        }
        return buffer;
    }

}
