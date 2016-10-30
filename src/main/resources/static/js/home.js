$(document).ready(function(){
    $("#filter_criteria").on("change keyup",function(){
        $("tr").show().find("td.name").each(function(idx, e){
            if ($(e).html().match($("#filter_criteria").val()) == null) {
                $(e).parent("tr").hide();
            }
        })

    })


})
