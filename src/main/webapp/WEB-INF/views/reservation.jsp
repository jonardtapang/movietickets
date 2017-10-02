<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<div class="movie-body">
<div class="reserve-header">
    Reserve
</div>

<div id="reserve-div" class="movie-reserve" style="display: block;">

    <c:set var="screeningItems" value="${screenings}" />
    <c:set var="movie" value="${movie}" />
    <c:set var="cinemasItems" value="${cinemas}" />
    <c:set var="contains" value="" />
    <spring:url var="screeningByCinemaAndMovieUrl" value="/movie/reserve-seats/{movie_Id}/">
        <spring:param name="movie_Id" value="${movie.movieId}" />
    </spring:url>
    <spring:url var="seatsByCinemaId" value="/movie/seats/">
    </spring:url>
    <div class="detail-group">
        <select class="cinema-select" name="cinemaSelect">
            <%--<option value="none">Select Cinema</option>--%>
            <c:forEach var="cinema" items="${cinemasItems}" varStatus="loop">
                <option value="${cinema.cinemaId}" >${cinema.name}</option>
            </c:forEach>
        </select>
        <input type="hidden" class="screeningsUrl" value="${screeningByCinemaAndMovieUrl}" />

        <select class="schedule-select" name="scheduleSelect">
               <c:forEach var="screenings" items="${screeningItems}" varStatus="loop">
                   <c:if test="${loop.first}">
                        <c:set var="currItem" value="${screenings.cinema.name}"/>
                   </c:if>
                   <c:if test="${currItem.equals(screenings.cinema.name)}">
                       <option data-cId="${screenings.cinema.cinemaId}" value="${screenings.screeningId}" >
                           <fmt:formatDate value="${screenings.screenStart}" pattern="hh:mm a" />
                           -
                           <fmt:formatDate value="${screenings.screenEnd}" pattern="hh:mm a" />
                       </option>
                   </c:if>
               </c:forEach>
        </select>
        <input type="hidden" class="seatsUrl" value="${seatsByCinemaId}" />
    </div>
    <div class="cinema-container">
        <div class="option-screen">
            SCREEN AT THIS SIDE
        </div>
        <div class="seats-container seats-template"><div class="seats-row">
            <div class="seat-item" data-id="A1">A1</div>
            <div class="seat-item" data-id="A2">A2</div>
            <div class="seat-item" data-id="A3">A3</div>
            <div class="seat-item" data-id="A4">A4</div>
            <div class="seat-item" data-id="A5">A5</div>
            <div class="seat-item" data-id="A6">A6</div>
            <div class="seat-item" data-id="A7">A7</div>
            <div class="seat-item" data-id="A8">A8</div>
            <div class="seat-item inactive" data-id="A9">A9</div>
            <div class="seat-item" data-id="A10">A10</div>
            <div class="seat-item" data-id="A11">A11</div>
            <div class="seat-item" data-id="A12">A12</div>
            <div class="seat-item" data-id="A13">A13</div>
            <div class="seat-item" data-id="A14">A14</div>
            <div class="seat-item" data-id="A15">A15</div>
            <div class="seat-item" data-id="A16">A16</div>
            <div class="seat-item" data-id="A17">A17</div>
        </div>
            <div class="seats-row">
                <div class="seat-item" data-id="B1">B1</div>
                <div class="seat-item" data-id="B2">B2</div>
                <div class="seat-item" data-id="B3">B3</div>
                <div class="seat-item" data-id="B4">B4</div>
                <div class="seat-item" data-id="B5">B5</div>
                <div class="seat-item" data-id="B6">B6</div>
                <div class="seat-item" data-id="B7">B7</div>
                <div class="seat-item" data-id="B8">B8</div>
                <div class="seat-item inactive" data-id="B9">B9</div>
                <div class="seat-item" data-id="B10">B10</div>
                <div class="seat-item" data-id="B11">B11</div>
                <div class="seat-item" data-id="B12">B12</div>
                <div class="seat-item" data-id="B13">B13</div>
                <div class="seat-item" data-id="B14">B14</div>
                <div class="seat-item" data-id="B15">B15</div>
                <div class="seat-item" data-id="B16">B16</div>
                <div class="seat-item" data-id="B17">B17</div>
            </div>

        </div>
            <div class="seats-legend seats-template">
            <div class="seat-group">
                <div class="seat-item">
                </div>
                <p class="seat-label">
                    Available Seat
                </p>
            </div>
            <div class="seat-group">
                <div class="seat-item selected">
                </div>
                <p class="seat-label">
                    Selected Seat
                </p>
            </div>
            <div class="seat-group">
                <div class="seat-item reserved">
                </div>
                <p class="seat-label">
                    Unavailable Seat
                </p>
            </div>
        </div>
    </div>
    <div class="reservation-summary">
        <div class="detail-header">
            <p>Reservation Summary</p>
        </div>
        <div class="detail-group">
            <p class="detail-label">Screening:</p>
            <p class="reservation-movie">${movie.movieName}</p>
           <%-- <p class="reservation-time">1</p>--%>
        </div>
        <div class="detail-group">
            <p class="detail-label">Reserved Seats</p>
            <div class="selected-seats"><p>G10</p><p>G11</p></div>
        </div>
        <div class="detail-footer">
            <div class="btn lrg btn-primary confirm-reservation">Confirm Order</div>
        </div>
    </div>
</div>
</div>