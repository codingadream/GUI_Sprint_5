module com.example.market {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.sos.game to javafx.fxml;
    exports com.sos.game;
}