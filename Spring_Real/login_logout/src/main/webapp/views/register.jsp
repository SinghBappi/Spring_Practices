    <!DOCTYPE html>
    <html lang="en">
        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Contuct us</title>
            <link rel="stylesheet" href="/css/style.css">

        </head>
        <body class="body">
            <h4>Registeration Page</h4>
            <c:if test="${not empty successMsg}">
                <h4 style="color:green">${successMsg}</h4>
            </c:if>
            <c:if test="${not empty errorMsg}">
                <h4 style="color:red">${errorMsg}</h4>
            </c:if>
            <form method="post" action="regform">
                Name: <input type="text" name="name"/>
                <br/>
                Email: <input type="text" name="email"/><br/>
                Password: <input type="password" name="password"/><br/>
                Phone no: <input type="text" name="phoneno"/><br/>
                <input type="submit" value="Register"/><br/>
                <br><br>
                If already registered ... <a href="loginPage">Click Here !</a>

            </form>
        </body>
    </html>

