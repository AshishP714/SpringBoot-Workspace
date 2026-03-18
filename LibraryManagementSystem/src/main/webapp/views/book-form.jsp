	

	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
<div> 

<form action="search">

<p style="color:red">${msg}</p>

<label>Enter Id:</label>
<input type="text" name="id" placeholder="Enter Book Id">


<input type="submit"  value="Search">




</form>

<p>
Book ID -> ${book.id} 
Book Name -> ${book.name}
Book price -> ${book.price}
Book quantity -> ${book.qty}

</p>
</div>
</body>
</html>