package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    CurrencyType currencyType;

    public SingaporeDollar() {
        this.currencyType = CurrencyType.SINGAPORE_DOLLAR;
    }

    @Override
    public Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.currencyType.getRate();
    }

    @Override
    public CurrencyType getTypeOfCurrency() {
        return currencyType;
    }
}
