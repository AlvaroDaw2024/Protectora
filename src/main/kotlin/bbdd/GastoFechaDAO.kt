package bbdd

interface GastoFechaDAO {
    fun insertarGasto(gasto:Double):Boolean
}