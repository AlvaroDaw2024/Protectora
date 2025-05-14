package bbdd

import negocio.Perro

interface PerrosDAO {
    fun getAllPerros():List<Perro>
}