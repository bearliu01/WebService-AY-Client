
package com.web.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dosageDays complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="dosageDays"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checkDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkErrReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="checker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dayDosage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dosageSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="markDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="meterNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="readUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="realDosageSum" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dosageDays", propOrder = {
    "checkDt",
    "checkErrReason",
    "checkFlag",
    "checker",
    "dayDosage",
    "dosageSum",
    "markDay",
    "meterNo",
    "readDt",
    "readUser",
    "realDosageSum"
})
public class DosageDays {

    protected String checkDt;
    protected String checkErrReason;
    protected Integer checkFlag;
    protected String checker;
    protected Double dayDosage;
    protected Double dosageSum;
    protected String markDay;
    protected String meterNo;
    protected String readDt;
    protected String readUser;
    protected Double realDosageSum;

    /**
     * 获取checkDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckDt() {
        return checkDt;
    }

    /**
     * 设置checkDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckDt(String value) {
        this.checkDt = value;
    }

    /**
     * 获取checkErrReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckErrReason() {
        return checkErrReason;
    }

    /**
     * 设置checkErrReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckErrReason(String value) {
        this.checkErrReason = value;
    }

    /**
     * 获取checkFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckFlag() {
        return checkFlag;
    }

    /**
     * 设置checkFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckFlag(Integer value) {
        this.checkFlag = value;
    }

    /**
     * 获取checker属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecker() {
        return checker;
    }

    /**
     * 设置checker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecker(String value) {
        this.checker = value;
    }

    /**
     * 获取dayDosage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDayDosage() {
        return dayDosage;
    }

    /**
     * 设置dayDosage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDayDosage(Double value) {
        this.dayDosage = value;
    }

    /**
     * 获取dosageSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDosageSum() {
        return dosageSum;
    }

    /**
     * 设置dosageSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDosageSum(Double value) {
        this.dosageSum = value;
    }

    /**
     * 获取markDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkDay() {
        return markDay;
    }

    /**
     * 设置markDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkDay(String value) {
        this.markDay = value;
    }

    /**
     * 获取meterNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置meterNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeterNo(String value) {
        this.meterNo = value;
    }

    /**
     * 获取readDt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadDt() {
        return readDt;
    }

    /**
     * 设置readDt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadDt(String value) {
        this.readDt = value;
    }

    /**
     * 获取readUser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadUser() {
        return readUser;
    }

    /**
     * 设置readUser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadUser(String value) {
        this.readUser = value;
    }

    /**
     * 获取realDosageSum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRealDosageSum() {
        return realDosageSum;
    }

    /**
     * 设置realDosageSum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRealDosageSum(Double value) {
        this.realDosageSum = value;
    }

}
