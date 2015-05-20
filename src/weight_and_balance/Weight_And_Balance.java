/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weight_and_balance;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Proprio
 */
public class Weight_And_Balance {

    /**
     * @param args the command line arguments
     */    
    public CubicCurve2D evaluate(CubicCurve2D v0,CubicCurve2D v1,float fraction)
    {
        double x1=v0.getX1() + ((v1.getX1() - v0.getX1()) * fraction);
        double y1=v0.getY1() + ((v1.getY1() - v0.getY1()) * fraction);
        double x2=v0.getX2() + ((v1.getX2() - v0.getX2()) * fraction);
        double y2=v0.getY2() + ((v1.getY2() - v0.getY2()) * fraction);
        double ctrlx1=v0.getCtrlX1() + ((v1.getCtrlX1() - v0.getCtrlX1()) * fraction);
        double ctrly1=v0.getCtrlY1() + ((v1.getCtrlY1() - v0.getCtrlY1()) * fraction);
        double ctrlx2=v0.getCtrlX2() + ((v1.getCtrlX2() - v0.getCtrlX2()) * fraction);
        double ctrly2=v0.getCtrlY2() + ((v1.getCtrlY2() - v0.getCtrlY2()) * fraction);
        CubicCurve2D value=(CubicCurve2D)v0.clone();
        value.setCurve(x1,y1,ctrlx1,ctrly1,ctrlx2,ctrly2,x2,y2);
        return value;
    }

    public static void main(String[] args) throws Exception 
    {
        CubicCurve2D c=new CubicCurve2D.Double(0,0,4,-4,-2,-4,2,0);
        Rectangle2D r=new Rectangle2D.Double(0.75,-2.5,0.5,2);
        if (c.contains(r)) 
        {
            throw new Exception("The rectangle should not be contained in the curve");
        }
    }
}
