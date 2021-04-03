function validar(e){
    var teclado3 = (document.all)?e.keyCode:e.which;
    if(teclado3==8)return true;

    var patron3=/[0-9\d .]/;

    var prueba3= String.fromCharCode(teclado3);
    return patron3.test(prueba3);
}

/*PROBLEMA 9*/
function sueldos(){
    var precio=parseInt(document.HorasExtra.sueldo_hora.value);
    var horas=parseInt(document.HorasExtra.horas.value);
    var sueldo2;

    var he;
    if(horas<=40){
        sueldo2=horas*precio;
    }

    if(horas>40){
        he=horas-40;
        sueldo2=(horas*precio)+(he*precio+precio);
        if(he>=8){
            var he2
            he2=he-8;
            sueldo2=(horas*precio)+(he*precio+precio)+(he2*precio+precio+precio);
        }
    }

    document.HorasExtra.sueldo.value="$"+sueldo2;
}

function borrar(){
    document.HorasExtra.sueldo_hora.value="";
    document.HorasExtra.horas.value="";
    document.HorasExtra.sueldo.value="";
}


/*PROBLEMA 10 */

function utilidads(){
    var sueldos=parseInt(document.utilidad.sueldo.value);
    var años=parseInt(document.utilidad.años.value);

    if(años<1){
        sueldofinal=sueldos*1.05;
    }

    if(años>1 && años<2){
        sueldofinal=sueldos*1.07;
    }

    if(años>2 && años<5){
        sueldofinal=sueldos*1.1;
    }

    if(años>5 && años<10){
        sueldofinal=sueldos*1.15;
    }

    if(años>10){
        sueldofinal=sueldos*1.2;
    }

    document.utilidad.sueldoX.value="$"+sueldofinal;
}

function borrar2(){
    document.utilidad.sueldo.value  ="";
    document.utilidad.años.value="";
    document.utilidad.sueldoX.value="";
}