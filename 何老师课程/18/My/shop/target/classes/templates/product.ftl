<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script>
        function upload(){
            var productName=$("#productName").val().trim();
            var file=$("#file").get(0).files[0];
            var productPrice=$("#productPrice").val().trim();
            if (productName==""&&productPrice==""){
               alert("请输入商品名称和价格");
            }
            else {
                if(file){
                    $("#form1").submit();
                }else{
                    alert("请选择图片");
                }
            }
        }
    </script>
</head>
<body>
<form action="insertProduct" method="post" enctype="multipart/form-data" id="form1">
    <p>商品名称:<input type="text" name="productName" id="productName"></p>
    <p>图片:<input type="file" name="attr" id="file"></p>
    <p>商品单价:<input type="text" name="productPrice" id="productPrice"></p>
</form>
<p><input type="button" value="提交" onclick="upload()"></p>
</body>
</html>