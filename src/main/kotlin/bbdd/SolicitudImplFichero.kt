package bbdd

import utilities.TipoSolicitud
import java.io.File

object SolicitudImplFichero : SolicitudDAO {

    override fun solicitudAnimal(
        nombreAnimal: String,
        email: String,
        tipoSolicitud: TipoSolicitud
    ) {
        val archivo = File("src/main/kotlin/solicitudes/{$nombreAnimal}.txt")
        val linea = "$email,${tipoSolicitud}\n"
        try {
            archivo.appendText(linea)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }
}