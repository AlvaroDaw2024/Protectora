package negocio

import utilities.Constantes
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

    override fun calculoGastosAnual(): Int {
        var gastos = 0
        if (!apadrinado){
            if (!checkHembraEsterilizada()){
                gastos+=Constantes.COSTE_CONTROL_CELO_GATA_MENSUAL*12
            }
        }
        return gastos
    }
}