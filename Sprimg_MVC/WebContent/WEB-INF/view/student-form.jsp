<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>


<head>
<title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">


First Name: <form:input path="firstName"/>

<br> <br>

Last Name: <form:input path="lastName"/>

<br> <br>

Country: 
<form:select path="country">

<form:options items="${student.countryOptions}" />


</form:select>

<br> <br>

Favorite Language: 

Java <form:radiobutton path="favoriteLanguage" value="java" />
C# <form:radiobutton path="favoriteLanguage" value="c#" />
PHP <form:radiobutton path="favoriteLanguage" value="php" />
Ruby <form:radiobutton path="favoriteLanguage" value="ruby" />


<br> <br>

Operation Systems: 

Linux <form:checkbox path="operationSystem" value="linux" />
Mac OS <form:checkbox path="operationSystem" value="MacOS" />
MS Windows <form:checkbox path="operationSystem" value="MSWindows" />




<br> <br>

<input type="submit" value="Submit" />

</form:form>


</body>







</html>