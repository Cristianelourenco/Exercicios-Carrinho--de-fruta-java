module com.example.carrinhodefrutajava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.carrinhodefrutajava to javafx.fxml;
    exports com.example.carrinhodefrutajava;
}