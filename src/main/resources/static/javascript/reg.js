/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function reg(data) {
    const url = "http://localhost:8080/api/account/save";
    
    fetch(url, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: data
    })
        .then(res => res.json())
        .then(data => { 
            if (data.status === "done") {
                window.location.href = "/login";
            } else {
                alert("Ha ocurrido un error con el regitro");
            }
        })
        .catch(() => {
            alert("Ha ocurrido un error de conexión");
        });
}
function ckeckPassword() {
    return inputs[0].value === inputs[1].value ? true : false;
}

let form = document.querySelector("#formulario");
form.addEventListener('keydown', function(event) {
  if (event.key === 'Enter') {
    event.preventDefault();
  }
});
form.addEventListener('submit', function (event) {
  event.preventDefault();
  let dataForm = new FormData(form);
  let formBody = {"person": {}};
  for (const [key, value] of dataForm.entries()) {
      if (key === "email" || key === "password") {
          formBody[key] = value;
      } else {
          formBody.person[key] = value;
      }
  }

  if (ckeckPassword()) {
      reg(JSON.stringify(formBody));
  } else {
      alert("La confirmación de la contraseña es incorrecta");
  }
});

