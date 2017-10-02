/**
 * Created by jmtapang on 9/29/17.
 */

$(function() {

    $('#login-form-link').click(function(e) {
        $("#login-form").delay(100).fadeIn(100);
        $("#register-form").fadeOut(100);
        $('#register-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });
    $('#register-form-link').click(function(e) {
        $("#register-form").delay(100).fadeIn(100);
        $("#login-form").fadeOut(100);
        $('#login-form-link').removeClass('active');
        $(this).addClass('active');
        e.preventDefault();
    });

    $('.multiple-items').slick({
        dots: true,
        autoplay: true,
        infinite: true,
        slidesToShow: 4,
        slidesToScroll: 1
    });

    $(".loader-overlay").delay(1000).fadeOut('slow');


    $('.cinema-select').change (function() {
        var el = $(".schedule-select").html('');
        var url = $(".screeningsUrl").val();
        var strEl="";
        $.ajax({
            type: "GET",
            url: url + $(this).val(),
            success: function(data){
                $.each(data, function(index) {
                    //alert(data[index].cinema.cinemaId);
                    strEl = $("<option/>", {
                        "data-cId": data[index].cinema.cinemaId,
                        value: data[index].screeningId,
                        text: timeConvert(data[index].screenStart)
                        + " - "
                        + timeConvert(data[index].screenEnd)});
                    el.append(strEl);
                });
            }
        });
    });

    $(".schedule-select").change(function(){
        var el = $(".seats-container");
        var url = $(".seatsUrl").val();
        var $rowEl=$("<div/>", {class: "seats-row"});
        var counter=1;
        var strEl="";
        var test;
        el.html('');
        $.ajax({
            type: "GET",
            url: url + $(this).find('option:selected').attr("data-cId"),
            success: function(data){
                $.each(data, function(index) {

                    $("<div/>", {
                        class: "seat-item",
                        text: data[index].seatName,
                        "data-cId": data[index].cinemaId,
                        "data-id": data[index].seatName
                    }).appendTo($rowEl);

                    if (counter % 10 === 0) {
                        $("<div/>", {
                            class: "seat-item inactive"
                        }).appendTo($rowEl);
                    }

                    if (counter % 20 === 0) {
                        //console.log("count : "+counter);
                        el.append($rowEl);
                        $rowEl = $("<div/>", {class: "seats-row"});
                    }
                    counter++;

                });
            }
        });
    });

    function timeConvert(millisecondDate){
        var time = new Date(millisecondDate);
        time = time.toLocaleString('en-US', { hour: 'numeric',minute:'numeric', hour12: true });
        console.log(time);
        return time;

    }

});

