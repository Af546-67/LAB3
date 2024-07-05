module com.aashish.hrmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.aashish.hrmanagement to javafx.fxml;
    exports com.aashish.hrmanagement;
}