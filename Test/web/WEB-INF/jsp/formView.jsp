<%-- 
    Document   : nameView
    Created on : Oct 9, 2015, 7:48:44 AM
    Author     : LabGSG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Masukkan Data Barang</title>
    </head>
    <body>
        <h1>Masukkan Data Barang</h1>
        <spring:nestedPath path="produk">
            <form action="" method="post">
                <table>
                    <tr>
                        <td>Kode Produk</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="kode">
                            <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>Nama Produk</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="nama">
                            <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>Harga</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="harga">
                            <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                    <tr>
                        <td>Stok</td>
                        <td>:</td>
                        <td>
                            <spring:bind path="stok">
                            <input type="text" name="${status.expression}" value="${status.value}">
                            </spring:bind>
                        </td>
                    </tr>
                </table>
                    <input type="submit" value="OK">
            </form>
        </spring:nestedPath>
    </body>
</html>
