/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loundry;

import View.*;
import database.Koneksi;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Loundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException {
        new Tampilan_awal().setVisible(true);
    }
}
