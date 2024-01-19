<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../tag.jsp" %>
<c:set var="title" scope="request" value="Centrale-ish"/>
<jsp:include flush="true" page="../base.jsp"/>

<div class="container mt-5">
    <div class="row">
        <div class="col-6">
            <div class="container-img p-3">
                <img class="w-75"alt="${listing.title}" src="${listing.image}">
            </div>
        </div>
        <div class="col-6 justified-right">
            <h1>${listing.title}</h1>
        </div>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th scope="col">Model and Brand</th>
                    <th scope="col">Mileage</th>
                    <th scope="col">Price</th>
                    <th scope="col">Produced Year</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <p>${listing.model.name} ${listing.model.brand.name}</p>
                    </td>
                    <td>
                        <p>${listing.mileage}</p>
                    </td>
                    <td>
                        <p class="fs-2">${listing.price/100}€</p>
                    </td>
                    <td>
                        <p>${listing.producedYear}</p>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>

    <h2 class="my-5">Description</h2>

    <div class="text-center description">
        <c:out value="${listing.description}" escapeXml="false"/>
    </div>

</div>

<%@ include file="../footer.jsp" %>