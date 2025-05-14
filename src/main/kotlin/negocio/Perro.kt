package negocio

import utilities.Constantes
import utilities.Sexo

class Perro:Animal {
    var raza: String=""
    var peso: Int=0
    var ppp: Boolean=false
    var leishmania: Boolean=false
    constructor() {}

    constructor(
        sociable: Boolean,
        sexo: Sexo,
        nombre: String,
        edad: Int,
        apadrinado: Boolean,
        leishmani: Boolean,
        peso: Int,
        ppp: Boolean,
        raza: String
    ) : super(sociable, sexo, nombre, edad, apadrinado) {
        this.leishmania = leishmani
        this.peso = peso
        this.ppp = ppp
        this.raza = raza
    }


    override fun toString(): String {
        return "${super.toString()}, leishmania:$leishmania,'$raza', peso:$peso, ppp:$ppp"
    }

    override fun calculoGastosAnual(): Int {
        var gastos= 0
        if (!apadrinado){
            gastos+=Constantes.COSTE_RABIA_ANUAL
            if (ppp && !sociable){
                gastos+=Constantes.COSTE_SEDACION_PPP
            }
            if (leishmania){
                gastos+=Constantes.COSTE_LEISHMANIA_MENSUAL*12
            }
        }


        return gastos
    }
    fun calcularCantidadPienso(perro: Perro):Double{
        var edadEnMeses:Int = edad*12
        var pienso=0.0
        if (edadEnMeses>18){
            when(peso){
                in Constantes.PESO_PERRO_PEQUEÑO ->{
                    pienso+=200
                }
                in Constantes.PESO_PERRO_MEDIANO ->{
                    pienso+=300
                }
                in Constantes.PESO_PERRO_GRANDE->{
                    pienso+= (peso*1000)*0.015
                }
            }
        }
        return pienso
    }

}