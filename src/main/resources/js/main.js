$(document).ready(function () {

    function fillTheTable() {
        fetch("/rest/all")
            .then(response => response.json())
            .then(result => {
                $("#AllUsers > tbody").empty(); // Очистка таблицы перед заполнением
                for (let user of result) {
                    let newTr = `<tr>
                        <td>${user.id}</td>
                        <td>${user.firstName}</td>
                        <td>${user.lastName}</td>
                        <td>${user.email}</td>
                        <td>${user.age}</td>
                        <td>${user.password}</td>
                        <td>
                            <a href="/rest/get?id=${user.id}" class="btn btn-primary eBtn" style="color: white">Edit</a>
                        </td>
                        <td>
                            <a href="/rest/get?id=${user.id}" class="btn btn-danger dBtn">Delete</a>
                        </td>
                    </tr>`;
                    $("#AllUsers > tbody").append(newTr);
                }
            });
    }

    fillTheTable();
});