package negocio

class ClinicaVeterinaria(
    val nombre:String,
    val telefono:Int,
    val precioEsterilizar:Double
) {
    override fun toString(): String {
        return "ClinicaVeterinaria(nombre='$nombre', telefono=$telefono, precioEsterilizar=$precioEsterilizar)"
    }
}