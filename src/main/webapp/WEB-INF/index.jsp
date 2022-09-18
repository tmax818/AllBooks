

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>All Books</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Language</th>
        <th>Number of Pages</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="oneBook" items="${books}">
        <tr>

        <td><c:out value="${oneBook.id}"></c:out></td>
        <td>
            <a href="/books/${oneBook.id}">
            <c:out value="${oneBook.title}"></c:out>
            </a>
        </td>
        <td><c:out value="${oneBook.language}"></c:out></td>
        <td><c:out value="${oneBook.numberOfPages}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
