<%-- 
    Document   : index
    Created on : 09-09-2019, 11:05:00 AM
    Author     : david.riverafgkah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina de incio ABCDS</title>
    </head>
    <body>
        <h1>¡Bienvenido a la pagina ABCDS, Salvadoreña!</h1>
        <table border="0">
            <thead>
                <tr>
                    <th>ABCDS La nueva forma de ver las cosas.</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Agregando fotos personales, tipo de Recuerdos.</td>
                </tr>
                <tr>
                    <td><form action="response.jsp"> 
                            <strong>Selecciona la carpeta:</strong> 
                            <select name="subject_id">
                                <option>Recientes</option>
                                <option>Fotos</option>
                            </select>
                            <input type="submit" value="Ver" name="submit" />

                        </form></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>
