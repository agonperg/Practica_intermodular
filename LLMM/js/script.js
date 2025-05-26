// Función original para mostrar aviso
function mostrarAviso() {
    alert("Solo se puede jugar si eres mayor de 18 años.");
}

// Cargar imagen
var imagenUrl = "img/Portada.PNG";
var img = document.createElement("img");
img.src = imagenUrl;
img.className = "foto";
var div = document.getElementById("foto");
div.appendChild(img);

// Función para cambiar entre temas
function cambiarTema() {
    let body = document.body;
    
    if (body.classList.contains('tema-azul')) {
        body.classList.remove('tema-azul');
        alert("Tema cambiado a naranja (original)");
    } else {
        body.classList.add('tema-azul');
        alert("Tema cambiado a azul");
    }
}

// Crear botón para cambiar tema
window.onload = function() {
    let botonTema = document.createElement('button');
    botonTema.textContent = 'Cambiar tema';
    botonTema.onclick = cambiarTema;
    document.querySelector('.boton').appendChild(botonTema);
};



