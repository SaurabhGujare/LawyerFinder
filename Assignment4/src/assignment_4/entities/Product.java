/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author Akshay, Ninad, Saurabh
 */
public class Product {

    private final int productId;
    private int min,max,target;

    public Product(int productId, int min, int max, int target) {
        this.productId = productId;
        this.min = min;
        this.max = max;
        this.target = target;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }
    
    
}
