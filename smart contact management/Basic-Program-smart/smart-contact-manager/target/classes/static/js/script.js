const toggleSidebar = () => {

    if ($(".sidebar").is(":visible")) {
        //then we have to close
        $(".sidebar").css("display", "none");
        $(".content").css("margin-left", "0%");
    } else {
        //we have to show
        $(".sidebar").css("display", "block");
        $(".content").css("margin-left", "20px");
    }
}