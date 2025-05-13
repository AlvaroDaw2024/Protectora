package negocio

import utilities.TipoSolicitud

class Solicitud {
    var email:String
    var tipo:TipoSolicitud

    constructor(email: String, tipo: TipoSolicitud) {
        this.email = email
        this.tipo = tipo
    }
}