/*PROBLEMA 1*/

function validarn(e){
    var teclado = (document.all)?e.keyCode:e.which;
    if(teclado==8)return true;

    var patron=/[0-9\d .]/;

    var prueba= String.fromCharCode(teclado);
    return patron.test(prueba);
}

function interes(){
    var valor=document.formulario.cantidad.value;
    if( isNaN(valor) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }
    if( valor>37200000000000){
        alert("Ni el vaticano tiene tanto dinero xd. Ingresa algo valido")
        return false;
    }
    var result=parseInt(valor);
    var interes= result*0.02;
    var total=result+interes; 
    document.formulario.sueldoti.value="$"+total;
}

function borrar(){
    document.formulario.sueldoti.value="";
    document.formulario.cantidad.value="";
}


/*PROBLEMA 2*/
function validarnumero(e){
    var teclado2 = (document.all)?e.keyCode:e.which;
    if(teclado2==8)return true;

    var patron2=/[0-9\d .]/;

    var prueba2= String.fromCharCode(teclado2);
    return patron2.test(prueba2);
}


function calcularsueldo(){
    var valor2=document.Ventas.sueldobase.value;
    var result2=parseInt(valor2);

    if( isNaN(result2) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }

    if(result2>37200000000000){
        alert("Ni Mark Zukenberg gana tanto, ingresa algo bien *Inserta sticker de cerdito enojado")
        return false;
    }


    var valor21=parseInt(document.Ventas.productos.value);
    if( isNaN(valor21) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }

    if(valor21>37200000000000){
        alert("Ni amazon vende tanto, ingresa algo chido xd")
        return false;
    }
    if(valor21>=3){
        var sueldo=result2+(result2*.10);
    }else{
        var sueldo=result2
    }

    document.Ventas.sueldoti2.value="$"+sueldo;
}

function borrar2(){
    document.Ventas.sueldoti2.value="";
    document.Ventas.productos.value="";
    document.Ventas.sueldobase.value="";
}
