/* global myInput2 */

function validarn(e){
    var teclado = (document.all)?e.keyCode:e.which;
    if(teclado==8)return true;

    var patron=/[0-9\d]/;
    var prueba= String.fromCharCode(teclado);
    return patron.test(prueba);
}


function validarabc(e){
    var teclado = (document.all)?e.keyCode:e.which;
    if(teclado==8)return true;

    var patron=/[a-zA-Z\s ]/;

    var prueba= String.fromCharCode(teclado);
    return patron.test(prueba);
}



window.onload = function() {
  var myInput = document.getElementById('formulario');  
  myInput.onpaste = function(e) {
    e.preventDefault();
    alert("Le quite la funcion de pegar, por si acaso. Me da amsiedad :(");
  };
  
  myInput.oncopy = function(e) {
    e.preventDefault();
  };
};




///var nombre, apellidomat, apellidopat, correo,edad, expresion;
const nombre=document.getElementById("nombre").value;
const apellidomat=document.getElementById("apmat").value;
const apellidopat=document.getElementById("appat").value;
const correo=document.getElementById("correo").value;
const edad=parseInt(document.getElementById("edad").value);


