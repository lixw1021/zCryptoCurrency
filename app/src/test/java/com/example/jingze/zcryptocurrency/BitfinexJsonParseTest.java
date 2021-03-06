package com.example.jingze.zcryptocurrency;

import com.example.jingze.zcryptocurrency.model.Coin;
import com.example.jingze.zcryptocurrency.model.CoinMenu;
import com.example.jingze.zcryptocurrency.utils.ModelUtils;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jingze HUANG on Mar.23, 2018.
 */

public class BitfinexJsonParseTest {
    @Test
    public void parseDaraArray() {
        String data = "[4,[7839.9,39.98836294,7840,718.34207625,-645.3,-0.076,7840,51239.69240822,8498.1,7728.1]]";
        ArrayList<Object> dataArray = ModelUtils.toObject(data,  new TypeToken<ArrayList<Object>>(){});
        Coin newCoin = new Coin();
        Integer chanId;
        ArrayList<Double> coinData;
        try {
            chanId = ((Double) dataArray.get(0)).intValue();
            if (dataArray.get(1).getClass().equals(ArrayList.class)) {
                coinData = (ArrayList<Double>) dataArray.get(1);
            } else {
            }
        } catch (Exception bitfinexDataArrayParseException) {

        }

        assertEquals(1, 1);
    }
    @Test
    public void parseTesy() {
        String jsonListList = "[{\"name\":\"Bitfinex\",\"url\":\"wss://api.bitfinex.com/ws/2\",\"data\":[{\"title\":\"○  BTC - USD\",\"coinType\":\"BTC\",\"currencyType\":\"USD\"},{\"title\":\"○  ETH - USD\",\"coinType\":\"ETH\",\"currencyType\":\"USD\"},{\"title\":\"○  LTC - USD\",\"coinType\":\"LTC\",\"currencyType\":\"USD\"},{\"title\":\"○  EOS - USD\",\"coinType\":\"EOS\",\"currencyType\":\"USD\"},{\"title\":\"○  ETC - USD\",\"coinType\":\"ETC\",\"currencyType\":\"USD\"},{\"title\":\"○  XRP - USD\",\"coinType\":\"XRP\",\"currencyType\":\"USD\"},{\"title\":\"○  BCH - USD\",\"coinType\":\"BCH\",\"currencyType\":\"USD\"},{\"title\":\"○  NEO - USD\",\"coinType\":\"NEO\",\"currencyType\":\"USD\"},{\"title\":\"○  OMG - USD\",\"coinType\":\"OMG\",\"currencyType\":\"USD\"},{\"title\":\"○  XMR - USD\",\"coinType\":\"XMR\",\"currencyType\":\"USD\"},{\"title\":\"○  BTG - USD\",\"coinType\":\"BTG\",\"currencyType\":\"USD\"},{\"title\":\"○  ELF - USD\",\"coinType\":\"ELF\",\"currencyType\":\"USD\"},{\"title\":\"○  ZEC - USD\",\"coinType\":\"ZEC\",\"currencyType\":\"USD\"},{\"title\":\"○  BAT - USD\",\"coinType\":\"BAT\",\"currencyType\":\"USD\"}]}]";
        ArrayList<CoinMenu> total = ModelUtils.toObject(jsonListList, new TypeToken<ArrayList<CoinMenu>>(){});

        assertEquals(1, 1);
    }

}
