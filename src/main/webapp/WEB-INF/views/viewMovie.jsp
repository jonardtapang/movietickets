<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/_taglibs.jspf" %>

<main role="main">

    <c:set var="screeningItems" value="${screenings}" />
    <c:set var="movie" value="${movie}" />
    <spring:url var="reservedUrl" value="/movie/reserve-seats/{movieId}">
        <spring:param name="movieId" value="${movie.movieId}" />
    </spring:url>
    <div class="movie-container">
        <h2 class="section-title">
            ${movie.movieName}
            <span class="movie-rating ${fn:toLowerCase(movie.rating)}">${movie.rating}</span>
                <a href="${reservedUrl}" class="btn btn-primary" role="button">Reserve Seat</a>
        </h2>

        <div class="movie-body">
            <div class="movie-details">
                <div class="detail-group">
                    <p class="detail-label">Screenings</p>
                    <div class="screenings">

                        <c:set var="contains" value="" />
                        <c:forEach var="screening" items="${screeningItems}">
                            <c:choose>
                                <c:when test="${screening.cinema.name ne contains}">
                                    <div class="screening-item">
                                    <div class="screening-header">${screening.cinema.name}</div>
                                    <c:set var="contains" value="${screening.cinema.name}" />
                                        <div class="screening-schedule" data-cinema="${loop.index} ">
                                        <c:forEach var="screening" items="${screeningItems}">
                                            <c:choose>
                                                <c:when test="${screening.cinema.name eq contains}">
                                                    <div class="schedule-item" data-schedule-id="${loop.index}">
                                                        <fmt:formatDate value="${screening.screenStart}" pattern="hh:mm a" />
                                                        -
                                                        <fmt:formatDate value="${screening.screenEnd}" pattern="hh:mm a" />
                                                    </div>
                                                </c:when>
                                    <%--            <c:otherwise>

                                                </c:otherwise>--%>
                                            </c:choose>

                                        </c:forEach>
                                         </div>
                                    </div>
                                </c:when>
                       <%--         <c:otherwise>

                                </c:otherwise>--%>
                            </c:choose>
                        </c:forEach>

                    </div>
                </div>
                <div class="detail-group">
                    <p class="detail-label">Description</p>
                    <p class="synopsis">${movie.description}</p>
                </div>
                <div class="detail-group">
                    <p class="detail-label">Running Time</p>
                    <p class="running-time">${movie.duration}</p>
                </div>
                <div class="detail-group">
                    <p class="detail-label">Genre</p>
                    <p class="genre">${movie.genre}</p>
                </div>
                <div class="detail-group">
                    <p class="detail-label">Director</p>
                    <p class="cast">${movie.director}</p>
                </div>
                <%--<div class="detail-group">
                    <p class="detail-label">Release Date</p>
                    <p class="release-date">August 16, 2017</p>
                </div>--%>
            </div>
            <div class="movie-poster">
                <img src="${movie.img_link}" alt="${movie.movieName}">
            </div>
        </div>
    </div>
</main>