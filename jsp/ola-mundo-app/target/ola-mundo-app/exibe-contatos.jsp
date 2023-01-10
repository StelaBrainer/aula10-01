<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*,com.ola.mundo.app.dao*,com.ola.mundo.app.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Meu primeiro JSP</title>

</head>

<body>

    <table>
        <!--Criando instancia da classe contatoDao-->
        <jsp:useBean id="dao" class="com.ola.mundo.app.dao.ContatoDao" />
        <!--ContatoDao dao = new Contato(); O que está em cima é o mesmo que essa instanciação no java-->
        <c:forEach var="contato" items="${dao.lista}">
        <tr>
            <td>${contato.nome}</td>
            <td>
                <c:if test="${not empty contato.email}">
                <a href="mailto:${contato.email}">${contato.email}</a>
                </c:if>
            </td>
            <td>
                <c:choose>
                    <c:when test="${not empty contato.endereco}">
                        <i>${contato.endereco}</i>
                    </c:when>
                    <c:otherwise>
                        Endereço não informado
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />
            </td>
        </tr>
        </c:forEach>
    </table>
</body>

</html>