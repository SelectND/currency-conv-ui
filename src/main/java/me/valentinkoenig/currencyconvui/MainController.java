package me.valentinkoenig.currencyconvui;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class MainController {
    public String baseCurrency;
    public String targetCurrency;

    @FXML
    public TextField BaseCurrencyAmount;

    @FXML
    public ChoiceBox<String> BaseChoiceBox;

    @FXML
    public TextField TargetCurrencyAmount;

    @FXML
    public ChoiceBox<String> TargetChoiceBox;

    @FXML
    public void initialize() {
        BaseChoiceBox.setValue(BaseChoiceBox.getItems().getFirst());
        TargetChoiceBox.setValue(TargetChoiceBox.getItems().get(1));
        System.out.println("BaseCurrencyAmount: " + TargetChoiceBox.getItems().getFirst().getClass());

        if (BaseChoiceBox.getSelectionModel().getSelectedItem() != null) {
            baseCurrency = BaseChoiceBox.getSelectionModel().getSelectedItem();
        }

        if (TargetChoiceBox.getSelectionModel().getSelectedItem() != null) {
            targetCurrency = TargetChoiceBox.getSelectionModel().getSelectedItem();
        }


    }

    @FXML
    public void baseCurrencyChosen() {
        if (BaseChoiceBox.getSelectionModel().getSelectedItem() != null) {
            baseCurrency = BaseChoiceBox.getSelectionModel().getSelectedItem();
        }
    }

    @FXML
    public void targetCurrencyChosen() {
        if (TargetChoiceBox.getSelectionModel().getSelectedItem() != null) {
            targetCurrency = TargetChoiceBox.getSelectionModel().getSelectedItem();
        }

    }

    @FXML
    public void startConversion() {
        String baseCurrencyAmountText = BaseCurrencyAmount.getText();
        if(!baseCurrencyAmountText.isEmpty()) {
            try {
                double baseCurrencyAmount = Double.parseDouble(baseCurrencyAmountText);
                CurrencyRequest currencyRequest =  new CurrencyRequest();
                currencyRequest.setBaseCurrency(baseCurrency);
                currencyRequest.setTargetCurrency(targetCurrency);
                currencyRequest.setBaseAmount(baseCurrencyAmount);
                double targetCurrencyAmount = currencyRequest.makeRequest();
                TargetCurrencyAmount.setText(String.valueOf(targetCurrencyAmount));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }
}