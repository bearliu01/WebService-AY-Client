
package com.web.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dosageDays complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcheckDt���Ե�ֵ��
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
     * ����checkDt���Ե�ֵ��
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
     * ��ȡcheckErrReason���Ե�ֵ��
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
     * ����checkErrReason���Ե�ֵ��
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
     * ��ȡcheckFlag���Ե�ֵ��
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
     * ����checkFlag���Ե�ֵ��
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
     * ��ȡchecker���Ե�ֵ��
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
     * ����checker���Ե�ֵ��
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
     * ��ȡdayDosage���Ե�ֵ��
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
     * ����dayDosage���Ե�ֵ��
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
     * ��ȡdosageSum���Ե�ֵ��
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
     * ����dosageSum���Ե�ֵ��
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
     * ��ȡmarkDay���Ե�ֵ��
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
     * ����markDay���Ե�ֵ��
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
     * ��ȡmeterNo���Ե�ֵ��
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
     * ����meterNo���Ե�ֵ��
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
     * ��ȡreadDt���Ե�ֵ��
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
     * ����readDt���Ե�ֵ��
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
     * ��ȡreadUser���Ե�ֵ��
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
     * ����readUser���Ե�ֵ��
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
     * ��ȡrealDosageSum���Ե�ֵ��
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
     * ����realDosageSum���Ե�ֵ��
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
