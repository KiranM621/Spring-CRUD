<!doctype html>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>update page</title>
   
    
  </head>
  <body>
  
     
   <div class="container mt-5 text-center">
	<form action = "/employeeapi/saveupdate"  method="POST"> 
	  <div class="form-group">
	    <label for="number-empId">Employee Id</label>
	    <input type="number" class="form-control" id="input-id"   name="id" min = 1 max = 10000  value = "${empdata.id}">
	  </div>
	  <div class="form-group">
	    <label for="text-empName">Employee Name</label>
	    <input type="text" class="form-control" id="input-name"  name = "name" value = "${empdata.name}">
	  </div>
	  <div class="form-group">
		    <label for="text-empRole">Enter Role</label>
		    <input type="text" class="form-control" id="input-role"  name = "role" value = "${empdata.role}">
	  </div>
	  
	  <div class="form-group">
			<label for="text-empSex">Enter Role</label>
		    <input type="text" class="form-control" id="input-sex"  name = "sex" value = "${empdata.sex}">
		
		</div>
			  
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>