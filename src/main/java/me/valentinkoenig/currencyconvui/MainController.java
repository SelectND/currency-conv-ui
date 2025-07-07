package me.valentinkoenig.currencyconvui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MainController {
    public String baseCurrency;
    public String targetCurrency;
    public double baseCurrencyAmount;
    public double targetCurrencyAmount;

    @FXML
    public TextField BaseCurrencyAmount;

    @FXML
    public ChoiceBox BaseChoiceBox;

    @FXML
    public TextField TargetCurrencyAmount;

    @FXML
    public ChoiceBox TargetChoiceBox;

    @FXML
    public void initialize() {
        BaseChoiceBox.setValue(BaseChoiceBox.getItems().getFirst());
        TargetChoiceBox.setValue(TargetChoiceBox.getItems().get(1));

        if (BaseChoiceBox.getSelectionModel().getSelectedItem() != null) {
            baseCurrency = BaseChoiceBox.getSelectionModel().getSelectedItem().toString();
        }

        if (TargetChoiceBox.getSelectionModel().getSelectedItem() != null) {
            targetCurrency = TargetChoiceBox.getSelectionModel().getSelectedItem().toString();
        }


    }

    @FXML
    public void baseCurrencyChosen(ActionEvent actionEvent) {
        if (BaseChoiceBox.getSelectionModel().getSelectedItem() != null) {
            baseCurrency = BaseChoiceBox.getSelectionModel().getSelectedItem().toString();
        }
    }

    @FXML
    public void targetCurrencyChosen(ActionEvent actionEvent) {
        if (TargetChoiceBox.getSelectionModel().getSelectedItem() != null) {
            targetCurrency = TargetChoiceBox.getSelectionModel().getSelectedItem().toString();
        }

    }

    @FXML
    public void startConversion(ActionEvent actionEvent) {
        String baseCurrencyAmountText = BaseCurrencyAmount.getText();
        if(!baseCurrencyAmountText.isEmpty()) {
            try {
                double baseCurrencyAmount = Double.parseDouble(baseCurrencyAmountText);
                CurrencyRequest currencyRequest =  new CurrencyRequest();
                currencyRequest.setBaseCurrency(baseCurrency);
                currencyRequest.setTargetCurrency(targetCurrency);
                currencyRequest.setBaseAmount(baseCurrencyAmount);
                double exchangeRate = currencyRequest.makeRequest();
                TargetCurrencyAmount.setText(String.valueOf(exchangeRate*currencyRequest.getBaseAmount()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}