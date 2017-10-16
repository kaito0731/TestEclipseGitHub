<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Emotion API Sample</title>
 <link rel="stylesheet" href="../css/site.css">
    <script src="../scripts/jquery-3.1.0.min.js"></script>
    <script src="../scripts/script.js"></script>
    <script type="../text/javascript" language="javascript">


    </script>
</head>
<body>
 <form action="" name="searchForm">
    <div class ="searchFrame">
        <h1>EmotionAPI</h1>

    <input type="url" id="imageUrlTextbox" class="urlinput">
    <input type="reset" name="bt01" value="delete" autofocus>
    <div class="clearButton" onclick="clearButtonClick()"></div>
    </div>

    <table>
            <tr>
                <td class="OutputTh">
                    <!--出力結果-->
                    <div id="OutputDiv">Output</div>
                    <input type="text" name="anger" id="anger" />
                    <input type="text" name="contempt" id="contemt" />
                    <input type="text" name="disgust" id="disgust" />
                    <input type="text" name="fear" id="fear" />
                    <input type="text" name="happiness" id="happiness" />
                    <input type="text" name="neutral" id="neutral" />
                    <input type="text" name="sadness" id="sadness" />
                    <input type="text" name="surprise" id="surprise" />
                </td>
                <td>
                    <!--出力画像-->
                    <div id="PhotoDiv">
                    <img id="ImageToAnalyze">
                    <img src="../image/Rectangle.png" id="Rectangle">
                    </div>
                </td>
            </tr>
        </table>
        </form>
</body>
</html>