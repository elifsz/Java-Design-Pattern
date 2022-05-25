

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class SquareImage implements BarImage {

    @Override
    public String createImage(String country) {
        return "square_image/" + country + ".png";
    }

}
