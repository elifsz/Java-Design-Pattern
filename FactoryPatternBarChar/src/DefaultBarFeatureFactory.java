/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author elif
 */
public class DefaultBarFeatureFactory implements AbstractBarFeatureFactory {

    @Override
    public BarFont createBarFont() {
        return new BasicFont();
    }

    @Override
    public BarImage createBarImage() {
        return new SquareImage();
    }

}
