/*PROBLEMA 5 */
function validar(e){
    var teclado3 = (document.all)?e.keyCode:e.which;
    if(teclado3==8)return true;

    var patron3=/[0-9\d .]/;

    var prueba3= String.fromCharCode(teclado3);
    return patron3.test(prueba3);
}


function calcularedad(){
    var años=parseInt(document.edad.año.value);
    var meses=parseInt(document.edad.mes.value);
    var dias=parseInt(document.edad.dia.value);

    /*OBTENEMOS LA FECHA DE HOY */
    var f=new Date();
    dia_actual=parseInt(f.getDate());
    mes_actual=parseInt(f.getMonth()+1);
    año_actual=parseInt(f.getFullYear());


    /*CALCULAMOS LA EDAD */
    while(dia_actual<dias){
        dia_actual+=30;
        mes_actual-=1;
    }
    var diadif=dia_actual-dias;

    while(mes_actual<meses){
        mes_actual+=12;
        año_actual-=1;
    }
    var mesdif=mes_actual-meses;

    var añodif=año_actual-años;

    document.edad.edads.value=añodif+ " años "+ mesdif +" meses y "+ diadif + " dias";
}

function borrar(){
    document.edad.año.value="";
    document.edad.mes.value="";
    document.edad.dia.value="";
    document.edad.edads.value="";
}


/*PROBLEMA 6 */

function porcentajes(){
    var no_hombres=parseInt(document.grupo.hombres.value);
    var no_mujeres=parseInt(document.grupo.mujeres.value);

    total_alumnos=no_hombres+no_mujeres

    var porcentaje_hombres=(no_hombres*100)/total_alumnos;
    var porcentaje_mujeres=(no_mujeres*100)/total_alumnos;

    document.grupo.hom.value=porcentaje_hombres+"%";
    document.grupo.muj.value=porcentaje_mujeres+"%";

}

function borrar2(){
    document.grupo.hombres.value="";
    document.grupo.mujeres.value="";
    document.grupo.hom.value="";
    document.grupo.muj.value="";
}



