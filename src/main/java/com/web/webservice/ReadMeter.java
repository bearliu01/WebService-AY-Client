package com.web.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-04-28T14:48:49.262+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://webservice.web.com/", name = "ReadMeter")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ReadMeter {

    @WebResult(name = "return", targetNamespace = "http://webservice.web.com/", partName = "return")
    @WebMethod
    public java.lang.String downloadData(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        int arg1,
        @WebParam(partName = "arg2", name = "arg2")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "http://webservice.web.com/", partName = "return")
    @WebMethod
    public java.lang.String changeMeter(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1,
        @WebParam(partName = "arg2", name = "arg2")
        float arg2,
        @WebParam(partName = "arg3", name = "arg3")
        java.lang.String arg3,
        @WebParam(partName = "arg4", name = "arg4")
        float arg4,
        @WebParam(partName = "arg5", name = "arg5")
        java.lang.String arg5,
        @WebParam(partName = "arg6", name = "arg6")
        java.lang.String arg6
    ) throws Exception_Exception;

    @WebResult(name = "return", targetNamespace = "http://webservice.web.com/", partName = "return")
    @WebMethod
    public java.lang.String meterHandle(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1,
        @WebParam(partName = "arg2", name = "arg2")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "http://webservice.web.com/", partName = "return")
    @WebMethod
    public DosageMonthArray getDosageMonth(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1,
        @WebParam(partName = "arg2", name = "arg2")
        java.lang.String arg2
    );

    @WebResult(name = "return", targetNamespace = "http://webservice.web.com/", partName = "return")
    @WebMethod
    public DosageDaysArray getDosageDays(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1,
        @WebParam(partName = "arg2", name = "arg2")
        java.lang.String arg2
    );
}
