/*PROBLEMA 3 */
function validar(e){
    var teclado3 = (document.all)?e.keyCode:e.which;
    if(teclado3==8)return true;

    var patron3=/[0-9\d .]/;

    var prueba3= String.fromCharCode(teclado3);
    return patron3.test(prueba3);
}

function descuento(){
    var nota=parseInt(document.supermercado.precio.value);
    preciofinal=nota*.85;
    document.supermercado.costo.value="$"+preciofinal;
}

function borrar1(){
    document.supermercado.costo.value="";
    document.supermercado.precio.value="";
}

/*PROBLEMA 4 */

function calcularpromedio(){
    var parcial1=parseInt(document.calificaciones.calificacion1.value);
    var parcial2=parseInt(document.calificaciones.calificacion2.value);
    var parcial3=parseInt(document.calificaciones.calificacion3.value);
    p=parcial1+parcial2+parcial3;
    x=(p*10)/30
    criterio1=x*.55;

    var examenfinal=parseInt(document.calificaciones.examenf.value);
    criterio2=examenfinal*.3;

    var trabajofinal=parseInt(document.calificaciones.trabajof.value);
    criterio3=trabajofinal*.15;

    promediofinal=criterio1+criterio2+criterio3;
    document.calificaciones.promedio.value=promediofinal;
}

function borrar(){
    document.calificaciones.calificacion1.value="";
    document.calificaciones.calificacion2.value="";
    document.calificaciones.calificacion3.value="";
    document.calificaciones.examenf.value="";
    document.calificaciones.trabajof.value="";
    document.calificaciones.promedio.value="";
}
