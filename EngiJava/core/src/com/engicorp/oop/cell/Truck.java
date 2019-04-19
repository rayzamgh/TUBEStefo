package com.engicorp.oop.cell;

import com.engicorp.oop.cell.Facility;
import com.engicorp.oop.misc.Point;

class Truck extends Facility {
    public Truck(Point pos) {
        super(pos, "T");
    }

    @Override
    public void interact() {
//        int money = Player.getInstance().getMoney();
//        LinkedList<Product> tas = Player.getInstance().getTas();
//        while(tas != null)
//        {
//            money += tas.getIsi().getPrice();
//            tas = tas.getNext();
//        }
//        Player.getInstance().setMoney(money);
//        Player.getInstance().removeTas();
//        Player.getInstance().makeTas();
    }

}