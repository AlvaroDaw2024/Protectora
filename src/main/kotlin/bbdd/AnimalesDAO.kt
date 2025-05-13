package bbdd

import negocio.Animal

interface AnimalesDAO {
    fun getAllAnimales():List<Animal>
    fun getAnimalNombre(nombre:String):Animal?
    fun insertAnimal():Boolean
    fun updateAnimal():Boolean
    fun deleteAnimal():Boolean
}