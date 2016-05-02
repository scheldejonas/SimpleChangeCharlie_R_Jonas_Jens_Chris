/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.drug;

import model.BaseDrug;
import model.drug.pricestrategy.PickOneOfTen;

/**
 *
 * @author CHRIS
 */
public class AngelDust extends BaseDrug {
    
    public AngelDust(int price, int amount) {
        super(price, amount);
        super.setPriceStrategy( new PickOneOfTen() );
    }
    
    @Override
    public String getName() {
        return "Angel Dust";
    }

}

