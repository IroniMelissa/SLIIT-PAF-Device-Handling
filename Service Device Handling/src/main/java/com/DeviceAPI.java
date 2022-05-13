package com;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Device;


 
@WebServlet("/DeviceAPI")
public class DeviceAPI extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException 
			{ 
		     Device dObj = new Device();
			 String output = dObj.insertDevice(request.getParameter("device"), 
			 request.getParameter("powerUsage"), 
			request.getParameter("hours"), 
			request.getParameter("noOfdevices")); 
			response.getWriter().write(output); 
			}
	
	// Convert request parameters to a Map
	private static Map<String, String> getParasMap(HttpServletRequest request) 
	{ 
	      Map<String, String> map = new HashMap<String, String>(); 
	  try
	 { 
	         Scanner scanner = new Scanner(request.getInputStream(), "UTF-8"); 
	         String queryString = scanner.hasNext() ? 
	         scanner.useDelimiter("\\A").next() : ""; 
	         scanner.close(); 
	     String[] params = queryString.split("&"); 
	     for (String param : params) 
	    {
		       String[] p = param.split("="); 
	          map.put(p[0], p[1]); 
	    } 
	 } 
	 catch (Exception e) 
	 { 
		 
	 } 
	return map; 
	}
	
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException 
			{ 
			 Map<String, String> paras = getParasMap(request); 
			 Device dObj = new Device();
			 String output = dObj.UpdateDevice(paras.get("hidDeviceIDSave").toString(), 
			 paras.get("device").toString(), 
			paras.get("powerUsage").toString(), 
			paras.get("hours").toString(), 
			paras.get("noOfdevices").toString()); 
			response.getWriter().write(output); 
			} 

	
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException, IOException 
			{ 
			 Map<String, String> paras = getParasMap(request); 
			 Device dObj = new Device();
			 String output = dObj.deleteDevice(paras.get("deviceID").toString()); 
			response.getWriter().write(output); 

	
			}
	
	
	
	
	}
