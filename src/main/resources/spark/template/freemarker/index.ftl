<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		<form class="contacto" method="post" name="contact_form">
			<div>
				<input type='submit' value='Test1' onclick='this.form.action="/test1";'>
				<input type='submit' value='Test2' onclick='this.form.action="/test1";'>
				<input type='submit' value='Test3' onclick='this.form.action="/test1";'>
				<input type='submit' value='Test4' onclick='this.form.action="/test1";'>
			</div>
		</form>
		
	</body>
</html>
