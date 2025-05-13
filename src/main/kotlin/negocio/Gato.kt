package negocio

import utilities.Sexo

class Gato: Animal {
    var esterilizado:Boolean=false

    constructor(
        sociable: Boolean,
        sexo: Sexo,
        nombre: String,
        edad: Int,
        apadrinado: Boolean,
        esterilizado: Boolean
    ) : super(sociable, sexo, nombre, edad, apadrinado) {
        this.esterilizado = esterilizado
    }
    constructor()

    override fun toString(): String {
        return "${super.toString()}, esterilizado=$esterilizado"
    }

    fun checkHembraEsterilizada():Boolean{
        var esterilizado = true
        if (this.sexo == Sexo.HEMBRA){
            esterilizado = this.esterilizado
        }
        return esterilizado
    }
}