<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		
		<form class="contacto" action="/result1" method="post" name="contact_form">
			<div> 
				<table class="tg">
				  <tr>
				    <th class="tg-30hw" colspan="3"> Test 3</th>
				  </tr>
				  <tr>
				    <th class="tg-30hw"> Parameter </th>
				    <th class="tg-30hw"> Expect<br>Value </th>
				    <th class="tg-30hw"> Actual<br>Value </th>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Rxy </td>
				    <td class="tg-chpy"> 0.954496574 </td>
				    <td class="tg-chpy"> ${A1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> R2 </td>
				    <td class="tg-chpy"> 0.91106371 </td>
				    <td class="tg-chpy"> ${A2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> significance </td>
				    <td class="tg-chpy"> 1.77517E-05 </td>
				    <td class="tg-chpy"> ${A3} </td>
				  </tr>
				   <tr>
				    <td class="tg-chpy"> B0 </td>
				    <td class="tg-chpy"> -22.55253275 </td>
				    <td class="tg-chpy"> ${A1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> B1 </td>
				    <td class="tg-chpy"> 1.727932426 </td>
				    <td class="tg-chpy"> ${A2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Yk </td>
				    <td class="tg-chpy"> 644.4293838 </td>
				    <td class="tg-chpy"> ${A3} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Range </td>
				    <td class="tg-chpy"> 230.0017197 </td>
				    <td class="tg-chpy"> ${A1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> UPI (70%) </td>
				    <td class="tg-chpy"> 874.4311035 </td>
				    <td class="tg-chpy"> ${A2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> LPI (70%) </td>
				    <td class="tg-chpy"> 414.427664 </td>
				    <td class="tg-chpy"> ${A3} </td>
				  </tr>
				</table>
			</div>
			<div><input type='submit' value='Calculate'></div>
		</form>
	</body>
</html>
