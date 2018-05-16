<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h1>test1</h1>
    <fieldset>
    	<legend>Hello</legend>
	    <form method="POST" action="/data">
	    <p><label>Your Name: <input type="text" name="name"></label></p>
	    <p><label>Dojo Location: <input type="text" name="location"></label></p>
	    <p><label>Favorite Language: 
			  <select name="language">
			  <option value="python">Python</option>
			  <option value="java">Java</option>
			  <option value="c">C</option>
			  <option value="ruby">Ruby</option>
			  </select>
	  	</label></p>
	  	<p><label>Comment (Optional): </label><textarea name="comment"></textarea></p>
	    <button>Submit</button>
		</form>
		
	</fieldset>

</body>
</html>