package presentacion

import bbdd.AnimalesDAOImp
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import javafx.stage.Stage
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

}