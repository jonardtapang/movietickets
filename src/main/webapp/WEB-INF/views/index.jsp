<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<main role="main">

	<h2 class="section-title">Now Showing</h2>

		<div class="movie-container slider multiple-items">
			<c:forEach var="movie" items="${movies}">
				<div class="">
					<spring:url var="movieInfoUrl" value="/movie/{movieId}">
						<spring:param name="movieId" value="${movie.movieId}" />
					</spring:url>
					<a href="${movieInfoUrl}" class="movie-item" data-id="2">
						<div class="movie-content">
							<img src="${movie.img_link}" width="100%" height="100%" />
							<div class="movie-header">
								<p class="title">${movie.movieName}</p>
								<div class="movie-rating ${fn:toLowerCase(movie.rating)}">
									${movie.rating}
								</div>
							</div>
						</div>
					</a>
				</div>
			</c:forEach>


<%--
			<div>
				<a href="movie-page.html" class="movie-item" data-id="3">
					<div class="movie-content">
						<img src="http://tickets.smcinema.com/BookingCMS/Images/patay%20na%20si%20hesus_20170727115616.JPG" width="100%" height="100%" />
						<div class="movie-header">
							<p class="title">Patay na si Hesus 3</p>
							<div class="movie-rating rating-spg">
								SPG
							</div>
						</div>
					</div>
				</a>
			</div>

			<div>
				<a href="movie-page.html" class="movie-item" data-id="4">
					<div class="movie-content" >
						<img src="http://tickets.smcinema.com/BookingCMS/Images/patay%20na%20si%20hesus_20170727115616.JPG" width="100%" height="100%" />
						<div class="movie-header">
							<p class="title">Patay na si Hesus The 4th</p>
							<div class="movie-rating rating-r-13">
								R-13
							</div>
						</div>
					</div>
				</a>
			</div>

			<div>
				<a href="movie-page.html" class="movie-item" data-id="4">
					<div class="movie-content" >
						<img src="http://tickets.smcinema.com/BookingCMS/Images/patay%20na%20si%20hesus_20170727115616.JPG" width="100%" height="100%" />
						<div class="movie-header">
							<p class="title">Patay na si Hesus The 4th</p>
							<div class="movie-rating rating-r-13">
								R-13
							</div>
						</div>
					</div>
				</a>
			</div>
--%>

		</div>
		<%-- End of Slider/ Movie-container--%>

		<%--



		--%>
</main>