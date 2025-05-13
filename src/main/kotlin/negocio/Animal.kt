package negocio

import utilities.Sexo

open class Animal{
    var nombre: String=""
    var sexo: Sexo = Sexo.MACHO
    var sociable:Boolean=false
    var apadrinado:Boolean=false
    var edad:Int=0
    var solicitudes = mutableListOf<Solicitud>()
    constructor(){}
    constructor(
        sociable: Boolean,
        sexo: Sexo,
        nombre: String,
        edad: Int,
        apadrinado: Boolean
    ) {
        this.sociable = sociable
        this.sexo = sexo
        this.nombre = nombre
        this.edad = edad
        this.apadrinado = apadrinado
    }


    override fun toString(): String {
        return "$nombre,$sexo, $edad, sociable:$sociable, apadrinado:$apadrinado)"
    }

    fun checkCantidadSolicitudes():Int{
        return solicitudes.size
    }
    /**
     * De todos los animales interesará conocer su sexo (macho o hembra),
     * edad (en años), si son sociables con las personas y si están apadrinados.
     * En el caso de los perros, se necesita conocer su raza, tamaño (en kg),
     * si pertenecen a la categoría ppp (perros potencialmente peligrosos)
     * y si necesitan tratamiento para la enfermedad crónica leishmania.
     * En el caso de los gatos, interesa conocer si están esterilizados.
     */
}