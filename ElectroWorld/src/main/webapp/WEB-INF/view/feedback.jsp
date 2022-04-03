 <!DOCTYPE html>
<html>
<head>
<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Cont at Us</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link rel='stylesheet' type='text/css' media='screen' href='main.css'>
<script src='main.js'></script>
</head>
<style>
* {
	padding-top: 10px;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
	color: rgb(60, 63, 64);
	background-color: #ebf2f5;
}
</style>
<body>
	<center>
		<div>
			<h1>Please Drop Your Feedback For Our Improvement</h1>
			<div>

				<form>
					<div>
						<label class="required" for="name">Your name:</label><br /> <input
							id="name" class="input" name="name" type="text" value=""
							size="30" /><br /> <span id="name_validation"
							class="error_message"></span>
					</div>
					<div>
						<label class="required" for="email">Your email:</label><br /> <input
							id="email" class="input" name="email" type="text" value=""
							size="30" /><br /> <span id="email_validation"
							class="error_message"></span>
					</div>
					<div>
						<label class="required" for="message">Your message:</label><br />
						<textarea id="message" class="input" name="message" rows="7"
							cols="30"></textarea>
						<br /> <span id="message_validation" class="error_message"></span>
					</div>
					<input id="submit_button" type="submit" value="Send email" />
				</form>
	</center>
</body>
</html>