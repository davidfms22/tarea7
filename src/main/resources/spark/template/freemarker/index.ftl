<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		
		<form class="contacto" action="/calcular" method="post" name="contact_form">
			<div> 
				<table class="tg">
				  <tr>
				    <th class="tg-30hw"> Test </th>
				    <th class="tg-30hw"> Parameter </th>
				    <th class="tg-30hw"> Expect<br>Value </th>
				    <th class="tg-30hw"> Actual<br>Value </th>
				  </tr>
				  <tr>
				    <td class="tg-bgso" rowspan="3"> test1 </td>
				    <td class="tg-chpy"> 6 </td>
				    <td class="tg-chpy"> 0.55338 </td>
				    <td class="tg-chpy"> ${A1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> 15 </td>
				    <td class="tg-chpy"> 1.75305 </td>
				    <td class="tg-chpy"> ${A2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> 4 </td>
				    <td class="tg-chpy"> 4.60409 </td>
				    <td class="tg-chpy"> ${A3} </td>
				  </tr>
				</table>
			</div>
			<div><input type='submit' value='Calculate'></div>
		</form>
	</body>
</html>
