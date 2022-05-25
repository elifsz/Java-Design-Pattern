

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class CircularImage implements BarImage {

    @Override
    public String createImage(String country) {
        return "circular_image/" + country + ".png";
    }

}
