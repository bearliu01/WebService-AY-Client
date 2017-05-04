
package com.web.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-04-28T14:48:49.256+08:00
 * Generated source version: 3.1.11
 */

@WebFault(name = "Exception", targetNamespace = "http://webservice.web.com/")
public class Exception_Exception extends java.lang.Exception {
    
    private com.web.webservice.Exception exception;

    public Exception_Exception() {
        super();
    }
    
    public Exception_Exception(String message) {
        super(message);
    }
    
    public Exception_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Exception_Exception(String message, com.web.webservice.Exception exception) {
        super(message);
        this.exception = exception;
    }

    public Exception_Exception(String message, com.web.webservice.Exception exception, Throwable cause) {
        super(message, cause);
        this.exception = exception;
    }

    public com.web.webservice.Exception getFaultInfo() {
        return this.exception;
    }
}