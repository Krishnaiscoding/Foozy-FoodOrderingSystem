/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FF_SERVICE;

/**
 *
 * @author hi
 */
public class Addaction {
    public double hotdog;
    public double steak;
    public double hamburger;
    public double pizza;
    
    public double mojito;
    public double milkshake;
    public double cappuccino;
    public double icetea;
    
    double foodprice;
    double fluidprice;
    double sum;
    
    public double Sum(){
        foodprice = hotdog + steak + hamburger + pizza;
        fluidprice = mojito + milkshake + cappuccino + icetea;
        return foodprice + fluidprice;
    }
    
    public double chotdog = 10.0;
    public double csteak = 100.0;
    public double chamburger = 92.0;
    public double cpizza = 110.0;
    
    public double cmojito = 90.0;
    public double cmilkshake = 120.0;
    public double ccappuccino = 90.0;
    public double cicetea = 60.0;
    
    
    
}
