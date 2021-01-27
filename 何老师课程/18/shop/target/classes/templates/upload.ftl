<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>上传</title>
    <script>
        function insertData(){
            //file需要验证先验证文件类型和文件大小。
            var f = document.getElementById("file").files[0];
            console.log("name:"+f.name);//文件名
            console.log("size:"+f.size/1024);//文件大小
            var k=f.name.split(".");//以.作为分隔符
            var k1=k[k.length-1];//无论多少个元素只去最后一个
            console.log("后缀名:"+k1);//后缀名
            if(k1!='jpg'){
                alert("我只能接受得了jpg的文件")
            }else if(f.size/1024>30){
                alert("我只能接受得了30kb以内的文件");
                return false;
            }else{
                document.getElementById("form1").submit();
            }
        }
    </script>
</head>
<body>
<#--上传必须是post请求，enctype必须设置multipart/form-data表示整个form表达中含有二进制文件需要上传-->

<#--    上传的文件必须是jpg后缀，上传大小必须在30kb以内-->
    <form action="insertPerson" method="post" enctype="multipart/form-data" id="form1">
        <p>昵称:<input type="text" name="nickName"></p>
        <p>头像:<input type="file" id="file" name="attr"></p>
        <p><input type="button" value="提交" onclick="insertData();"></p>
    </form>
</body>
</html>