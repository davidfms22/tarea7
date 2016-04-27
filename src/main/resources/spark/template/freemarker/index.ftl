<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		<form class="contacto" method="post" name="contact_form">
			<div>
				<th class="tg-30hw"> Please select one of the tests </th>
			</div>
			<div>
				<input type='submit' value='Test-1' onclick='this.form.action="/toTest1";'>
				<input type='submit' value='Test-2' onclick='this.form.action="/toTest2";'>
				<input type='submit' value='Test-3' onclick='this.form.action="/toTest3";'>
				<input type='submit' value='Test-4' onclick='this.form.action="/toTest4";'>
			</div>
		</form>
		
	</body>
</html>
