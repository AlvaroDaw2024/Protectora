package negocio

import utilities.Sexo

class Perro:Animal {
    var raza: String=""
    var peso: Double=0.0
    var ppp: Boolean=false
    var leishmani: Boolean=false
    constructor() {}

    constructor(
        sociable: Boolean,
        sexo: Sexo,
        nombre: String,
        edad: Int,
        apadrinado: Boolean,
        leishmani: Boolean,
        peso: Double,
        ppp: Boolean,
        raza: String
    ) : super(sociable, sexo, nombre, edad, apadrinado) {
        this.leishmani = leishmani
        this.peso = peso
        this.ppp = ppp
        this.raza = raza
    }


    override fun toString(): String {
        return "${super.toString()}, leishmani:$leishmani,'$raza',$peso, ppp:$ppp"
    }


}