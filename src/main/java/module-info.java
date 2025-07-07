module me.valentinkoenig.currencyconvui {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json.chargebee;


    opens me.valentinkoenig.currencyconvui to javafx.fxml;
    exports me.valentinkoenig.currencyconvui;
}