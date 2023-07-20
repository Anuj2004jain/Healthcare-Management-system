module com.wellbiing.wellbiinghealthcare {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires jbcrypt;

    opens com.wellbiing.wellbiinghealthcare to javafx.fxml;
    exports com.wellbiing.wellbiinghealthcare;
}