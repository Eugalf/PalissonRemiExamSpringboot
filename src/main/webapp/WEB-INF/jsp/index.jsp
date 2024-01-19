<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="tag.jsp" %>
<c:set var="title" scope="request" value="index"/>
<jsp:include flush="true" page="${contextPath}/WEB-INF/jsp/base.jsp"/>

<div class="container">
    <h1>Centrale-ish</h1>
    <h2 class="my-5">Les dernières annonces</h2>
        <div class="row mt-2">
            <c:forEach items="${announceReleased}" var="announce">
                <a class="col-3 mt-2 w-25 main-game-card" href="${s:mvcUrl('AppCar#show').arg(0, announce.id).build()}">
                    <div class="car-card">
                        <div class="car-card-img">
                            <img class="w-75" alt="${announce.title}" src="${announce.image}">
                        </div>
                        <table class="table table-bordered d-flex mt-2 justify-content-between">
                            <tbody>
                                <tr>
                                    <td>
                                        <p>${announce.model.name} ${announce.model.brand.name}</p>
                                    </td>
                                    <td>
                                        <p>${announce.price/100}€</p>
                                    </td>
                                    <td>
                                        <p>${announce.mileage}</p>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </a>
            </c:forEach>
        </div>
</div>

<%@ include file="footer.jsp" %>
