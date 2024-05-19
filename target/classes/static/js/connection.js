

const sendUser = async (jsonBody)=>{
    const postUser = await fetch("/basic",{
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(jsonBody)
    });
    let response =  await postUser;
    if (!response.ok){
        alert("No se ha registrado el usuario, codigo de estado" + response.status);
        return;
    }
    else{
        alert("Usuario registrado correctamente");
    }
}



document.addEventListener("DOMContentLoaded", ()=>{
    document.getElementById("send").addEventListener("click", ()=>{
        let nombre = document.getElementById("nombre").value;
        let apellido = document.getElementById("apellido").value;
        let direccion = document.getElementById("direccion").value;
        let fecha_nacimiento = document.getElementById("fecha_nacimiento").value;



        let jsonUsuario ={
            nombre: nombre,
            apellido: apellido,
            direccion: direccion,
            fecha_nacimiento: fecha_nacimiento,
        }
        sendUser(jsonUsuario);


    })
})