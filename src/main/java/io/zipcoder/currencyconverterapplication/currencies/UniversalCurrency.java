package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class UniversalCurrency implements ConvertableCurrency {
    public CurrencyType currencyType;

//    Constructor sets the currency type of new instances of UniversalCurrency to UNIVERSAL_CURRENCY.
    public UniversalCurrency() {
        this.currencyType = CurrencyType.UNIVERSAL_CURRENCY;
    }

//    currencyType param = currency to convert to.
//    divides the rate of the param currency type by the rate of Universal Currency
    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.currencyType.getRate();
    }

//    returns the currency type of Universal currency
    @Override
    public CurrencyType getTypeOfCurrency() {
        return currencyType;
    }
}
