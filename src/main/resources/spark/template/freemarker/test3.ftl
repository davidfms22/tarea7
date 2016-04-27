<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		
		<form class="contacto" action="/result3" method="get" name="contact_form">
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
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> R2 </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> significance </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C3} </td>
				  </tr>
				   <tr>
				    <td class="tg-chpy"> B0 </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> B1 </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Yk </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C3} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> Range </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C1} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> UPI (70%) </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C2} </td>
				  </tr>
				  <tr>
				    <td class="tg-chpy"> LPI (70%) </td>
				    <td class="tg-chpy"> n/a </td>
				    <td class="tg-chpy"> ${C3} </td>
				  </tr>
				</table>
			</div>
			<div><input type='submit' value='Calculate'></div>
		</form>
	</body>
</html>
