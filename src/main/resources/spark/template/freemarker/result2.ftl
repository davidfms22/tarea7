<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		
		<form class="contacto" action="/" method="get" name="contact_form">
			<div> 
				<table class="tg">
				  <tr>
				    <th class="tg-30hw" colspan="3"> Test 2</th>
				  </tr>
				  <tr>
				    <th class="tg-30hw"> Parameter </th>
				    <th class="tg-30hw"> Expect<br>Value </th>
				    <th class="tg-30hw"> Actual<br>Value </th>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Rxy </td>
				    <td class="tg-chpy"> 0.933306898 </td>
				    <td class="tg-chpy"> ${B1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> R2 </td>
				    <td class="tg-chpy"> 0.871061766 </td>
				    <td class="tg-chpy"> ${B2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> significance </td>
				    <td class="tg-chpy"> 7.98203E-05 </td>
				    <td class="tg-chpy"> ${B3} </td>
				  </tr>
				   <tr>
				    <td class="tg-chpy"> B0 </td>
				    <td class="tg-chpy"> -4.038881575 </td>
				    <td class="tg-chpy"> ${B4} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> B1 </td>
				    <td class="tg-chpy"> 0.16812665 </td>
				    <td class="tg-chpy"> ${B5} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Yk </td>
				    <td class="tg-chpy"> 60.85800528 </td>
				    <td class="tg-chpy"> ${B6} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Range </td>
				    <td class="tg-chpy"> 27.55764748 </td>
				    <td class="tg-chpy"> ${B7} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> UPI (70%) </td>
				    <td class="tg-chpy"> 88.41565276 </td>
				    <td class="tg-chpy"> ${B8} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> LPI (70%) </td>
				    <td class="tg-chpy"> 33.3003578 </td>
				    <td class="tg-chpy"> ${B9} </td>
				  </tr>
				</table>
			</div>
			<div><input type='submit' value='Back'></div>
		</form>
	</body>
</html>
