package utilities

import bbdd.AnimalesDAOImp
import bbdd.PerrosDAO
import bbdd.PerrosDAOImpl
import negocio.Perro

object Factoria {
    fun cargarPerros():List<Perro>{
        return PerrosDAOImpl.getAllPerros()
    }
}