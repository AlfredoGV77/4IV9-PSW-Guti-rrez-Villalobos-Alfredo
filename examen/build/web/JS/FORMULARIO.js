/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global myInput2 */

document.getElementById("btn__iniciar-sesion").addEventListener("click",iniciarSesion);
document.getElementById("btn__registrarse").addEventListener("click",register);

/*DECLARACION DE VARIABLES*/
var contenedor_login_register=document.querySelector(".contenedor__login-register");
var formulario_login= document.querySelector(".formulario__login");
var formulario_register= document.querySelector(".formulario__register");

var caja_trasera_login= document.querySelector(".caja__trasera-login");
var caja_trasera_register= document.querySelector(".caja__trasera-register");


function iniciarSesion(){
    formulario_register.style.display="none";
    contenedor_login_register.style.left="10px";
    formulario_login.style.display="block";
    caja_trasera_register.style.opacity="1";
    caja_trasera_login.style.opacity="0";

}




function register(){
    formulario_register.style.display="block";
    contenedor_login_register.style.left="410px";
    formulario_login.style.display="none";
    caja_trasera_register.style.opacity="0";
    caja_trasera_login.style.opacity="1";

}


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
  var myInput = document.getElementById('formulario2');  
  myInput.onpaste = function(e) {
    e.preventDefault();
    ///alert("Le quite la funcion de pegar, por si acaso. Me da amsiedad :(");
  };
  
  myInput.oncopy = function(e) {
    e.preventDefault();
  };
};


