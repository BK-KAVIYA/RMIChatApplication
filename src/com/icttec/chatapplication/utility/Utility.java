
package com.icttec.chatapplication.utility;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author KA VI YA
 */
public class Utility {
    public ImageIcon toImageIcon(byte[] img) {
        BufferedImage Imgavatar;
        ImageIcon avatar = null;
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(img);
            Imgavatar = ImageIO.read(bis);
            if (Imgavatar != null) {
                avatar = new ImageIcon(Imgavatar);
            }
        } catch (IOException ex) {
            System.out.println("Error occor"+ex.getMessage());
        }
        return avatar;
    }
    
    public BufferedImage ImageIconToBufferedImage(ImageIcon icon) {
        BufferedImage bufferedImage = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.createGraphics();
        // paint the Icon to the BufferedImage.
        icon.paintIcon(null, g, 0, 0);
        g.dispose();

        return bufferedImage;
    }
}
