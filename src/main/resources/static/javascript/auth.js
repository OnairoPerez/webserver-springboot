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
                alert("Contraseña incorrecto");
            } else if (data.status === "user-not-found") {
                alert("Usuario incorrecto");
            } else {
                console.log("Ha ocurrido un error");
            }
        })
        .catch(() => {
            console.log("Ha ocurrido un error con la petición");
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
    console.log(formBody);
    auth(JSON.stringify(formBody));  
});



