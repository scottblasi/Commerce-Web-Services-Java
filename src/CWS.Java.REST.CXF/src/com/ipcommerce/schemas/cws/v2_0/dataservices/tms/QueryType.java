
package com.ipcommerce.schemas.cws.v2_0.dataservices.tms;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AND"/>
 *     &lt;enumeration value="OR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryType")
@XmlEnum
public enum QueryType {


    /**
     * <summary>
     *             Each result must match all the provided parameters.
     *             </summary>
     * 
     */
    AND,

    /**
     * <summary>
     *             Each result must match one or more of the provided parameters.
     *             </summary>
     * 
     */
    OR;

    public String value() {
        return name();
    }

    public static QueryType fromValue(String v) {
        return valueOf(v);
    }

}
