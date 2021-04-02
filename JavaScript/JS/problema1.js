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

function validarnumero2(e){
    var teclado21 = (document.all)?e.keyCode:e.which;
    if(teclado21==8)return true;

    var patron21=/[0-9\d .]/;

    var prueba21= String.fromCharCode(teclado21);
    return patron21.test(prueba21);
}

function calcularsueldo(){
    var valor2=document.Ventas.sueldobase.value;
    var result2=parseInt(valor2);

    var valor21=parseInt(document.Ventas.productos.value);
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
