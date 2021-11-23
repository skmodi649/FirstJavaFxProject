module com.example.firstjavafxproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.firstjavafxproject to javafx.fxml;
    exports com.example.firstjavafxproject;
}