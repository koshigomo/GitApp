<%@ page contentType="text/html;charset=UTF-8"%>


<!DOCTYPE html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>姓名の登録</title>
</head>
<body>
    <h1>姓名の登録</h1>
    <form method="get" action="gitinputservlet">
        性<input type="text" name="firstName"/><br />
        名<input type="text" name="lastName"/> <br />
        <input type="submit" value="登録" >
    </form>
</body>
</html>