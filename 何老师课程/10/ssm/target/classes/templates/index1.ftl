<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table{
            background-color: lightsteelblue;
            border: 2px solid black;
        }
        #title-1{
            width: 100px;
            height: 30px;
        }
    </style>
    <script src="static/js/jquery-3.1.1.min.js"></script>
    <script>
        $(function(){
            $.ajax({
                type:'post',
                dataType:'json',
                async:false,
                data:{},
                url:'ajax',
                success:function(data){
                    var f=$("#all");
                    f.append("<table id='title'><tr><td id='title-1'>user_id</td><td id='title-1'>user_name</td><td id='title-1'>user_score</td><td id='title-1'>user_sex</td></tr>");
                    var list=data.list;
                    for (var i=0;i<list.length;i++){
                        f.append("<tr><td id='title-1'>"+list[i].userId+"</td><td id='title-1'>"+list[i].userName+"</td><td id='title-1'>"+list[i].userScore+"</td><td id='title-1'>"+list[i].userSex+"</td></tr>");
                    }
                    f.append("</table>");
                }
            });
        });
    </script>
</head>
<body>
    <div id="all">

    </div>
</body>
</html>