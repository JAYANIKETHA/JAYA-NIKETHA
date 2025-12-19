const API_URL = "http://localhost:54442/api/employees";
let editId = null;

// Load employees
function loadEmployees() {
    fetch(API_URL)
        .then(res => res.json())
        .then(data => {
            const table = document.getElementById("empTable");
            table.innerHTML = "";
            data.forEach(emp => {
                table.innerHTML += `
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.email}</td>
                    <td>
					<button class="action-btn" onclick="editEmployee(${emp.id}, '${emp.name}', '${emp.email}')">
					  Edit
					</button>

                    </td>
                </tr>`;
            });
        });
}

function editEmployee(id, name, email) {
    document.getElementById("name").value = name;
    document.getElementById("email").value = email;
    editId = id;
}

function addEmployee() {
    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;
    const leaveStatus = document.getElementById("leaveStatus").value;
    const salary = document.getElementById("salary").value;

    if (editId === null) {
        // ADD employee
        fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ name, email, leaveStatus, salary })
        }).then(() => loadEmployees());

    } else {
        // UPDATE employee
        fetch(`${API_URL}/${editId}`, {
            method: "PUT",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ name, email, leaveStatus, salary })
        }).then(() => {
            editId = null;
            loadEmployees();
        });
    }

    document.getElementById("name").value = "";
    document.getElementById("email").value = "";
    document.getElementById("leaveStatus").value = "";
    document.getElementById("salary").value = "";
}
