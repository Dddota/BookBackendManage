$(function () {
    var now = new Date();
//格式化日，如果小于9，前面补0
    var day = ("0" + now.getDate()).slice(-2);
    var month = ("0" + (now.getMonth() + 1)).slice(-2);
//拼装完整日期格式
    var hour=("0" + now.getHours()).slice(-2);
    var minutes=("0" + now.getMinutes()).slice(-2);
    var today = now.getFullYear()+"-"+(month)+"-"+(day)+"T"+(hour)+":"+(minutes);
//完成赋值
    $("#time").val(today)
});