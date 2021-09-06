module com.example.calculadora_interfaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadora_interfaz to javafx.fxml;
    exports com.example.calculadora_interfaz;
}