package bbdd

import utilities.TipoSolicitud

interface SolicitudDAO {
    fun solicitudAnimal(nombreAnimal:String,email:String,tipoSolicitud: TipoSolicitud)
}