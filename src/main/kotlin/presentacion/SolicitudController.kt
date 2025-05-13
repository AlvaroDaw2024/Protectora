package presentacion

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.ComboBox
import javafx.scene.control.RadioButton
import javafx.scene.control.TextField
import javafx.scene.control.ToggleGroup

class SolicitudController {


    @FXML
    private lateinit var adoptar: ToggleGroup

    @FXML
    private lateinit var animales: ToggleGroup

    @FXML
    private lateinit var btnEnviar: Button

    @FXML
    private lateinit var comboAnimales: ComboBox<Any>

    @FXML
    private lateinit var radioAcoger: RadioButton

    @FXML
    private lateinit var radioAdoptar: RadioButton

    @FXML
    private lateinit var radioGatos: RadioButton

    @FXML
    private lateinit var radioPerros: RadioButton

    @FXML
    private lateinit var txtEmail: TextField

    @FXML
    fun onPressedEnviar(event: ActionEvent) {

    }

    @FXML
    fun onSelectedAcoger(event: ActionEvent) {

    }

    @FXML
    fun onSelectedAnimal(event: ActionEvent) {

    }

    @FXML
    fun onSelectedGatos(event: ActionEvent) {

    }

    @FXML
    fun onSelectedPerros(event: ActionEvent) {

    }

}
