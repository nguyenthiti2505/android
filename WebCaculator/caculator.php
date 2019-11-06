<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
        <input type="text" id="result">
     	<br>
     		<input type="button" value="C">
     		<input type="button" class="operator" value="/" onclick="display('-')">
     		<input type="button" class="operator" name="doit" value="=" onclick="cal()">
     	<br>
	        <input type="button" value="1" onclick="display('1')">
	        <input type="button" value="2" onclick="display('2')">
	        <input type="button" value="3" onclick="display('3')">
	        <input type="button" class="operator" value="+" onclick="display('+')">
     	<br>
	        <input type="button" value="4" onclick="display('4')">
	        <input type="button" value="5" onclick="display('5')">
	        <input type="button" value="6" onclick="display('6')">
	        <input type="button" class="operator" name="minus" value="-" onclick="display('-')">

      	<br>
	        <input type="button" value="7" onclick="display('7')">
	        <input type="button" value="8" onclick="display('8')">
	        <input type="button" value="9" onclick="display('9')">
	        <input type="button" class="operator" value="x" onclick="display('*')">
        <br>
</body>
<script type="">
     function display(vl){
         document.getElementById("result").value+=vl;
     }

     function cal()
     {
     	var str = document.getElementById("result").value;
        var arr = str.split("+");
        var result = 0;
        for(var i = 0; i < arr.length ; i++){
            result +=parseInt(arr[i]);
        }
        document.getElementById("result").value = result;
     }
   </script>
</html>
