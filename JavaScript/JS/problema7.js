
/*PROBLEMA 7 */
function validar(e){
    var teclado3 = (document.all)?e.keyCode:e.which;
    if(teclado3==8)return true;

    var patron3=/[0-9\d .]/;

    var prueba3= String.fromCharCode(teclado3);
    return patron3.test(prueba3);
}

function calcular(){
    var num1=parseInt(document.Numeros.nu1.value);
    var num2=parseInt(document.Numeros.nu2.value);

    if( isNaN(num1) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( isNaN(num2) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( num1>37200000000000 || num2>37200000000000){
        alert("Ni el vaticano tiene tanto dinero xd. Ingresa algo valido")
        return false;
    }


    var resultado

    if(num1==num2){
        resultado=num1*num2;
    }

    if(num1>num2){
        resultado=num1-num2;
    }

    if(num1<num2){
        resultado=num1+num2;
    }

    document.Numeros.resultadofinal.value=resultado;
}


function borrar(){
    document.Numeros.nu1.value="";
    document.Numeros.nu2.value="";
    document.Numeros.resultadofinal.value="";
}


/*PROBLEMA 8 */


function mayor(){
    var numero1=parseInt(document.NumeroMayor.nume1.value);
    var numero2=parseInt(document.NumeroMayor.nume2.value);
    var numero3=parseInt(document.NumeroMayor.nume3.value);

    if( isNaN(numero1) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( isNaN(numero2) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( isNaN(numero3) ) {
        alert("NO ME MATE, TENGO HIJOOOOS :(((((")
        return false;
    }

    if( numero1>37200000000000 || numero2>37200000000000 || numero3>37200000000000){
        alert("Ni el vaticano tiene tanto dinero xd. Ingresa algo valido")
        return false;
    }
    
    var num_mayor=0;

    if(numero1==numero2 && numero2==numero3){
        num_mayor="Son iguales xd";
    }

    var miarray=[numero1,numero2,numero3];
    for(i=0;i<miarray.length;i++){
        if(miarray[i]>num_mayor){
            num_mayor=miarray[i];
        }
    }

    document.NumeroMayor.result.value=num_mayor;
}

function borrar2(){
    document.NumeroMayor.nume1.value="";
    document.NumeroMayor.nume2.value="";
    document.NumeroMayor.nume3.value="";
    document.NumeroMayor.result.value="";

}