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
 * The CodeDef type defines a code identifier that can then be used to reference single codes anywhere within an expression.
 * 
 * <p>Java class for CodeDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeSystem" type="{urn:hl7-org:elm:r1}CodeSystemRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="display" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessLevel" type="{urn:hl7-org:elm:r1}AccessModifier" default="Public" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeDef", namespace = "urn:hl7-org:elm:r1", propOrder = {
    "codeSystem"
})
public class CodeDef
    extends Element
    implements Equals, HashCode, ToString
{

    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected CodeSystemRef codeSystem;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "display")
    protected String display;
    @XmlAttribute(name = "accessLevel")
    protected AccessModifier accessLevel;

    /**
     * Gets the value of the codeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link CodeSystemRef }
     *     
     */
    public CodeSystemRef getCodeSystem() {
        return codeSystem;
    }

    /**
     * Sets the value of the codeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeSystemRef }
     *     
     */
    public void setCodeSystem(CodeSystemRef value) {
        this.codeSystem = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplay(String value) {
        this.display = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessLevel() {
        if (accessLevel == null) {
            return AccessModifier.PUBLIC;
        } else {
            return accessLevel;
        }
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessLevel(AccessModifier value) {
        this.accessLevel = value;
    }

    public CodeDef withCodeSystem(CodeSystemRef value) {
        setCodeSystem(value);
        return this;
    }

    public CodeDef withName(String value) {
        setName(value);
        return this;
    }

    public CodeDef withId(String value) {
        setId(value);
        return this;
    }

    public CodeDef withDisplay(String value) {
        setDisplay(value);
        return this;
    }

    public CodeDef withAccessLevel(AccessModifier value) {
        setAccessLevel(value);
        return this;
    }

    @Override
    public CodeDef withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public CodeDef withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public CodeDef withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CodeDef)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CodeDef that = ((CodeDef) object);
        {
            CodeSystemRef lhsCodeSystem;
            lhsCodeSystem = this.getCodeSystem();
            CodeSystemRef rhsCodeSystem;
            rhsCodeSystem = that.getCodeSystem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codeSystem", lhsCodeSystem), LocatorUtils.property(thatLocator, "codeSystem", rhsCodeSystem), lhsCodeSystem, rhsCodeSystem)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsDisplay;
            lhsDisplay = this.getDisplay();
            String rhsDisplay;
            rhsDisplay = that.getDisplay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "display", lhsDisplay), LocatorUtils.property(thatLocator, "display", rhsDisplay), lhsDisplay, rhsDisplay)) {
                return false;
            }
        }
        {
            AccessModifier lhsAccessLevel;
            lhsAccessLevel = this.getAccessLevel();
            AccessModifier rhsAccessLevel;
            rhsAccessLevel = that.getAccessLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accessLevel", lhsAccessLevel), LocatorUtils.property(thatLocator, "accessLevel", rhsAccessLevel), lhsAccessLevel, rhsAccessLevel)) {
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
            CodeSystemRef theCodeSystem;
            theCodeSystem = this.getCodeSystem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codeSystem", theCodeSystem), currentHashCode, theCodeSystem);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "display", theDisplay), currentHashCode, theDisplay);
        }
        {
            AccessModifier theAccessLevel;
            theAccessLevel = this.getAccessLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accessLevel", theAccessLevel), currentHashCode, theAccessLevel);
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
            CodeSystemRef theCodeSystem;
            theCodeSystem = this.getCodeSystem();
            strategy.appendField(locator, this, "codeSystem", buffer, theCodeSystem);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theDisplay;
            theDisplay = this.getDisplay();
            strategy.appendField(locator, this, "display", buffer, theDisplay);
        }
        {
            AccessModifier theAccessLevel;
            theAccessLevel = this.getAccessLevel();
            strategy.appendField(locator, this, "accessLevel", buffer, theAccessLevel);
        }
        return buffer;
    }

}
