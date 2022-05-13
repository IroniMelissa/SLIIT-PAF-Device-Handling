<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "model.Device" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="Views/bootstrap.min.css">
<script src="Components/jquery-3.6.0.min.js"></script>
<script src="Components/main.js"></script>

<title>Insert title here</title>
</head>
<body>
    <div class="container"> 
        <div class="row">
           <div class="col-8"> 
               <h1 class="m-3">Save Your Device</h1> 
                  <form id="formDevice" name ="formDevice" method="post" action="index.jsp"> 
                       <div class="input-group mb-3 input-group-sm">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="lblDevice">Appliance:</span>
                           </div>
                           <input type="text" id="txtAppliance" name="txtAppliance" class="form-control">
                       </div>
                       <div class="input-group mb-3 input-group-sm">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="lblPower">Power Usage(W):</span>
                           </div>
                           <input type="text" id="txtPower" name="txtPower"  class="form-control">
                       </div>
                       <div class="input-group mb-3 input-group-sm">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="lblHrs">Usage Hours:</span>
                           </div>
                           <input type="text" id="txtHrs" name="txtHrs" class="form-control">
                       </div>
                       <div class="input-group mb-3 input-group-sm">
                          <div class="input-group-prepend">
                            <span class="input-group-text" id="lblNodevice">Number of Devices:</span>
                           </div>
                           <input type="text" id="txtNoDevices" name="txtNoDevices" class="form-control">
                       </div>
                     
                       <div id="alertError" class="alert alert-danger"></div>
                       
                      <input type="button" id="btnSave" name = "btnSave"  value="Save" class="btn btn-primary">
                      <input type="hidden" id="hidDeviceIDSave" name="hidDeviceIDSave" value="">
                      
                  </form>
             </div>
         </div>
 
         <br> 
       <div class="row">
          <div class="col-12" id="colDevices">
               <div class="divDevicesGrid">
                     <% 
                         Device deObj = new Device();
                         out.print(deObj.readDevices());
                          %>
                </div> 
 
            </div>
       </div>
   </div>
	
</body>
</html>