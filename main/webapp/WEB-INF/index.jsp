<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quadratic</title>


    <style>
        fieldset {
            width: 800px;
            height: 400px;
            background: #F5F5F5;
            margin: auto;
        }
        textarea{
            width: 390px;
            height: 120px;
        }
        input{
            float: left;
            margin-right: 10px;
        }
        .text{
            float: left;
        }
    </style>
</head>
<body style="background-color: #F5F5F5">

<form action ="result" method = "POST">
    <div class="brd" >
         <fieldset >
             <!--<legend></legend>-->
            <center><H2>Вычисление корней квадратного уравнения вида</H2></center>
            <br><center>ax^2 + bx + c = 0</center>
            <br>
            <br>
            К примеру, у уравнения x^2 − 2x − 3 = 0 будут такие значения: A = 1,  B = -2, C = -3 ;
            <br>
            <br>
            А у уравнения -2x^2 + 8x − 6 = 0 будут такие значения: A = -2,   B = 8 ,  C = -6 ;
            <br>
            <br>

            <br><b class="text">Введите параметр А: </b><input type="text" name="valueA"></br>
            <br><b class="text">Введите параметр B: </b><input type="text" name="valueB"></br>
            <br><b class="text">Введите параметр C: </b><input type="text" name="valueC"></br>

            <p><input type = "submit" value="Рассчитать"></p>
     </fieldset>
  </div>
</form>

</body>
</html>