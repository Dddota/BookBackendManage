$(function () {
        $.ajax({
            url:"/getType",
            type:"post",
            dataType:"json",
            data:{"stuno":$("#stuno").val()},
            success:function (data) {
                $("#show_stuno_result").html(data.info);
            }
        })
    });