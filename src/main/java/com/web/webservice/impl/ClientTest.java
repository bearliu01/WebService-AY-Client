package com.web.webservice.impl;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;

import com.web.webservice.DosageMonth;
import com.web.webservice.DosageMonthArray;
import com.web.webservice.ReadMeter;
import com.web.webservice.interceptor.AddHeadInterceptor;


public class ClientTest {
	
	public static void main(String[] args) throws Exception{
		ReadMeterImplService server = new ReadMeterImplService();
		ReadMeter readMeter = server.getReadMeterImplPort();
		Client client = ClientProxy.getClient(readMeter);
	
		client.getOutInterceptors().add(new AddHeadInterceptor("001","123"));
		client.getInInterceptors().add(new LoggingInInterceptor());
		client.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//String res = readMeter.helloWord("lisi", "2222");
		//OperatorLog operatorLog = readMeter.findOperatorLogById("20160624000005");
		//String s = readMeter.meterHandle("641606100184", "2000", "1");
		
		//System.out.println("result="+s );
		
//		DosageMonthArray  dosageMonthArray= readMeter.getDosageMonth("641606100184", "2016-01", "2016-09");
//		List<DosageMonth> dosageMonthList = dosageMonthArray.getItem();
//		for(DosageMonth dosageMonth : dosageMonthList)
//		{
//			System.out.println(dosageMonth.getReadDt());
//		}
		
		//String s = readMeter.changeMeter(changeDt, arg1, arg2, arg3, arg4, arg5, arg6);
		
		//System.out.println(s);
	}

}
