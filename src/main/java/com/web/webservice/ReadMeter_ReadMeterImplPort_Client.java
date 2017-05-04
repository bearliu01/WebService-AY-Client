
package com.web.webservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import com.web.webservice.impl.ReadMeterImplService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-04-28T14:48:49.222+08:00
 * Generated source version: 3.1.11
 * 
 */
public final class ReadMeter_ReadMeterImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://impl.webservice.web.com/", "ReadMeterImplService");

    private ReadMeter_ReadMeterImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ReadMeterImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ReadMeterImplService ss = new ReadMeterImplService(wsdlURL, SERVICE_NAME);
        ReadMeter port = ss.getReadMeterImplPort();  
        
        {
        System.out.println("Invoking downloadData...");
        java.lang.String _downloadData_arg0 = "";
        int _downloadData_arg1 = 0;
        java.lang.String _downloadData_arg2 = "";
        java.lang.String _downloadData__return = port.downloadData(_downloadData_arg0, _downloadData_arg1, _downloadData_arg2);
        System.out.println("downloadData.result=" + _downloadData__return);


        }
        {
        System.out.println("Invoking changeMeter...");
        java.lang.String _changeMeter_arg0 = "";
        java.lang.String _changeMeter_arg1 = "";
        float _changeMeter_arg2 = 0.0f;
        java.lang.String _changeMeter_arg3 = "";
        float _changeMeter_arg4 = 0.0f;
        java.lang.String _changeMeter_arg5 = "";
        java.lang.String _changeMeter_arg6 = "";
        try {
            java.lang.String _changeMeter__return = port.changeMeter(_changeMeter_arg0, _changeMeter_arg1, _changeMeter_arg2, _changeMeter_arg3, _changeMeter_arg4, _changeMeter_arg5, _changeMeter_arg6);
            System.out.println("changeMeter.result=" + _changeMeter__return);

        } catch (Exception_Exception e) { 
            System.out.println("Expected exception: Exception has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking meterHandle...");
        java.lang.String _meterHandle_arg0 = "";
        java.lang.String _meterHandle_arg1 = "";
        java.lang.String _meterHandle_arg2 = "";
        java.lang.String _meterHandle__return = port.meterHandle(_meterHandle_arg0, _meterHandle_arg1, _meterHandle_arg2);
        System.out.println("meterHandle.result=" + _meterHandle__return);


        }
        {
        System.out.println("Invoking getDosageMonth...");
        java.lang.String _getDosageMonth_arg0 = "";
        java.lang.String _getDosageMonth_arg1 = "";
        java.lang.String _getDosageMonth_arg2 = "";
        com.web.webservice.DosageMonthArray _getDosageMonth__return = port.getDosageMonth(_getDosageMonth_arg0, _getDosageMonth_arg1, _getDosageMonth_arg2);
        System.out.println("getDosageMonth.result=" + _getDosageMonth__return);


        }
        {
        System.out.println("Invoking getDosageDays...");
        java.lang.String _getDosageDays_arg0 = "";
        java.lang.String _getDosageDays_arg1 = "";
        java.lang.String _getDosageDays_arg2 = "";
        com.web.webservice.DosageDaysArray _getDosageDays__return = port.getDosageDays(_getDosageDays_arg0, _getDosageDays_arg1, _getDosageDays_arg2);
        System.out.println("getDosageDays.result=" + _getDosageDays__return);


        }

        System.exit(0);
    }

}