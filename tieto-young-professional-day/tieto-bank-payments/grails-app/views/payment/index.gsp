<html>
	<head>
	
		<style>
			table {
				border-collapse: collapse;
			}
			th, td {
				border: 1px black solid;
				padding: 3px;
			}
		</style>
	</head>
	<body>

		<g:if test="${session.user}">
			<g:link controller="User" action="logout">logout</g:link>
		</g:if>

		<table>
			<tr>
				<th>From</th>
				<th>To</th>
				<th>Date</th>
				<th>Amount</th>
				<th></th>
			</tr>
		
			<g:each in="${payments}" var="payment">
				<tr>
					<td>${payment.from.owner.name}</td>
					<td>${payment.to.owner.name}</td>
					<td>${payment.date.format("dd.MM.yyyy HH:mm:ss")}</td>
					<td>${payment.amount}</td>
					<td><g:link action="remove" id="${payment.id}">remove</g:link></td>
				</tr>
			</g:each>
		</table>
		
	</body>		
</html>