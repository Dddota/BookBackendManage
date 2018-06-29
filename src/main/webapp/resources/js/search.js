$(function () {
    $("#search_button").click(function () {
        $.post({
            url:"/search",
            datatype:"json",
            data:{"name":$("#search_name").val()},
            success:function (book) {
                var newtr="";
                for (var i =0;i<book.length;i++){
                    newtr +="<tr><td>"+book[i].bookCode+"</td><td>"+book[i].bookTypeName+"</td><td>"+book[i].bookName+"</td><td>"+book[i].bookAuthor+"</td><td>"+book[i].publishPress+"</td><td>"+book[i].creationTime+"</td><td>"+book[i].borrowed+"</td>"+toolbar(book[i].bookCode);
                }
                $("#table_list tr:not(:first)").remove();
                $("#table_list").append(newtr);
            },
            error:function (book) {
                alert("失败"+book)
            }
        })
    });
    function formatDate(time) {
        time=new Date(time);
        var y = time.getFullYear();
        var m = time.getMonth() + 1;
        m = m < 10 ? '0' + m : m;
        var d = time.getDate();
        d = d < 10 ? ('0' + d) : d;
        var h= time.getHours();
        h = h < 10 ?('0'+ h): h;
        var mm=time.getMinutes();
        mm = mm < 10 ?('0' + mm):mm;
        var s=time.getSeconds();
        s = s < 10 ?('0'+ s):s;
        return y + '-' + m + '-' + d+' '+h+':'+mm+':'+s;//这里可以写格式
    }
    function toolbar(bookcode) {
        var chakan="<td><a href='\check\'"+bookcode+">查看</a>";
        var xiugai="<a href='\\update\'"+bookcode+">查看</a>";
        var shanchu="<a href=\"javascript:\" onclick=\"if(confirm('确实要删除吗?'))location.href='/del/'+bookcode+\">删除</a></td>";
        return chakan+"&nbsp;&nbsp;"+xiugai+"&nbsp;&nbsp;"+shanchu;
    }
});