function auth(data) {
    const url = "http://localhost:8080/api/account/verify";
    
    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: data
    })
        .then(res => res.json())
        .then(data => { 
            if (data.status === "correct-data") {
                window.location.href = "/home";
            } else if (data.status === "incorrect-password") {
                alert("Contraseña incorrecta");
            } else if (data.status === "user-not-found") {
                alert("Usuario incorrecto");
            } else {
                alert("Ha ocurrido un error");
            }
        })
        .catch(() => {
            alert("Ha ocurrido un error de conexión");
        });
}

const form = document.querySelector("#container");
form.addEventListener('submit', function (event) {
    event.preventDefault();
    let dataForm = new FormData(form);
    let formBody = {};
    for (const [key, value] of dataForm.entries()) {
        formBody[key] = value;
    }
    
    auth(JSON.stringify(formBody));  
});



