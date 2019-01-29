<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <title>Test</title>
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script>
            var files = "${jsonArray}";
            $(document).ready(function() {
                var table = $('<table/>').appendTo($('#somediv'));
                $(files).each(function(i, file) {
                    $('<tr/>').appendTo(table)
                        .append($('<td/>').text(file.filename))
                        .append($('<td/>').text(file.id))
                        .append($('<td/>').text(file.type))
                        .append($('<td/>').text(file.size))
                        .append($('<td/>').text(file.os));
                });
            });
        </script>
    </head>
    <body>
        <div id="somediv"></div>
    </body>
</html>