module com.example.laboration3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.laboration3 to javafx.fxml;
    exports com.example.laboration3;
}