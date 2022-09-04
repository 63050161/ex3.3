/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;

/**
 *
 * @author HP
 */

import java.util.ArrayList;

public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private String updateData;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }

    public void setUpdateData(String updateData) {
        this.updateData = updateData;
        notifyObservers();
    }
    
    public String getUpdateData() {
        return updateData;
    }
    
    @Override
    public void notifyObservers() {
        for(int i=0;i<list.size();i++){
        list.get(i).update(this);
        }
    }

    @Override
    public void register(MyObserver observer) {
        list.add(observer);
    }   
}
