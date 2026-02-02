const API = "http://localhost:8080";

function register() {
    const user = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    fetch(API + "/register", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)
    })
    .then(res => res.text())
    .then(msg => {
        alert(msg);
        window.location = "login.html";
    })
    .catch(err => alert(err));
}

function login() {
    const user = {
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    fetch(API + "/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)
    })
    .then(res => res.text())
    .then(msg => {
        alert(msg);

        if(msg.includes("Successful")){
            window.location = "dashboard.html"; // optional
        }
    })
    .catch(err => alert(err));
}

function login() {
    const user = {
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    fetch(API + "/login", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(user)
    })
    .then(res => res.text())
    .then(msg => {
        alert(msg);

        if (msg.includes("Successful")) {
            window.location = "thanks.html"; // redirect
        }
    });
}
