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

    if( isNaN(años) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }

    if(años<1920){
        alert("Quionda, Tutankamon ")
        return false;
    }

    if( isNaN(meses) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }

    if(meses<0 || meses>12){
        alert("Tu planeta tiene mas de 12 meses? xd")
        return false;
    }

    if( isNaN(dias) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
      }

    if(dias<0 || dias>31){
        alert("Tu planeta tiene mas de 30 dias? :0")
        return false;
    }

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

    if( isNaN(no_hombres) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( isNaN(no_mujeres) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }


    if(no_mujeres>100 || no_hombres>100){
        alert("Psss de cuanto mide el salon? xd")
        return false;
    }

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



