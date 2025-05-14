package presentacion

import bbdd.AnimalesDAOImp
import bbdd.GastoFechaImpl
import javafx.collections.FXCollections
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import javafx.stage.Stage
import negocio.Animal
import negocio.CantidadKG
import utilities.Constantes

class VentanaPrincipalController {

    @FXML
    private lateinit var btnSelectAnimales: Button

    @FXML
    private lateinit var txtAnimales: TextArea

    @FXML
    fun onPressedVerAnimales(event: ActionEvent) {
        var texto = AnimalesDAOImp.getAllAnimales().joinToString ("\n"){ it.toString() }
        if (texto.isNotBlank()){
            txtAnimales.text = texto
        }else{
            txtAnimales.text = Constantes.NO_RESULTADO
        }
    }
    @FXML
    fun onPressedAdoptar(event: ActionEvent) {
        try {
            val loader =
                FXMLLoader(
                    VentanaPrincipalController::class.java.getResource
                        ("/com/example/solicitud-view.fxml")
                )
            val root: Parent = loader.load()
            val stage = Stage()
            stage.title = "Adopcion/Acogida"
            stage.scene = Scene(root)
            stage.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    @FXML
    fun onPressedCalculoCostes(event: ActionEvent) {
        var animales = cargarAnimales()
        var gastos = 0.0
        animales.forEach{
            gastos+=it.calculoGastosAnual()
            println("${it.returnName()} nos cuesta: ${it.calculoGastosAnual()} anuales")
        }
        println("Tenemos actualmente ${animales.size} animales en el refugio y el coste anual de " +
                "tenerlos es $gastos euros")
        if (GastoFechaImpl.insertarGasto(gastos)){
            println("Update correcto")
        }else{
            println("Algo ha salido mal")
        }

    }

    @FXML
    fun onPressedPienso(event: ActionEvent) {
        var pienso = CantidadKG.calcularCantidadPienso()
        println("Hace falta un total de $pienso KGs de pienso por " +
                "dia, ergo esta semana necesitaremos ${pienso * 7} KGs")
    }
    fun cargarAnimales():List<Animal>{
        return AnimalesDAOImp.getAllAnimales()
    }
}