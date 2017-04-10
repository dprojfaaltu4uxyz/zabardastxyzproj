var Classes = {};

Classes.onSubmit = function(){
	$.ajax({
		  type: "post",
		  url: "http://localhost:8080/DreamProject/newclass",
		  cache: false,    
		  data:'teacherId =' + $("#teacher").val() + "&classes;=" + $("#classes").val() + "&classesNumeric;=" + $("#classesNumeric").val()
		   + "&note;=" + $("#note").val(),
		  success: function(response){
			  
			  console.log(response);
		  /* $('#result').html("");
		   var obj = JSON.parse(response);
		   $('#result').html("First Name:- " + obj.firstName +"</br>Last Name:- " + obj.lastName  + "</br>Email:- " + obj.email);*/
		  },
		  error: function(){      
		   alert('Error while request..');
		  }
		 });
}